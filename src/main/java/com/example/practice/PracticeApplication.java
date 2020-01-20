package com.example.practice;

import javax.sql.DataSource;
 
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(value={"com.example.practice.board.mapper"})
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	
    // sql session 생성
	// Bean : 스프링에 필요한 객체 생성
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
	}

}
