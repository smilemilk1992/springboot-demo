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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 配置方法二
 * @author haochen
 * @date 2019/7/30 16:35
 */
@Configuration
@MapperScan(basePackages = "com.sohu.springbootdemo.Dao.recomcrawl", sqlSessionTemplateRef  = "crawlSqlSessionTemplate")
public class DruidCrawl {

    // 获取映射文件所在的路径
    @Value("${mybatis.recom_crawl.mapper-locations}")
    private String crawlMapperPath;

    @Value("${spring.datasource.recomcrawl.jdbc-url}")
    private String dbUrl;
    @Value("${spring.datasource.recomcrawl.username}")
    private String username;
    @Value("${spring.datasource.recomcrawl.password}")
    private String password;
    @Value("${spring.datasource.recomcrawl.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.recomcrawl.initialSize}")
    private int initialSize;
    @Value("${spring.datasource.recomcrawl.minIdle}")
    private int minIdle;
    @Value("${spring.datasource.recomcrawl.maxActive}")
    private int maxActive;
    @Value("${spring.datasource.recomcrawl.maxWait}")
    private int maxWait;
    @Value("${spring.datasource.recomcrawl.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;
    @Value("${spring.datasource.recomcrawl.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;
    @Value("${spring.datasource.recomcrawl.validationQuery}")
    private String validationQuery;
    @Value("${spring.datasource.recomcrawl.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.recomcrawl.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.recomcrawl.testOnReturn}")
    private boolean testOnReturn;
    @Value("${spring.datasource.recomcrawl.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.datasource.recomcrawl.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.datasource.recomcrawl.druid.filters}")
    private String filters;
    @Value("${spring.datasource.recomcrawl.connectionProperties}")
    private String connectionProperties;
    @Value("${spring.datasource.recomcrawl.useGlobalDataSourceStat}")
    private boolean useGlobalDataSourceStat;

    @Bean(name = "crawlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.recomcrawl")
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
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
    @Bean(name = "crawlSqlSessionFactory")
    @Primary
    public SqlSessionFactory SqlSessionFactory(@Qualifier("crawlDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(crawlMapperPath);
        bean.setMapperLocations(resources);
        return bean.getObject();
    }

    /**
     * @Author jason.tang
     * @Description: 注入DataSourceTransactionManager事物管理器
     * @Param [dataSource]
     * @return org.springframework.jdbc.datasource.DataSourceTransactionManager
     */
    @Bean(name = "crawlTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("crawlDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @Author jason.tang
     * @Description: 注入SqlSessionTemplate模板
     * @Param [sqlSessionFactory]
     * @return org.mybatis.spring.SqlSessionTemplate
     */
    @Bean(name = "crawlSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("crawlSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
