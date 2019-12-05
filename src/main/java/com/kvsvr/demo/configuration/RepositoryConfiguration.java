package com.kvsvr.demo.configuration;

import com.kvsvr.demo.repository.model.Article;
import com.kvsvr.demo.repository.model.Category;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfiguration extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Category.class);
        config.exposeIdsFor(Article.class);
//        config.setRepositoryDetectionStrategy(RepositoryDetectionStrategy.RepositoryDetectionStrategies.ANNOTATED);
        config.setBasePath("/api/v1");
//        config.setDefaultPageSize(3);
//        config.setMaxPageSize(2);
//        config.setPageParamName("tompor");
    }
}
