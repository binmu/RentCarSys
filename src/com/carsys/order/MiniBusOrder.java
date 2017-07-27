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
		this.car.setState("�ѹ黹");
		System.out.println(this.toString()+"\n��ʻ��������"+this.tempKils+"km��\n���ۣ�10Ԫ/km"+"\n�����ѣ�"+this.price+"Ԫ��");
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
