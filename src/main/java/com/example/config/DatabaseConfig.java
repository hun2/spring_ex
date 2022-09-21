package com.example.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = "com.example.*")  // ★ 엄청 중요한 어노테이션 mapper scan 추가!!!★
public class DatabaseConfig {

			// sessionFactory 라는 bean 을 spring bean 으로 만든다.
			@Bean
		    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		        sessionFactory.setDataSource(dataSource);

		        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
		        sessionFactory.setMapperLocations(res);

		        return sessionFactory.getObject();
		    }
}
