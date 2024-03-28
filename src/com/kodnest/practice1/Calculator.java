package com.kodnest.practice1;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int add=sum();
		System.out.println("addition is" + add);
		
		int subt=sub();
		System.out.println("subtraction is" + subt);
		
		int didvd=div();
		System.out.println("division is" + didvd);
		
		int remain=rem();
		System.out.println("remainder is" + remain);
		
		int multi=mul();
		System.out.println("multiplication is" + multi);
		
		
	}
	
	 static int sum()
	 {
		 int a;
		 int b;
		 System.out.println("for additio enter two numbers");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 int s=a+b;
		 return s;
		 
	 }
	 
	 static int sub()
	 {
		 int c;
		 int d;
		 System.out.println("for subtraction enter two numbers");
		 c=sc.nextInt();
		 d=sc.nextInt();
		 int m=c-d;
		 return m;
		 
	 }
	 
	 static int div()
	 {
		 int e;
		 int f;
		 System.out.println("for division enter two numbers");
		 e=sc.nextInt();
		 f=sc.nextInt();
		 int n=e/f;
		 return n;
		 
	 }
	 
	 static int rem()
	 {
		 int g;
		 int h;
		 System.out.println("for remainder enter two numbers");
		 g=sc.nextInt();
		 h=sc.nextInt();
		 int r=g%h;
		 return r;
		 
	 }
	 
	 static int mul()
	 {
		 int i;
		 int j;
		 System.out.println("for multiplication enter two numbers");
		 i=sc.nextInt();
		 j=sc.nextInt();
		 int p=i*j;
		 return p;
		 
	 }
	
	 
	
	

}
