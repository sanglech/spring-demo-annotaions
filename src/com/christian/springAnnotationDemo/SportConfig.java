package com.christian.springAnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.christian.springAnnotationDemo")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	//define Bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public FortuneService mehFortuneService() {
		return new MehFortuneService();
	}
	
	
	//define bean for our swim coach AND inject dependancy
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	@Bean
	public Coach tableTennisCoach() {
		return new TableTennisCoach(mehFortuneService());
	}
	
}
