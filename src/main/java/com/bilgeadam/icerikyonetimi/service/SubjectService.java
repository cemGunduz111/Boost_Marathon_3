package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.entity.Subject;
import com.bilgeadam.icerikyonetimi.repository.SubjectRepository;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

public class SubjectService extends MyFactoryService<SubjectRepository, Subject, Long> {
	public SubjectService() {
		super(new SubjectRepository());
	}
}
