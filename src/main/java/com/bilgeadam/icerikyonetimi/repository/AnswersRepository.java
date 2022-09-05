package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.entity.Answers;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

public class AnswersRepository extends MyFactoryRepository<Answers, Long> {
	public AnswersRepository() {
		super(new Answers());
	}
}
