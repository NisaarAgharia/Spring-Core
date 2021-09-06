package com.example.basics;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		// Just a sample implementation of sorting Algorithm
		Arrays.sort(numbers);
		return numbers;
	}
	
	

}
