package com.yh.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * 作者 小豪<p>
 * 时间 2022/12/15<p>
 *
 * @author yu<p>
 */
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        设置别名
        bean.setTypeAliasesPackage("com.yh.pojo");
        bean.setDataSource(dataSource);
        return bean;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //映射类
        mapperScannerConfigurer.setBasePackage("com.yh.mapper");
        return mapperScannerConfigurer;
    }
}
