// 
// Decompiled by Procyon v0.5.29
// 

package com.dao;

import java.util.List;
import com.entity.Article;
import org.springframework.stereotype.Repository;

@Repository("articleDAO")
public interface ArticleDAO
{
    int insertArticle(Article p0);
    
    int updateArticle(Article p0);
    
    int deleteArticle(String p0);
    
    List<Article> getAllArticle();
    
    List<Article> getArticleByCond(Article p0);
    
    List<Article> getArticleByLike(Article p0);
    
    Article getArticleById(String p0);
}
