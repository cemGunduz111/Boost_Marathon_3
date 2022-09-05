package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.entity.User;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long> {
	public UserRepository() {
		super(new User());
	}
}
