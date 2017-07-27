package com.carsys.car;

import com.carsys.order.LitterCarOrder;
import com.carsys.order.MiniBusOrder;
import com.carsys.order.Order;
import com.carsys.order.OrderManage;
import com.carsys.order.TruckOrder;

public class RentSys {

	public static int carCount = 9;	
	Car[] cars = new Car[100];
	
	public RentSys() {
		cars[0] = new LittleCar("苏A888888","宝马" , "2017/7/24", "老司机","未使用");
		cars[3] = new LittleCar("苏B00001","奥迪","20140519","王小二","未使用");
		cars[4] = new LittleCar("苏B88888","卡迪拉克","20140719","王小三","使用");
		cars[1] = new MiniBus("苏B55555", "东风客运", "2014/5/8", "秋名山司机", "未使用");
		cars[5] = new MiniBus("苏D55555","奔驰","20100719","李小四","未使用");
		cars[6] = new MiniBus("苏D44444","奔驰","20100719","王五","使用");
		cars[2] = new Truck("苏A55555", "东风客运", "2014/5/8", "秋名山司机", "未使用");
		cars[7] = new Truck("苏E22222","奔驰","20100719","小六子","未使用");
		cars[8] = new Truck("苏E3333","奔驰","20100719","八阿哥","未使用");
	}
	/**
	 * 查找汽车
	 * @param carNo 通过汽车车牌号查找
	 * @return
	 */
	public Car getCar(String carNo){
		for(int index = 0;index<RentSys.carCount;index++){
			if(this.cars[index].getCarNo().equals(carNo)){
				return this.cars[index];
			}
		}
		return null;
	}
	/**
	 * 
	 * @param car
	 * @return
	 */
	public boolean addCar(Car car){
		if(this.getCar(car.getCarNo())!=null){
			return false;
		}
		this.cars[RentSys.carCount] = car;
		RentSys.carCount++;
		return true;
	}
	
	public boolean modifyCar(Car car){
		Car tmpCar = this.getCar(car.getCarNo());
		if(tmpCar == null){
			return false;
		}
		tmpCar = car;
		return true;
	}
	
	public boolean deleteCar(Car car){
		Car tmpCar = this.getCar(car.getCarNo());
		if(tmpCar == null){
			return false;
		}
		tmpCar.state = "报废";
		return true;
	}
	/**
	 * 租车   参数皆由操作人员输入
	 * @param carNo  车牌号
	 * @param orderNo  订单号
	 * @param userName  客户名
	 */
	public void rentCar(String carNo,String orderNo,String userName) {
		OrderManage order = new OrderManage();
		Order insertOrder;
		Car car = this.getCar(carNo);
		if(car instanceof LittleCar) {
			insertOrder = new LitterCarOrder();
		}else if(car instanceof MiniBus) {
			insertOrder = new MiniBusOrder();
		}else {
			insertOrder = new TruckOrder();
		}
		insertOrder.car = car;
		insertOrder.orderNo = orderNo;
		insertOrder.userName = userName;
		order.addOrder(insertOrder);
	}
	/**
	 * 还车    通过订单号查找
	 * @param orderNo  订单号
	 */
	public void retuenCar(String orderNo) {
		OrderManage order = new OrderManage();
		Order resultOrder = order.getOrder(orderNo);
		Car car = resultOrder.car;
		if(car instanceof LittleCar){
			LitterCarOrder tmpOrder = (LitterCarOrder)resultOrder;	
			tmpOrder.day = 10;
		}else if(car instanceof MiniBus){
			MiniBusOrder tmpOrder = (MiniBusOrder)resultOrder;	
			tmpOrder.tempKils = 100;
		}else {
			TruckOrder tmpOrder = (TruckOrder)resultOrder;	
			tmpOrder.tempKils = 100;
			tmpOrder.weight = 3;
		}
		resultOrder.setPrice();
	}
}
