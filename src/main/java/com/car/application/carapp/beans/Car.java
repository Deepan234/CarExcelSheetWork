package com.car.application.carapp.beans;

import java.math.BigDecimal;


public class Car {
	
	public long carId;
	
	public String carName;
	
	public String carLaunchedYear;
	
	public BigDecimal cost;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

    

	public Car(long carId, String carName, String carLaunchedYear, BigDecimal cost) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carLaunchedYear = carLaunchedYear;
		this.cost = cost;
	}



	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarLaunchedYear() {
		return carLaunchedYear;
	}

	public void setCarLaunchedYear(String carLaunchedYear) {
		this.carLaunchedYear = carLaunchedYear;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
}
