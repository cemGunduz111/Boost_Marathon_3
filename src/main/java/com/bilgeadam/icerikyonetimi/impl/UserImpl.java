package com.bilgeadam.icerikyonetimi.impl;

import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.icerikyonetimi.entity.ERole;
import com.bilgeadam.icerikyonetimi.entity.Questions;
import com.bilgeadam.icerikyonetimi.entity.User;
import com.bilgeadam.icerikyonetimi.service.UserService;

public class UserImpl {
	private UserService userService;

	public UserImpl() {
		userService = new UserService();
	}

	public void createUser() {
		Questions questions = new Questions("Integral", "Double integral");
		Questions questions2 = new Questions("Cebir", "3 Bilinmeyenli denklem");
		Questions questions3 = new Questions("Cebir", "4 Bilinmeyenli denklem");
		Questions questions4 = new Questions("Cebir", "5 Bilinmeyenli denklem");
		Questions questions5 = new Questions("Cebir", "6 Bilinmeyenli denklem");
		Questions questions6 = new Questions("Cebir", "7 Bilinmeyenli denklem");
		Questions questions7 = new Questions("Cebir", "8 Bilinmeyenli denklem");
		List<Questions> user_Questions = new ArrayList<>();

		Questions questions11 = new Questions("Integral", "Double integral");
		Questions questions211 = new Questions("Cebir", "55 Bilinmeyenli denklem");
		List<Questions> user_Questions11 = new ArrayList<>();

		user_Questions.add(questions);
		user_Questions.add(questions2);
		user_Questions.add(questions3);
		user_Questions.add(questions4);
		// 1 nolu id-> 4 adet soru
		user_Questions11.add(questions5);
		user_Questions11.add(questions6);
		user_Questions11.add(questions7);
		user_Questions11.add(questions11);
		user_Questions11.add(questions211);
		// 2 nolu id-> 5 adet soru
		User admin = new User("Cem", "Gündüz", user_Questions, ERole.ADMIN);
		User editor = new User("Emre", "Gündüz", user_Questions11, ERole.EDITOR);
		User other = new User("Gürsel", "Gündüz", ERole.OTHER);
		User user = new User("Hülya", "Gündüz", ERole.USER);

		userService.save(List.of(admin, editor, other, user));
	}

}
