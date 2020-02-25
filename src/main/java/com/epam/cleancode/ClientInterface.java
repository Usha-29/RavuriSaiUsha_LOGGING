package com.epam.cleancode;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ClientInterface {
	 private static final Logger LOGGER=LogManager.getLogger(ClientInterface.class);
	public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);
         
          LOGGER.info("Using Logger");
          
	    
	    int p; // P	=	initial principal balance
		double r; // r   =	interest rate
		int n;   // n	=   number of times interest applied per time period
		int t;   // t	=	time in years
		
		LOGGER.info("To calculate Simple Interest and Compound Interest");
		LOGGER.info("\n\nEnter Principal amount(P) \nRate of Interest(r/100) \nTime in years(t) \nNumber of times interest applied per time period(n)\n");

	    p=sc.nextInt(); 
	    r=sc.nextDouble();
	    t=sc.nextInt();
	    n=sc.nextInt();
	    
	    Simple_Compound_Interest interest=new  Simple_Compound_Interest(p,r,t,n);
	    
	    LOGGER.info("Simple Interest is:"+ interest.SimpleInterest());
	   
	    LOGGER.info("Compound Interest is:"+ interest.CompoundInterest()+"\n\n\n");
	    
	    
	    
	    LOGGER.info("House Construction");
	    LOGGER.info("\n\nEnter Total area and Standard(1-standard  2-above standard  3-high standard):\n");
	    double total_area =sc.nextDouble();
		int standard=sc.nextInt(); 
		LOGGER.info("\nDo you want a Fully Automated Home??\n If yes press 1 else 0:\n ");
		int press=sc.nextInt();
		boolean fully_automated_home= press==1? true:false;
		
		Construction_Cost cc=new Construction_Cost(total_area,standard,fully_automated_home);
		LOGGER.info("Construction Cost Of Home is:"+ cc.estimate()+"\n\n");
		
		 LOGGER.info("Exiting Program..");
	    sc.close();
	}

}

