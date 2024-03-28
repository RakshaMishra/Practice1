package com.kodnest.practice1;
import java.util.Scanner;

public class Doubt {
	public static void main(String[] args) {
		
		
		int sum=add();
		System.out.println(sum);
	
	}
	
	static int add()
	{  Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int a=b+c;
		return a;
	}
	
	

}
