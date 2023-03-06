package com.epam.learn.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * HSQL Datasource configuration
 */
@Profile("dev")
@Configuration
public class HsqldbDataSourceConfiguration extends DataSourceConfiguration {

    @Value("${hsql.url}")
    private String dataSourceUrl;
    @Value("${hsql.driver.class.name}")
    private String driverClassName;
    @Value("${hsql.password}")
    private String password;
    @Value("${hsql.username}")
    private String username;

    @Bean(name = "hsql_datasource")
    @ConditionalOnMissingBean(name = "h2_datasource")
    public DataSource getDataSource() {
        return super.getDataSource();
    }

    @Override
    protected String getDriverClassName() {
        return driverClassName;
    }

    @Override
    protected String getDataSourceUrl() {
        return dataSourceUrl;
    }

    @Override
    protected String getUserName() {
        return username;
    }

    @Override
    protected String getPassword() {
        return password;
    }

}
