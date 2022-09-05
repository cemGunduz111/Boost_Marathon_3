package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.entity.Subject;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

public class SubjectRepository extends MyFactoryRepository<Subject, Long> {
	public SubjectRepository() {
		super(new Subject());
	}
}
