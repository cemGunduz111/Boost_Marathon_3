package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.repository.SubjectDetailRepository;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

public class SubjectDetailService extends MyFactoryService<SubjectDetailRepository, SubjectDetail, Long> {
	public SubjectDetailService() {
		super(new SubjectDetailRepository());
	}
}