package com.sohu.springbootdemo.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by summer on 2016/11/25.
 */
//@Configuration
//@MapperScan(basePackages = "com.sohu.springbootdemo.Dao.recomworker", sqlSessionTemplateRef  = "workerSqlSessionTemplate")
public class DataSourceWorker {


    // 获取映射文件所在的路径
    @Value("${mybatis.recom_worker.mapper-locations}")
    private String workerMapperPath;

    /**
     * @Author jason.tang
     * @Description: 根据配置文件，注入数据源
     * @Param []
     * @return javax.sql.DataSource
     */
    @Bean(name = "workerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.recomworker")
    public DataSource workerDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * @Author jason.tang
     * @Description: 注入SqlSessionFactory，指定数据源和映射文件路径
     * @Param [dataSource]
     * @return org.apache.ibatis.session.SqlSessionFactory
     */
    @Bean(name = "workerSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("workerDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(workerMapperPath);
        bean.setMapperLocations(resources);
        return bean.getObject();
    }

    /**
     * @Author jason.tang
     * @Description: 注入DataSourceTransactionManager事物管理器
     * @Param [dataSource]
     * @return org.springframework.jdbc.datasource.DataSourceTransactionManager
     */
    @Bean(name = "workerTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("workerDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @Author jason.tang
     * @Description: 注入SqlSessionTemplate模板
     * @Param [sqlSessionFactory]
     * @return org.mybatis.spring.SqlSessionTemplate
     */
    @Bean(name = "workerSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("workerSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
