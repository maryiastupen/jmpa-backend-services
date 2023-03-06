package com.epam.learn.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;

/**
 * Datasource configuration
 */
public abstract class DataSourceConfiguration {

    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(getDriverClassName());
        dataSourceBuilder.url(getDataSourceUrl());
        dataSourceBuilder.username(getUserName());
        dataSourceBuilder.password(getPassword());
        return dataSourceBuilder.build();
    }

    protected abstract String getDriverClassName();

    protected abstract String getDataSourceUrl();

    protected abstract String getUserName();

    protected abstract String getPassword();

}
