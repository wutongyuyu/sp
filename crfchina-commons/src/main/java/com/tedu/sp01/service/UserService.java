package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * getUser��ȡ�û�����
	 * addScore�������û�����
	 */
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
