package com.carsys.order;

import com.carsys.car.Car;

public abstract class Order {

	public String orderNo;
	public Car car;
	public String userName;
	public double price;
	
	public Order(){
		
	}
	public Order(String orderNo,Car car,String userName,double price){
		this.orderNo = orderNo;
		this.car = car;
		this.userName = userName;
		this.price = price;
	}
	
	public abstract void setPrice();
	public abstract String toString();
}
