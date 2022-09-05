package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.entity.User;
import com.bilgeadam.icerikyonetimi.repository.UserRepository;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User, Long> {
	public UserService() {
		super(new UserRepository());
	}

}
