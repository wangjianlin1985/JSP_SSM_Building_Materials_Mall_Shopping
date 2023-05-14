// 
// Decompiled by Procyon v0.5.29
// 

package com.dao;

import java.util.List;
import com.entity.Jiancai;
import org.springframework.stereotype.Repository;

@Repository("jiancaiDAO")
public interface JiancaiDAO
{
    int insertJiancai(Jiancai p0);
    
    int updateJiancai(Jiancai p0);
    
    int deleteJiancai(String p0);
    
    List<Jiancai> getAllJiancai();
    
    List<Jiancai> getJiancaiByHot();
    
    List<Jiancai> getJiancaiByNews();
    
    List<Jiancai> getJiancaiByCate(String p0);
    
    List<Jiancai> getJiancaiByCond(Jiancai p0);
    
    List<Jiancai> getJiancaiByLike(Jiancai p0);
    
    Jiancai getJiancaiById(String p0);
}
