// 
// Decompiled by Procyon v0.5.29
// 

package com.action;

import java.util.ArrayList;
import com.util.PageHelper;
import com.entity.Peihuo;
import com.entity.City;
import java.util.List;
import com.service.CityService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import com.service.PeihuoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = { "/peihuo" }, produces = { "text/plain;charset=utf-8" })
public class PeihuoAction extends BaseAction
{
    @Autowired
    @Resource
    private PeihuoService peihuoService;
    @Autowired
    @Resource
    private CityService cityService;
    
    @RequestMapping({ "createPeihuo.action" })
    public String createPeihuo() {
        final List<City> cityList = this.cityService.getAllCity();
        this.getRequest().setAttribute("cityList", (Object)cityList);
        return "admin/addpeihuo";
    }
    
    @RequestMapping({ "addPeihuo.action" })
    public String addPeihuo(final Peihuo peihuo) {
        this.peihuoService.insertPeihuo(peihuo);
        return "redirect:/peihuo/createPeihuo.action";
    }
    
    @RequestMapping({ "deletePeihuo.action" })
    public String deletePeihuo(final String id) {
        this.peihuoService.deletePeihuo(id);
        return "redirect:/peihuo/getAllPeihuo.action";
    }
    
    @RequestMapping({ "deletePeihuoByIds.action" })
    public String deletePeihuoByIds() {
        final String[] ids = this.getRequest().getParameterValues("peihuoid");
        String[] array;
        for (int length = (array = ids).length, i = 0; i < length; ++i) {
            final String peihuoid = array[i];
            this.peihuoService.deletePeihuo(peihuoid);
        }
        return "redirect:/peihuo/getAllPeihuo.action";
    }
    
    @RequestMapping({ "updatePeihuo.action" })
    public String updatePeihuo(final Peihuo peihuo) {
        this.peihuoService.updatePeihuo(peihuo);
        return "redirect:/peihuo/getAllPeihuo.action";
    }
    
    @RequestMapping({ "getAllPeihuo.action" })
    public String getAllPeihuo(final String number) {
        final List<Peihuo> peihuoList = this.peihuoService.getAllPeihuo();
        PageHelper.getPage(peihuoList, "peihuo", null, null, 10, number, this.getRequest(), null);
        return "admin/listpeihuo";
    }
    
    @RequestMapping({ "getNetWork.action" })
    public String getNetWork(final String number) {
        final List<Peihuo> peihuoList = this.peihuoService.getAllPeihuo();
        PageHelper.getPage(peihuoList, "peihuo", null, null, 10, number, this.getRequest(), null);
        return "users/network";
    }
    
    @RequestMapping({ "queryPeihuoByCond.action" })
    public String queryPeihuoByCond(String cond, String name, final String number) {
        final Peihuo peihuo = new Peihuo();
        if (cond != null) {
            if ("peihuoname".equals(cond)) {
                peihuo.setPeihuoname(name);
            }
            if ("cityid".equals(cond)) {
                peihuo.setCityname(name);
            }
            if ("address".equals(cond)) {
                peihuo.setAddress(name);
            }
            if ("contact".equals(cond)) {
                peihuo.setContact(name);
            }
            if ("memo".equals(cond)) {
                peihuo.setMemo(name);
            }
        }
        final List<String> nameList = new ArrayList<String>();
        final List<String> valueList = new ArrayList<String>();
        nameList.add(cond);
        valueList.add(name);
        PageHelper.getPage(this.peihuoService.getPeihuoByLike(peihuo), "peihuo", nameList, valueList, 10, number, this.getRequest(), "query");
        name = null;
        cond = null;
        return "admin/querypeihuo";
    }
    
    @RequestMapping({ "getPeihuoById.action" })
    public String getPeihuoById(final String id) {
        final Peihuo peihuo = this.peihuoService.getPeihuoById(id);
        this.getRequest().setAttribute("peihuo", (Object)peihuo);
        final List<City> cityList = this.cityService.getAllCity();
        this.getRequest().setAttribute("cityList", (Object)cityList);
        return "admin/editpeihuo";
    }
    
    public PeihuoService getPeihuoService() {
        return this.peihuoService;
    }
    
    public void setPeihuoService(final PeihuoService peihuoService) {
        this.peihuoService = peihuoService;
    }
}
