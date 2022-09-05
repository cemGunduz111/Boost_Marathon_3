package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.entity.Questions;
import com.bilgeadam.icerikyonetimi.repository.QuestionsRepository;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

public class QuestionsService extends MyFactoryService<QuestionsRepository, Questions, Long> {
	public QuestionsService() {
		super(new QuestionsRepository());
	}
}
