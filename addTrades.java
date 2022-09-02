package com.Fxtreding;

import java.util.ArrayList;

public class addTrades
{

	static ArrayList<variables> a=new ArrayList<>();
	  public static void addlist(int tradeno,String pair,String name,double amount,double rate)
	  {
		a.add(new variables(tradeno,pair,name,amount,rate));
		System.out.println("added");
	  }
     public static void printtrades() 
     {
    	 if(a.isEmpty())
    	 {
    		 System.out.println("No trades are booked");
    	 }
    	 else
    	 {
    	   System.out.println("TradeNo\t" + "CurrencyName\t"+"CustomerName\t"+"Amount\t"+"Rate");
    	   for(variables v:a)
    	    {
    		 System.out.println(v);
    	    }
    	  BookTrade. choices();
    	  BookTrade. runnermethod();
    	}
	 }	
}
