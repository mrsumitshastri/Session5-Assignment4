package com.Session5.Assignment4;

public class AllBank {
	
	/*
	 * Override the getRateOfInterest() of Bank class for all the 3 other Bank classes.
	 * 
	 */
	
	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC(10.5f);
		ICICI icici = new ICICI(9.5f);
		KOTAK kotak = new KOTAK(11.5f);
		
		System.out.println("Intrest Rate of HDFC : "+ hdfc.getRateOfIntrest());
		System.out.println("Intrest Rate of ICICI : "+ icici.getRateOfIntrest());
		System.out.println("Intrest Rate of KOTAK : "+ kotak.getRateOfIntrest());
	}
}

class Bank {

	private double RateOfIntrest;

	public double getRateOfIntrest() {
		return RateOfIntrest;
	}

	public void setRateOfIntrest(double rateOfIntrest) {
		RateOfIntrest = rateOfIntrest;
	}	
	
}

class HDFC extends Bank
{
	public HDFC(double rateOfIntrest) {
		this.setRateOfIntrest(rateOfIntrest);
	}
	
	public double getRateOfIntrest() {
		return super.getRateOfIntrest();
	}
}


class ICICI extends Bank
{
	public ICICI(double rateOfIntrest) {
		this.setRateOfIntrest(rateOfIntrest);
	}
	public double getRateOfIntrest() {
		return super.getRateOfIntrest();
	}
}

class KOTAK extends Bank
{
	public KOTAK(double rateOfIntrest) {
		this.setRateOfIntrest(rateOfIntrest);
	}
	public double getRateOfIntrest() {
		return super.getRateOfIntrest();
	}
}