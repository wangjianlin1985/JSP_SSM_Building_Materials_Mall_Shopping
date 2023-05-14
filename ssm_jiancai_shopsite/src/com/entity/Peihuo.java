// 
// Decompiled by Procyon v0.5.29
// 

package com.entity;

import com.util.VeDate;

public class Peihuo
{
    private String peihuoid;
    private String peihuoname;
    private String cityid;
    private String address;
    private String contact;
    private String memo;
    private String cityname;
    
    public Peihuo() {
        this.peihuoid = "C" + VeDate.getStringId();
    }
    
    public String getPeihuoid() {
        return this.peihuoid;
    }
    
    public void setPeihuoid(final String peihuoid) {
        this.peihuoid = peihuoid;
    }
    
    public String getPeihuoname() {
        return this.peihuoname;
    }
    
    public void setPeihuoname(final String peihuoname) {
        this.peihuoname = peihuoname;
    }
    
    public String getCityid() {
        return this.cityid;
    }
    
    public void setCityid(final String cityid) {
        this.cityid = cityid;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(final String address) {
        this.address = address;
    }
    
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(final String contact) {
        this.contact = contact;
    }
    
    public String getMemo() {
        return this.memo;
    }
    
    public void setMemo(final String memo) {
        this.memo = memo;
    }
    
    public String getCityname() {
        return this.cityname;
    }
    
    public void setCityname(final String cityname) {
        this.cityname = cityname;
    }
}
