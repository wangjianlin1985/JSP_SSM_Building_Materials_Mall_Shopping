// 
// Decompiled by Procyon v0.5.29
// 

package com.entity;

import com.util.VeDate;

public class Details
{
    private String detailsid;
    private String ordercode;
    private String jiancaiid;
    private String num;
    private String price;
    private String cityid;
    private String peihuoid;
    private String viewdate;
    private String jiancainame;
    private String cityname;
    private String peihuoname;
    
    public Details() {
        this.detailsid = "D" + VeDate.getStringId();
    }
    
    public String getDetailsid() {
        return this.detailsid;
    }
    
    public void setDetailsid(final String detailsid) {
        this.detailsid = detailsid;
    }
    
    public String getOrdercode() {
        return this.ordercode;
    }
    
    public void setOrdercode(final String ordercode) {
        this.ordercode = ordercode;
    }
    
    public String getJiancaiid() {
        return this.jiancaiid;
    }
    
    public void setJiancaiid(final String jiancaiid) {
        this.jiancaiid = jiancaiid;
    }
    
    public String getNum() {
        return this.num;
    }
    
    public void setNum(final String num) {
        this.num = num;
    }
    
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(final String price) {
        this.price = price;
    }
    
    public String getCityid() {
        return this.cityid;
    }
    
    public void setCityid(final String cityid) {
        this.cityid = cityid;
    }
    
    public String getPeihuoid() {
        return this.peihuoid;
    }
    
    public void setPeihuoid(final String peihuoid) {
        this.peihuoid = peihuoid;
    }
    
    public String getViewdate() {
        return this.viewdate;
    }
    
    public void setViewdate(final String viewdate) {
        this.viewdate = viewdate;
    }
    
    public String getJiancainame() {
        return this.jiancainame;
    }
    
    public void setJiancainame(final String jiancainame) {
        this.jiancainame = jiancainame;
    }
    
    public String getCityname() {
        return this.cityname;
    }
    
    public void setCityname(final String cityname) {
        this.cityname = cityname;
    }
    
    public String getPeihuoname() {
        return this.peihuoname;
    }
    
    public void setPeihuoname(final String peihuoname) {
        this.peihuoname = peihuoname;
    }
}
