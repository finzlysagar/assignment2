package com.Fxtreding;

import java.util.Scanner;

public class BookTrade 
{
	
	public  static int c=0;
	public static double rate1=66.00;
	public static void choices() 
	{
		System.out.println("***************");
		System.out.println("1-Book Trades");
		System.out.println("2-Print Trades");
		System.out.println("3-Exit");
		System.out.println("***************");			
	}
	 public static void runnermethod() 
	 {
		 System.out.println("Enter your choice");
		   Scanner sc=new Scanner(System.in);
		   int ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1:
			   BookTrade.bookTrade();
			   break;
		   case 2:
			   addTrades. printtrades();
			   break;
		   case 3:
			   Exit.exit();
	  		   break;
		   default:
			   System.out.println("ENTER A VALID CHOICE");
			   break;		     
		   }
		  
	}
	
	  public static double calculateAmount(double amount)
	  {
		  double TotalAmount=amount*rate1;
		  
		  return TotalAmount;
	  }	
	 public static void bookTrade() 
	 {
		 
		 String customer_Name;
		 String Currency_Pair;
		  double rate1=66.00;
		 double  amount_to_transfer=00;
	
	
		 System.out.println("Enter a customer name");
		 Scanner sc=new Scanner(System.in);
		 customer_Name=sc.nextLine();
		 System.out.println("Enter a currency pair");
		 //Scanner sc=new Scanner(System.in);
		 Currency_Pair=sc.nextLine();
		 if(Currency_Pair.equalsIgnoreCase("usdinr"))
		 {
		   System.out.println("Enter a amount to trasnfer");
		   try
		   {
		   amount_to_transfer=sc.nextDouble();
		   }
		   catch(Exception e)
		   {
			System.out.println("Enter valid amount");   
			 bookTrade();
		   }
			 double final_amount=calculateAmount(amount_to_transfer);
		   System.out.println("Do you want to get rate yes\no");
		   String rate=sc.next();
		    if(rate.equalsIgnoreCase("yes"))
		    {
		    	System.out.println("Your are transfring INR"+BookTrade.calculateAmount(amount_to_transfer)+"with rate of"+rate1 );
		    }
		    else if(rate.equalsIgnoreCase("no"))
		    {
		    	System.out.println("");
		    }
		    else
		    {
		    	System.out.println("Inavalid input");
		    }
		   System.out.println("You are transferring INR "+BookTrade.calculateAmount( amount_to_transfer)+" to "+customer_Name);
		   System.out.println("Do you want to Book/Cancel this trade?"); 
		   Scanner sc1=new Scanner(System.in);
		   String ch=sc1.nextLine();
		     if(ch.equalsIgnoreCase("book"))
		     {
			 System.out.println("Trade for USDINR has been booked with rate 66.00 , The amount of Rs "+BookTrade.calculateAmount( amount_to_transfer) +" will  be transferred in 2 working days to "+customer_Name+"..");
			     c++;
			     System.out.println(c);
			 addTrades.addlist(c,Currency_Pair,customer_Name,final_amount,rate1);
			  choices();
			  runnermethod();
		     }
		    else if(ch.equalsIgnoreCase("Cancel"))
		    {
			 System.out.println("Trade is Canceled.");
			 BookTrade.choices();
		    }
		
		 }
		 else
		 {
			 System.out.println("Inavalid input-This trade is only for USDINR cuurency pair.");
		 }
	 }
	
	

}
