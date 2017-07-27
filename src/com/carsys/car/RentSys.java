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
		cars[0] = new LittleCar("��A888888","����" , "2017/7/24", "��˾��","δʹ��");
		cars[3] = new LittleCar("��B00001","�µ�","20140519","��С��","δʹ��");
		cars[4] = new LittleCar("��B88888","��������","20140719","��С��","ʹ��");
		cars[1] = new MiniBus("��B55555", "�������", "2014/5/8", "����ɽ˾��", "δʹ��");
		cars[5] = new MiniBus("��D55555","����","20100719","��С��","δʹ��");
		cars[6] = new MiniBus("��D44444","����","20100719","����","ʹ��");
		cars[2] = new Truck("��A55555", "�������", "2014/5/8", "����ɽ˾��", "δʹ��");
		cars[7] = new Truck("��E22222","����","20100719","С����","δʹ��");
		cars[8] = new Truck("��E3333","����","20100719","�˰���","δʹ��");
	}
	/**
	 * ��������
	 * @param carNo ͨ���������ƺŲ���
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
		tmpCar.state = "����";
		return true;
	}
	/**
	 * �⳵   �������ɲ�����Ա����
	 * @param carNo  ���ƺ�
	 * @param orderNo  ������
	 * @param userName  �ͻ���
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
	 * ����    ͨ�������Ų���
	 * @param orderNo  ������
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
