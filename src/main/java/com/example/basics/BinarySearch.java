package com.example.basics;

import java.util.Arrays;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	
	
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

}
