package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * getItemsͨ������id��ȡ��Ʒ�б�
	 * decreaseNumbers���ڱ��涩��ʱ������ٵ���Ʒ���
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
