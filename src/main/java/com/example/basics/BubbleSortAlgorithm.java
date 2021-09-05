package com.example.basics;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		 Arrays.sort(numbers);
		return numbers;
	}

}
