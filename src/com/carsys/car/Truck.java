package com.carsys.car;

public class Truck extends Car{

	public Truck(String carNo, String carBrand, String buyDate, String driverNmae,String state) {
		super(carNo,carBrand,buyDate,driverNmae,state);
	}
	
	@Override
	public String toString() {
		return "����Ʒ�ƣ�"+this.getCarBrand()
				+"\n���ƺţ�"+this.getCarNo()
				+"\n�������ڣ�"+this.getBuyDate()
				+"\n��ʻԱ���֣�"+this.getDriverNmae()
				+"\n����״̬��"+this.getState();
	}
}
