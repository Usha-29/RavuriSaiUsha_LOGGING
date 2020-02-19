package com.epam.cleancode;

public class Simple_Compound_Interest {	 
  	
	int p; // P	=	initial principal balance
	double r; // r   =	interest rate
	int t; // t	=	time in years
	int n; // n	=   number of times interest applied per time period
  
	 Simple_Compound_Interest(int principal_amount, double rate_of_interest, int time,int n){
		p=principal_amount;
		 r=rate_of_interest;
		 t=time;
		 this.n=n;
	 }
	 public double SimpleInterest() {
		 return p*r*t;
	 }
	 public double CompoundInterest() {
		  
		 return (p * Math.pow(1 + (r / n), n * t))-p;
		 
	 }
}
