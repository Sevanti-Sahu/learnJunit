package com.in28Minutes.junit;

public class MyMath {
	
	int sum(int[] numbers)
	{
		int sum = 0;
		for(int i : numbers)
		{
			sum = sum + i;
		}
		return sum;
	}

}
