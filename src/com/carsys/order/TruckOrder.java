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
		this.car.setState("�ѹ黹");
		System.out.println(this.toString()+"\n��ʻ��������"+this.tempKils+"km��"
				+"\n����������"+this.weight+"�֣�\n���ۣ�10Ԫ/km*��"
				+"\n�����ѣ�"+this.price+"Ԫ!");
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
