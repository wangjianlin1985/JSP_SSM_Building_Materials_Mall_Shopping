// 
// Decompiled by Procyon v0.5.29
// 

package com.service.impl;

import java.util.List;
import com.entity.Jiancai;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import com.dao.JiancaiDAO;
import org.springframework.stereotype.Service;
import com.service.JiancaiService;

@Service("jiancaiService")
public class JiancaiServiceImpl implements JiancaiService
{
    @Autowired
    @Resource
    private JiancaiDAO jiancaiDAO;
    
    @Override
    public int insertJiancai(final Jiancai jiancai) {
        return this.jiancaiDAO.insertJiancai(jiancai);
    }
    
    @Override
    public int updateJiancai(final Jiancai jiancai) {
        return this.jiancaiDAO.updateJiancai(jiancai);
    }
    
    @Override
    public int deleteJiancai(final String jiancaiid) {
        return this.jiancaiDAO.deleteJiancai(jiancaiid);
    }
    
    @Override
    public List<Jiancai> getAllJiancai() {
        return this.jiancaiDAO.getAllJiancai();
    }
    
    @Override
    public List<Jiancai> getJiancaiByHot() {
        return this.jiancaiDAO.getJiancaiByHot();
    }
    
    @Override
    public List<Jiancai> getJiancaiByNews() {
        return this.jiancaiDAO.getAllJiancai();
    }
    
    @Override
    public List<Jiancai> getJiancaiByCate(final String cateid) {
        return this.jiancaiDAO.getJiancaiByCate(cateid);
    }
    
    @Override
    public List<Jiancai> getJiancaiByCond(final Jiancai jiancai) {
        return this.jiancaiDAO.getJiancaiByCond(jiancai);
    }
    
    @Override
    public List<Jiancai> getJiancaiByLike(final Jiancai jiancai) {
        return this.jiancaiDAO.getJiancaiByLike(jiancai);
    }
    
    @Override
    public Jiancai getJiancaiById(final String jiancaiid) {
        return this.jiancaiDAO.getJiancaiById(jiancaiid);
    }
}
