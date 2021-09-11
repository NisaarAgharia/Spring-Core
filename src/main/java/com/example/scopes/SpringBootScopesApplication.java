package com.example.scopes;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Configuration
@ComponentScan("com.example.scopes")
public class SpringBootScopesApplication implements CommandLineRunner{

	private static Logger logger = LoggerFactory.getLogger(""); 
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootScopesApplication.class, args);
		
}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		try 
		(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBootScopesApplication.class))
		{
	
		PersonDAO pd1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO pd2 = applicationContext.getBean(PersonDAO.class);
		
		String [] beannames =  applicationContext.getBeanDefinitionNames();
		
		JdbcConnection conn = applicationContext.getBean(JdbcConnection.class);
		
		logger.info("PD1 {} "+ pd1);
		//System.out.println("PD1 " + pd1);
		logger.info("PD2 " + pd2);
		logger.info("PD1 JDBC " +pd1.getJdbcconnection() );
		logger.info("PD2 JDBC " +pd2.getJdbcconnection() );
		
		BinarySearch bs1 = applicationContext.getBean(BinarySearch.class);
		BinarySearch bs2 = applicationContext.getBean(BinarySearch.class);
		
		logger.info("bs1 " + bs1);
		logger.info("bs2 " + bs2);
		logger.info("bs1 Algo " +bs1.getSortAlgorithm() );
		logger.info("bs2 Algo " +bs2.getSortAlgorithm() );
		
		}
		
	}
	
}
