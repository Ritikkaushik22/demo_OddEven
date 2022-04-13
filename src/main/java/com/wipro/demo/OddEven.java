package com.wipro.demo;
import java.util.*;
public class OddEven {
	public static void main(String[] args) {
	
	Scanner scn= new Scanner(System.in);
	
	System.out.println("Enter a Number: ");
	int n=scn.nextInt();
	
	if(n%2==0) {
		System.out.println(n+" is Even Number");
	}
	
	else
	{
		System.out.println(n+" is Odd Number");
	}
}

}
