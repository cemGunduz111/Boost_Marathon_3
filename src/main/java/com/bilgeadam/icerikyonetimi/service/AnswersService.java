package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.entity.Answers;
import com.bilgeadam.icerikyonetimi.repository.AnswersRepository;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

public class AnswersService extends MyFactoryService<AnswersRepository, Answers, Long> {
	public AnswersService() {
		super(new AnswersRepository());
	}
}
