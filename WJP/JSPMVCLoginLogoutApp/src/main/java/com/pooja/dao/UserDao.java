package com.pooja.dao;

import com.pooja.model.User;

public interface UserDao {
	void save(User user);
	boolean login(User user);
	void upload(int uid, String image);
}
