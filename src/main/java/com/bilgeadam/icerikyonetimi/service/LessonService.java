package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.entity.Lesson;
import com.bilgeadam.icerikyonetimi.repository.LessonRepository;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

public class LessonService extends MyFactoryService<LessonRepository, Lesson, Long> {
	public LessonService() {
		super(new LessonRepository());
	}
}
