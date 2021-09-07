package com.example.scopes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		 Arrays.sort(numbers);
		return numbers;
	}

}
