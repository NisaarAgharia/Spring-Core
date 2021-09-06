package com.example.basics;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
	
	public int[] sort(int[] numbers);
	

}
