// 
// Decompiled by Procyon v0.5.29
// 

package com.service;

import java.util.List;
import com.entity.Cate;
import org.springframework.stereotype.Service;

@Service("cateService")
public interface CateService
{
    int insertCate(Cate p0);
    
    int updateCate(Cate p0);
    
    int deleteCate(String p0);
    
    List<Cate> getAllCate();
    
    List<Cate> getCateFront();
    
    List<Cate> getCateByCond(Cate p0);
    
    List<Cate> getCateByLike(Cate p0);
    
    Cate getCateById(String p0);
}
