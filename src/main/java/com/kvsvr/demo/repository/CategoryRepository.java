package com.kvsvr.demo.repository;

import com.kvsvr.demo.repository.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categories_data", path = "categories")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Override
//    @RestResource(exported = false)
    Category save(Category category);

    @Override
//    @RestResource(exported = false)
    void delete(Category category);

}
