package com.example.spring2.config;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
            .url("jdbc:mysql://localhost:3306")
            .username("user")
            .password("1234")
            .driverClassName("com.mysql.cj.jdbc.Driver")
            .build();
    }
}
