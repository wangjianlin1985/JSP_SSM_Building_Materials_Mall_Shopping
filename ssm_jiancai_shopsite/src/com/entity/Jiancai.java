// 
// Decompiled by Procyon v0.5.29
// 

package com.entity;

import com.util.VeDate;

public class Jiancai
{
    private String jiancaiid;
    private String jiancainame;
    private String image;
    private String cateid;
    private String price;
    private String recommend;
    private String thestart;
    private String theend;
    private String hits;
    private String sellnum;
    private String contents;
    private String catename;
    
    public Jiancai() {
        this.jiancaiid = "F" + VeDate.getStringId();
    }
    
    public String getJiancaiid() {
        return this.jiancaiid;
    }
    
    public void setJiancaiid(final String jiancaiid) {
        this.jiancaiid = jiancaiid;
    }
    
    public String getJiancainame() {
        return this.jiancainame;
    }
    
    public void setJiancainame(final String jiancainame) {
        this.jiancainame = jiancainame;
    }
    
    public String getImage() {
        return this.image;
    }
    
    public void setImage(final String image) {
        this.image = image;
    }
    
    public String getCateid() {
        return this.cateid;
    }
    
    public void setCateid(final String cateid) {
        this.cateid = cateid;
    }
    
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(final String price) {
        this.price = price;
    }
    
    public String getRecommend() {
        return this.recommend;
    }
    
    public void setRecommend(final String recommend) {
        this.recommend = recommend;
    }
    
    public String getThestart() {
        return this.thestart;
    }
    
    public void setThestart(final String thestart) {
        this.thestart = thestart;
    }
    
    public String getTheend() {
        return this.theend;
    }
    
    public void setTheend(final String theend) {
        this.theend = theend;
    }
    
    public String getHits() {
        return this.hits;
    }
    
    public void setHits(final String hits) {
        this.hits = hits;
    }
    
    public String getSellnum() {
        return this.sellnum;
    }
    
    public void setSellnum(final String sellnum) {
        this.sellnum = sellnum;
    }
    
    public String getContents() {
        return this.contents;
    }
    
    public void setContents(final String contents) {
        this.contents = contents;
    }
    
    public String getCatename() {
        return this.catename;
    }
    
    public void setCatename(final String catename) {
        this.catename = catename;
    }
}
