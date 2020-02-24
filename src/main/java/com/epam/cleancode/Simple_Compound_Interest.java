package com.epam.cleancode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simple_Compound_Interest {	 
	 private static final Logger LOGGER=LogManager.getLogger(Simple_Compound_Interest.class);
	int p; // P	=	initial principal balance
	double r; // r   =	interest rate
	int t; // t	=	time in years
	int n; // n	=   number of times interest applied per time period
  
	 Simple_Compound_Interest(int principal_amount, double rate_of_interest, int time,int n){
		 LOGGER.info("Intialized parameters.");
		p=principal_amount;
		 r=rate_of_interest;
		 t=time;
		 this.n=n;
		 
	 }
	 public double SimpleInterest() {
		 LOGGER.info("Entered SimpleInterest method.");
		 return p*r*t;
		
	 }
	 public double CompoundInterest() {
		 LOGGER.info("Entered CompoundInterest method.");
		 return (p * Math.pow(1 + (r / n), n * t))-p;
		 
	 }
}
