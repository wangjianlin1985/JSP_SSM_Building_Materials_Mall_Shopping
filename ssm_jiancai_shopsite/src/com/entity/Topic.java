// 
// Decompiled by Procyon v0.5.29
// 

package com.entity;

import com.util.VeDate;

public class Topic
{
    private String topicid;
    private String usersid;
    private String jiancaiid;
    private String num;
    private String contents;
    private String addtime;
    private String username;
    private String jiancainame;
    
    public Topic() {
        this.topicid = "T" + VeDate.getStringId();
    }
    
    public String getTopicid() {
        return this.topicid;
    }
    
    public void setTopicid(final String topicid) {
        this.topicid = topicid;
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
    
    public String getContents() {
        return this.contents;
    }
    
    public void setContents(final String contents) {
        this.contents = contents;
    }
    
    public String getAddtime() {
        return this.addtime;
    }
    
    public void setAddtime(final String addtime) {
        this.addtime = addtime;
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
