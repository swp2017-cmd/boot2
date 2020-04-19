package com.icss.boot2.config;

/**
 * @date 2020/4/19 11:20
 * @autho SWP
 * @Version 1.0
 */

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * 配置mybtais
 */
@Configuration
public class SqlSessionFac {
    @Value("${mybatis.mybatis_config_path}")
    private String mybatisConfigPath;
    @Value("${mybatis.mapper_path}")
    private String mapperPath;

    @Value("${mybatis.domain_package}")
    private String domainPackage;

    @Autowired
    private DataSource dataSource;


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean getSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(new ClassPathResource(mybatisConfigPath));

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String pathMapper = PathMatchingResourcePatternResolver.CLASSPATH_URL_PREFIX + mapperPath;

        factoryBean.setMapperLocations(resolver.getResources(pathMapper));

        factoryBean.setTypeAliasesPackage(domainPackage);
        return factoryBean;
    }
}
