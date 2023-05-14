// 
// Decompiled by Procyon v0.5.29
// 

package com.dao;

import java.util.List;
import com.entity.Peihuo;
import org.springframework.stereotype.Repository;

@Repository("peihuoDAO")
public interface PeihuoDAO
{
    int insertPeihuo(Peihuo p0);
    
    int updatePeihuo(Peihuo p0);
    
    int deletePeihuo(String p0);
    
    List<Peihuo> getAllPeihuo();
    
    List<Peihuo> getPeihuoByCond(Peihuo p0);
    
    List<Peihuo> getPeihuoByLike(Peihuo p0);
    
    Peihuo getPeihuoById(String p0);
}
