package com.example.scopes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		// Just a sample implementation of sorting Algorithm
		Arrays.sort(numbers);
		return numbers;
	}
	
	

}
