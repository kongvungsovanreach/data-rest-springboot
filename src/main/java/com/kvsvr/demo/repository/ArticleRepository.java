package com.kvsvr.demo.repository;

import com.kvsvr.demo.repository.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "articles_data", path = "articles")
interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {
    @RestResource(path = "des", rel = "searchByArticleDescription")
    @Query(nativeQuery = true, value = "select * from ARTICLE where description like")
    List<Article> findByDescription(@Param("description") String description);
}
