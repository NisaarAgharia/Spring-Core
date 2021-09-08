package com.example.basics;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(SpringBootBasicsApplication.class, args);
		
		try 
		(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBootBasicsApplication.class))
		{
	
		BinarySearch bs = applicationContext.getBean(BinarySearch.class);
		
		String [] beannames =  applicationContext.getBeanDefinitionNames();
		System.out.println(beannames.toString());
		System.out.println(bs);
		int [] numbers = {3,5,1,7,9,25};
		int index = bs.Search(numbers,9);
		System.out.println(index);
		System.out.println(bs.sum(numbers));
		
		BubbleSortAlgorithm bubble = applicationContext.getBean(BubbleSortAlgorithm.class);
		int [] sorted = bubble.sort(numbers);
	//	Stream.of(sorted).forEach(s->System.out.println(s));
		for (int e : sorted)
		{
			System.out.println(e);
		}
		//System.out.println(applicationContext.getBeanDefinitionNames().toString());
		}
}
	
}
