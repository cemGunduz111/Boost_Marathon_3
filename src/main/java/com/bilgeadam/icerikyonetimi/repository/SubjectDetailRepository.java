package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

public class SubjectDetailRepository extends MyFactoryRepository<SubjectDetail, Long> {
	public SubjectDetailRepository() {
		super(new SubjectDetail());
	}
}
