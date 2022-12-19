package com.yh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * date 2022/12/19
 *
 * @author yu
 */
@Configuration
@ComponentScan({"com.yh.service","com.yh.mapper"})//扫描
@PropertySource("classpath:jdbc.properties")//配置文件
@Import({DruidConfig.class, MyBatisConfig.class})//包含类
@EnableTransactionManagement//开启事务
public class SpringConfig {
}
