package com.pooja.service;

import com.pooja.model.User;

public interface UserService {
	void register(User user);
	boolean login(User user);
	void upload(int uid, String image);
	
}
