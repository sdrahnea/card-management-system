package com.cms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by sdrahnea
 * Date: 2021-11-01
 */
@Configuration
public class AppConfig {

    private final List<String> tenantList;
    private final boolean tenantVerification;

    public AppConfig(@Value("#{'${tenant.list}'.split(',')}") List<String> tenantList,
                     @Value("${tenant.verification:false}") boolean tenantVerification
                     ) {
        this.tenantList = tenantList;
        this.tenantVerification = tenantVerification;
    }

    public List<String> getTenantList() {
        return tenantList;
    }

    public boolean isTenantVerification() {
        return tenantVerification;
    }
}
