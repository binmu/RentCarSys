package com.carsys.car;

public class MiniBus extends Car{

	public MiniBus(String carNo, String carBrand, String buyDate, String driverNmae,String state) {
		super(carNo,carBrand,buyDate,driverNmae,state);
	}
	
	@Override
	public String toString() {
		return "车辆品牌："+this.getCarBrand()
				+"\n车牌号："+this.getCarNo()
				+"\n购买日期："+this.getBuyDate()
				+"\n驾驶员名字："+this.getDriverNmae()
				+"\n车辆状态："+this.getState();
	}
}
