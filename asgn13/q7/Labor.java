package com.sunbeam;

public class Labor implements Emp {
	private int hours;
	private double rate;

	public Labor() {
		hours = 370;
		rate = 450.00;
	}

	public Labor(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return hours * rate;
	}

	@Override
	public double calcIncentives() {
//		if(hours>300) {
//			return (this.hours*this.rate)*0.05;
//		}else {
//			return 0.0;
//		}
		return this.hours > 300 ? (this.hours * this.rate) * 0.05 : 0;
	}
}
