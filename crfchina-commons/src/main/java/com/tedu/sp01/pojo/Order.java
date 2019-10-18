package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id; //����id���û�id��ʱ��������ֵ
	private User user;
	private List<Item> items;//������������Ʒ�б�
}
