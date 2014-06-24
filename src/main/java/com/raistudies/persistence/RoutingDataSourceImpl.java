package com.raistudies.persistence;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RoutingDataSourceImpl extends AbstractRoutingDataSource {
	@Override
    protected Object determineCurrentLookupKey() {
        String language = System.getProperty("db");
        System.out.println("Language obtained: "+ language);
        return language;
    }
} 