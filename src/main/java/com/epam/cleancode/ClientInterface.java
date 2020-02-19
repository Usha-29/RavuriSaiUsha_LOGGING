package com.epam.cleancode;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ClientInterface {
	public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);
		 PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	   
	    
	    int p; // P	=	initial principal balance
		double r; // r   =	interest rate
		int n;   // n	=   number of times interest applied per time period
		int t;   // t	=	time in years
		
		out.print("To calculate Simple Interest and Compound Interest\n\n");
		out.print("Enter Principal amount(P) \nRate of Interest(r/100) \nTime in years(t) \nNumber of times interest applied per time period(n)\n");

	    p=sc.nextInt(); 
	    r=sc.nextDouble();
	    t=sc.nextInt();
	    n=sc.nextInt();
	    
	    Simple_Compound_Interest interest=new  Simple_Compound_Interest(p,r,t,n);
	    
	   out.print("\nSimple Interest is:"+ interest.SimpleInterest());
	    out.print("\nCompound Interest is:"+ interest.CompoundInterest());
	    
	    
	    out.print("\n\n\nHouse Construction\n\n");
	    
	    out.print("Enter Total area \nStandard(1-standard  2-above standard  3-high standard)\n");
	    double total_area =sc.nextDouble();
		int standard=sc.nextInt(); 
		out.print("Do you want a Fully Automated Home??\n If yes press 1 else 0 ");
		int press=sc.nextInt();
		boolean fully_automated_home= press==1? true:false;
		
		Construction_Cost cc=new Construction_Cost(total_area,standard,fully_automated_home);
		out.print("Construction Cost Of Home is:"+ cc.estimate());
		
	   
	    sc.close();
	}

}
