package com.carsys.order;


public class OrderManage {

	public static int orderCount = 0;
	Order[] orders = new Order[200];
	
	public OrderManage() {
		//orders[0] = new LitterCarOrder();
	}
	public Order getOrder(String orderNo){
		//System.out.println(orderNo);
		for(int index = 0;index<OrderManage.orderCount;index++){
			//System.out.println(index);
			//System.out.println(this.orders[0].orderNo);
			if(this.orders[index].orderNo.equals(orderNo)){
				//System.out.println(index);
				return this.orders[index];
			}
		}
		return null;
	}
	
	public boolean addOrder(Order order){
		if(this.getOrder(order.orderNo)!=null){
			return false;
		}
		order.car.setState("使用中");
		this.orders[OrderManage.orderCount] = order;
		System.out.println(this.orders[OrderManage.orderCount].toString());
		System.out.println("租用成功！！！\n");
		OrderManage.orderCount++;
		//System.out.println(OrderManage.orderCount);
		return true;
	}
	
	public boolean modifyOrder(Order order){
		if(this.getOrder(order.orderNo)!=null){
			return false;
		}
		Order tmpOrder = this.getOrder(order.orderNo);
		tmpOrder = order;		
		return true;
	}
}
