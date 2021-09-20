package com.example.scopes;

import java.util.Arrays;
import java.util.OptionalInt;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {
	
	@Inject
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	
	
	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int Search(int[] numbers, int key)
	{
		sortAlgorithm.sort(numbers);
		
		//
		return Arrays.binarySearch(numbers, key);
		
	}

	public OptionalInt sum(int[] numbers)
	{
		OptionalInt Sum =  Arrays.stream(numbers).reduce(Integer::sum);
		
		//
		return Sum;
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("After Constructing of Bean ");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Before Destroying of Bean");
	}

}
