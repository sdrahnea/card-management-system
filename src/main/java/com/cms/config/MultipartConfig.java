package com.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * Created by sdrahnea
 * Date: 2021-11-01
 */
@Configuration
public class MultipartConfig {

    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }

}