package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.entity.Questions;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

public class QuestionsRepository extends MyFactoryRepository<Questions, Long> {
	public QuestionsRepository() {
		super(new Questions());
	}
}
