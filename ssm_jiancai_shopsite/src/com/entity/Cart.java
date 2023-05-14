// 
// Decompiled by Procyon v0.5.29
// 

package com.entity;

import com.util.VeDate;

public class Cart
{
    private String cartid;
    private String usersid;
    private String jiancaiid;
    private String num;
    private String price;
    private String username;
    private String jiancainame;
    private String image;
    
    public Cart() {
        this.cartid = "C" + VeDate.getStringId();
    }
    
    public String getImage() {
        return this.image;
    }
    
    public void setImage(final String image) {
        this.image = image;
    }
    
    public String getCartid() {
        return this.cartid;
    }
    
    public void setCartid(final String cartid) {
        this.cartid = cartid;
    }
    
    public String getUsersid() {
        return this.usersid;
    }
    
    public void setUsersid(final String usersid) {
        this.usersid = usersid;
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
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public String getJiancainame() {
        return this.jiancainame;
    }
    
    public void setJiancainame(final String jiancainame) {
        this.jiancainame = jiancainame;
    }
}
