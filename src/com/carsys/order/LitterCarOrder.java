package com.carsys.order;

import com.carsys.car.Car;

public class LitterCarOrder extends Order{

	public int day;
	public LitterCarOrder(){
		
	}
	public LitterCarOrder(String orderNo,Car car,String userName,double price,int day){
		super(orderNo,car,userName,price);
		this.day =day;
	}
	
	@Override
	public void setPrice() {
		this.price = 500 * this.day;
		this.car.setState("已归还");
		System.out.println(this.toString()+"\n租期："+this.day+"天！\n单价：500元/天"+"\n总消费："+this.price+"元！");
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
