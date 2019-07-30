package com.sohu.springbootdemo.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author haochen
 * @date 2019/7/30 16:35
 */
@Configuration
@MapperScan(basePackages = "com.sohu.springbootdemo.Dao.recomworker", sqlSessionTemplateRef  = "workerSqlSessionTemplate")
public class DruidWorker {
    // 获取映射文件所在的路径
    @Value("${mybatis.recom_worker.mapper-locations}")
    private String workerMapperPath;

    @Value("${spring.datasource.recomworker.jdbc-url}")
    private String dbUrl;
    @Value("${spring.datasource.recomworker.username}")
    private String username;
    @Value("${spring.datasource.recomworker.password}")
    private String password;
    @Value("${spring.datasource.recomworker.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.recomworker.initialSize}")
    private int initialSize;
    @Value("${spring.datasource.recomworker.minIdle}")
    private int minIdle;
    @Value("${spring.datasource.recomworker.maxActive}")
    private int maxActive;
    @Value("${spring.datasource.recomworker.maxWait}")
    private int maxWait;
    @Value("${spring.datasource.recomworker.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${spring.datasource.recomworker.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
    @Value("${spring.datasource.recomworker.validationQuery}")
    private String validationQuery;
    @Value("${spring.datasource.recomworker.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.recomworker.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.recomworker.testOnReturn}")
    private boolean testOnReturn;
    @Value("${spring.datasource.recomworker.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.datasource.recomworker.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.datasource.recomworker.druid.filters}")
    private String filters;
    @Value("${spring.datasource.recomworker.connectionProperties}")
    private String connectionProperties;
    @Value("${spring.datasource.recomworker.useGlobalDataSourceStat}")
    private boolean useGlobalDataSourceStat;

    @Bean(name = "workerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.recomworker")
    public DataSource dataSource(){
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        datasource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            System.err.println("druid configuration initialization filter: "+ e);
        }
        datasource.setConnectionProperties(connectionProperties);
        return datasource;
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
