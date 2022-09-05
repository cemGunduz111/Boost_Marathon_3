package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.entity.Lesson;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

public class LessonRepository extends MyFactoryRepository<Lesson, Long> {
	public LessonRepository() {
		super(new Lesson());
	}
}
