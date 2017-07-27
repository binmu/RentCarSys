package com.carsys.order;

import com.carsys.car.Car;

public class MiniBusOrder extends Order{

	public double tempKils;

	
	public MiniBusOrder(String orderNo,Car car,String userName,double price,double tempKils){
		super(orderNo,car,userName,price);
		this.tempKils =tempKils;
	}


	public MiniBusOrder() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void setPrice() {
		this.price = 10 * this.tempKils;
		this.car.setState("已归还");
		System.out.println(this.toString()+"\n行驶公里数："+this.tempKils+"km！\n单价：10元/km"+"\n总消费："+this.price+"元！");
		System.out.println("还车成功！！！！");
		this.car.setState("未使用");
	}


	@Override
	public String toString() {
		return "订单编号："+this.orderNo
				+"\n"+this.car.toString()
				+"\n客户姓名："+this.userName;
	}
	
	
}
