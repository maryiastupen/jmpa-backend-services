package com.epam.learn.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * H2 Datasource configuration
 */
@Configuration
@Profile("qa")
public class H2DataSourceConfiguration extends DataSourceConfiguration {

    @Value("${h2.url}")
    private String dataSourceUrl;
    @Value("${h2.driver.class.name}")
    private String driverClassName;
    @Value("${h2.password}")
    private String password;
    @Value("${h2.username}")
    private String username;

    @Bean(name = "h2_datasource")
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
