package com.tsh.slt.sua;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(value = "com.plexter.sellter.*")
public class SUAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SUAApplication.class, args);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);

		Resource[] res
				= new PathMatchingResourcePatternResolver().getResources("classpath:META-INF/persistence/mybatis/mapper/**/*.xml");
		sessionFactory.setMapperLocations(res);

		return sessionFactory.getObject();
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/**").allowedOrigins("http://localhost:3000")
						.allowedMethods("GET", "POST", "PUT", "DELETE").allowCredentials(true);
			}
		};
	}
}
