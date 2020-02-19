package com.epam.cleancode;

public class Construction_Cost {
	double total_area;
	int standard;
	boolean fully_automated_home;
	
	 Construction_Cost (double area,int std, boolean fully_automated_home){
		 total_area=area;
		 standard=std;
		 this.fully_automated_home=fully_automated_home;
		 
	 }
	 
	 double estimate() {
		 double res=1;
		 if(standard==1)
			 res=1200*total_area;
		 else if(standard==2)
			 res=1500*total_area;
		 else if(standard==3) {
			 if(fully_automated_home) res=2500*total_area;
			 else res=1800*total_area;
		 }
		 return res;
	 }

}
