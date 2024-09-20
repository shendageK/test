package com.cjc;

import java.util.Scanner;

public class SumEvenOdd {
	
	Scanner sc = new Scanner(System.in);
	
	public void m1()
	{
		System.out.println("Enter the numbers :-");
		long no = sc.nextLong();
		
		if(no%2==0)
		{
			
			System.out.println();
		}
		else 
		{
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		SumEvenOdd sum = new SumEvenOdd();
		sum.m1();
	}

}
