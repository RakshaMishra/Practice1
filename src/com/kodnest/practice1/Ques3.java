package com.kodnest.practice1;
import java.util.Scanner;


public class Ques3 {
	public static void main(String[] args) {
		 int i;
		   Scanner sc=new Scanner(System.in);
		   Square sq= new Square();
		   i=sc.nextInt();
		  int a= sq.area(i);
		  
		 System.out.println("area is "+ a);
		
	}
   
    
}

