package com.karth.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 public class PracticeApplication {
	//hhsa
	
	
	public static void printNumb(int n)
	{
		
		if(n<0)
		{
			return;
		}
	    
	    printNumb(n-1);
	    System.out.println(n); 
		
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		 int a =8;
		 int b =80;
		 int c=88;

		 //hello2
		 // data demon

		 //hello

		 printNumb(5);
	}

}
