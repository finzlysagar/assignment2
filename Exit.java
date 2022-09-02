package com.Fxtreding;

import java.util.Scanner;

public class Exit 
{
	///Method for the exit the trading 
	public static  void exit()
	{
	  String ch;
	  System.out.println("Do you really want to exit (y/n)");
	  Scanner sc=new Scanner(System.in);
	  ch=sc.next();
	        
	    if(ch.equalsIgnoreCase("y"))
	   {
		   System.out.println("Bye - have a good day");
	   }
	   else if(ch.equalsIgnoreCase("n"))
	   {
		   BookTrade.choices();
	   }
	   else
	   {
		   System.out.println("Please enter valid input");
		  // BookTrade.choices();
		   Exit.exit();
	   }
	  
	}
	
	

}
