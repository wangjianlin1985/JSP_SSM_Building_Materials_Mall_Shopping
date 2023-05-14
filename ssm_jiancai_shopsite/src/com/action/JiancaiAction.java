// 
// Decompiled by Procyon v0.5.29
// 

package com.action;

import java.util.ArrayList;
import com.util.PageHelper;
import com.entity.Jiancai;
import com.entity.Cate;
import java.util.List;
import com.service.CateService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import com.service.JiancaiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = { "/jiancai" }, produces = { "text/plain;charset=utf-8" })
public class JiancaiAction extends BaseAction
{
    @Autowired
    @Resource
    private JiancaiService jiancaiService;
    @Autowired
    @Resource
    private CateService cateService;
    
    @RequestMapping({ "createJiancai.action" })
    public String createJiancai() {
        final List<Cate> cateList = this.cateService.getAllCate();
        this.getRequest().setAttribute("cateList", (Object)cateList);
        return "admin/addjiancai";
    }
    
    @RequestMapping({ "addJiancai.action" })
    public String addJiancai(final Jiancai jiancai) {
        jiancai.setHits("0");
        jiancai.setSellnum("0");
        this.jiancaiService.insertJiancai(jiancai);
        return "redirect:/jiancai/createJiancai.action";
    }
    
    @RequestMapping({ "deleteJiancai.action" })
    public String deleteJiancai(final String id) {
        this.jiancaiService.deleteJiancai(id);
        return "redirect:/jiancai/getAllJiancai.action";
    }
    
    @RequestMapping({ "deleteJiancaiByIds.action" })
    public String deleteJiancaiByIds() {
        final String[] ids = this.getRequest().getParameterValues("jiancaiid");
        String[] array;
        for (int length = (array = ids).length, i = 0; i < length; ++i) {
            final String jiancaiid = array[i];
            this.jiancaiService.deleteJiancai(jiancaiid);
        }
        return "redirect:/jiancai/getAllJiancai.action";
    }
    
    @RequestMapping({ "updateJiancai.action" })
    public String updateJiancai(final Jiancai jiancai) {
        this.jiancaiService.updateJiancai(jiancai);
        return "redirect:/jiancai/getAllJiancai.action";
    }
    
    @RequestMapping({ "getAllJiancai.action" })
    public String getAllJiancai(final String number) {
        final List<Jiancai> jiancaiList = this.jiancaiService.getAllJiancai();
        PageHelper.getPage(jiancaiList, "jiancai", null, null, 10, number, this.getRequest(), null);
        return "admin/listjiancai";
    }
    
    @RequestMapping({ "queryJiancaiByCond.action" })
    public String queryJiancaiByCond(String cond, String name, final String number) {
        final Jiancai jiancai = new Jiancai();
        if (cond != null) {
            if ("jiancainame".equals(cond)) {
                jiancai.setJiancainame(name);
            }
            if ("image".equals(cond)) {
                jiancai.setImage(name);
            }
            if ("cateid".equals(cond)) {
                jiancai.setCatename(name);
            }
            if ("price".equals(cond)) {
                jiancai.setPrice(name);
            }
            if ("recommend".equals(cond)) {
                jiancai.setRecommend(name);
            }
            if ("thestart".equals(cond)) {
                jiancai.setThestart(name);
            }
            if ("theend".equals(cond)) {
                jiancai.setTheend(name);
            }
            if ("hits".equals(cond)) {
                jiancai.setHits(name);
            }
            if ("sellnum".equals(cond)) {
                jiancai.setSellnum(name);
            }
            if ("contents".equals(cond)) {
                jiancai.setContents(name);
            }
        }
        final List<String> nameList = new ArrayList<String>();
        final List<String> valueList = new ArrayList<String>();
        nameList.add(cond);
        valueList.add(name);
        PageHelper.getPage(this.jiancaiService.getJiancaiByLike(jiancai), "jiancai", nameList, valueList, 10, number, this.getRequest(), "query");
        name = null;
        cond = null;
        return "admin/queryjiancai";
    }
    
    @RequestMapping({ "getJiancaiById.action" })
    public String getJiancaiById(final String id) {
        final Jiancai jiancai = this.jiancaiService.getJiancaiById(id);
        this.getRequest().setAttribute("jiancai", (Object)jiancai);
        final List<Cate> cateList = this.cateService.getAllCate();
        this.getRequest().setAttribute("cateList", (Object)cateList);
        return "admin/editjiancai";
    }
    
    public JiancaiService getJiancaiService() {
        return this.jiancaiService;
    }
    
    public void setJiancaiService(final JiancaiService jiancaiService) {
        this.jiancaiService = jiancaiService;
    }
}
