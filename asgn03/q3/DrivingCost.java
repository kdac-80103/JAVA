package com.sunbeam.driving_cost;

import java.util.Scanner;

public class DrivingCost {
			
		  private double totalMilesDrive;
		  private double costPerGallon;
		  private double avergeMilePerGallon;
		  private double parkingFee;
		  private double tollPerDay;
		  
		  
		public DrivingCost() {
			this(0,0,0,0,0);
		}

		public DrivingCost(double totalMilesDrive, double costPerGallon, double avergeMilePerGallon, double parkingFee,
				double tollPerDay) {
			
			this.totalMilesDrive = totalMilesDrive;
			this.costPerGallon = costPerGallon;
			this.avergeMilePerGallon = avergeMilePerGallon;
			this.parkingFee = parkingFee;
			this.tollPerDay = tollPerDay;
		}
		
		public void accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Total Mile Drive = ");
			this.totalMilesDrive=sc.nextDouble();
			System.out.print("Enter The Cost per Gallon = ");
			this.costPerGallon=sc.nextDouble();
			System.out.print("Enter The Average Mile Per Gallon = ");
			this.avergeMilePerGallon=sc.nextDouble();
			System.out.print("Enter The Parking Fee = ");
			this.parkingFee=sc.nextDouble();
			System.out.print("Enter The Toll Per Day Fee = ");
			this.tollPerDay=sc.nextDouble();
			
		}
		
		public void drivingCost()
		{
		   double totalcost=(this.totalMilesDrive / this.avergeMilePerGallon)*this.costPerGallon +this.parkingFee +this.tollPerDay;
		   System.out.println("Total cost per Day is = "+totalcost);
		}
		
		public void display()
		{
			drivingCost();
		}
}
