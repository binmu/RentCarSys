package com.carsys.order;

import com.carsys.car.Car;

public class TruckOrder extends Order{

	public int weight;
	public double tempKils;
	
	public TruckOrder(){
		
	}
	public TruckOrder(String orderNo,Car car,String userName,double price,double tempKils,int weight){
		super(orderNo,car,userName,price);
		this.tempKils =tempKils;
		this.weight = weight;
	}
	@Override
	public void setPrice() {
		this.price = 10 * this.weight * this.tempKils;
		this.car.setState("已归还");
		System.out.println(this.toString()+"\n行驶公里数："+this.tempKils+"km！"
				+"\n承载重量："+this.weight+"吨！\n单价：10元/km*吨"
				+"\n总消费："+this.price+"元!");
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
