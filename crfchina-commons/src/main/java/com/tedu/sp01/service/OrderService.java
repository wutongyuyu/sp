package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * gerOrder����ȡ��������
	 * addOrder�����涩��
	 */
	Order getOrder(String orderId);
	void addOrder(Order order);
}
