// 
// Decompiled by Procyon v0.5.29
// 

package com.service.impl;

import java.util.List;
import com.entity.Peihuo;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import com.dao.PeihuoDAO;
import org.springframework.stereotype.Service;
import com.service.PeihuoService;

@Service("peihuoService")
public class PeihuoServiceImpl implements PeihuoService
{
    @Autowired
    @Resource
    private PeihuoDAO peihuoDAO;
    
    @Override
    public int insertPeihuo(final Peihuo peihuo) {
        return this.peihuoDAO.insertPeihuo(peihuo);
    }
    
    @Override
    public int updatePeihuo(final Peihuo peihuo) {
        return this.peihuoDAO.updatePeihuo(peihuo);
    }
    
    @Override
    public int deletePeihuo(final String peihuoid) {
        return this.peihuoDAO.deletePeihuo(peihuoid);
    }
    
    @Override
    public List<Peihuo> getAllPeihuo() {
        return this.peihuoDAO.getAllPeihuo();
    }
    
    @Override
    public List<Peihuo> getPeihuoByCond(final Peihuo peihuo) {
        return this.peihuoDAO.getPeihuoByCond(peihuo);
    }
    
    @Override
    public List<Peihuo> getPeihuoByLike(final Peihuo peihuo) {
        return this.peihuoDAO.getPeihuoByLike(peihuo);
    }
    
    @Override
    public Peihuo getPeihuoById(final String peihuoid) {
        return this.peihuoDAO.getPeihuoById(peihuoid);
    }
}
