// 
// Decompiled by Procyon v0.5.29
// 

package com.action;

import org.springframework.web.bind.annotation.ResponseBody;
import org.json.JSONException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;
import com.entity.Peihuo;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import com.service.PeihuoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = { "/ajax" }, produces = { "text/plain;charset=utf-8" })
public class AjaxAction extends BaseAction
{
    @Autowired
    @Resource
    private PeihuoService peihuoService;
    
    @RequestMapping({ "getPeihuo.action" })
    @ResponseBody
    public String getPeihuo() throws JSONException {
        final String cityid = this.getRequest().getParameter("cityid");
        final Peihuo peihuo = new Peihuo();
        peihuo.setCityid(cityid);
        final List<Peihuo> peihuoList = this.peihuoService.getPeihuoByCond(peihuo);
        final JSONArray peihuoid = new JSONArray();
        final JSONArray peihuoname = new JSONArray();
        for (final Peihuo c : peihuoList) {
            peihuoid.put((Object)c.getPeihuoid());
            peihuoname.put((Object)c.getPeihuoname());
        }
        final JSONObject json = new JSONObject();
        json.put("peihuoid", (Object)peihuoid.toString().replaceAll("\"", ""));
        json.put("peihuoname", (Object)peihuoname.toString().replaceAll("\"", ""));
        System.out.println(json.toString());
        return json.toString();
    }
}
