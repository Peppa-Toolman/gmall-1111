package com.toolmanclub.gmall.oms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Yujie Wang
 * @date 2020/9/5 13:37
 */
@MapperScan(basePackages = "com.toolmanclub.gmall.oms.mapper")
@Configuration
public class OmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yaml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;
    }
}
