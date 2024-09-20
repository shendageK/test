package com.cjc;

import java.util.Scanner;

public class Test {
	
	Scanner sc = new Scanner(System.in);
	public void m1()
	{
		System.out.println("enter the user age :-");
		int age = sc.nextInt();
		System.out.println("enter the user weight :-");
		float wgt = sc.nextFloat();
		
		if(age >=21 && age <=60)
		{
			if(wgt >=40 && wgt <=70 )
			{
				System.out.println("User is eligible to Donate...");
			}
			else
			{
				
			}
		}
		
	}


	public static void main(String[] args) {
		
	}

}
