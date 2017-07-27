package com.carsys.car;

public abstract class Car  {

	private String carNo;
	private String carBrand;
	private String buyDate;
	private String driverNmae;
	public String state;	// ³µ×´Ì¬

	
	public Car() {
		
	}

	public Car(String carNo, String carBrand, String buyDate, String driverNmae,String state) {
		this.carNo = carNo;
		this.carBrand = carBrand;
		this.buyDate = buyDate;
		this.driverNmae = driverNmae;
		this.state = state;
	}
	public abstract String toString();
	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getDriverNmae() {
		return driverNmae;
	}

	public void setDriverNmae(String driverNmae) {
		this.driverNmae = driverNmae;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
