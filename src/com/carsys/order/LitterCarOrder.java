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
		this.car.setState("�ѹ黹");
		System.out.println(this.toString()+"\n���ڣ�"+this.day+"�죡\n���ۣ�500Ԫ/��"+"\n�����ѣ�"+this.price+"Ԫ��");
		System.out.println("�����ɹ���������");
		this.car.setState("δʹ��");
	}
	@Override
	public String toString() {
		return "������ţ�"+this.orderNo
				+"\n"+this.car.toString()
				+"\n�ͻ�������"+this.userName;	
	}

}
