package com.Fxtreding;

public class variables 
{
	
	public static int TradeNo;
	public static String CurrencyPair;
	public static  String name;
	public static double amount;
	public static  double rate;
	public variables(int tradeNo, String currencyPair, String name, double amount, double rate) {
		super();
		TradeNo = tradeNo;
		CurrencyPair = currencyPair;
		this.name = name;
		this.amount = amount;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "variables [TradeNo=" + TradeNo + ", CurrencyPair=" + CurrencyPair + ", name=" + name + ", amount="
				+ amount + ", rate=" + rate + "]";
	}

	

}
