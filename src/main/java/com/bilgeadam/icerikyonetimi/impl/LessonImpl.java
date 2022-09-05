package com.bilgeadam.icerikyonetimi.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.bilgeadam.icerikyonetimi.entity.Lesson;
import com.bilgeadam.icerikyonetimi.entity.Questions;
import com.bilgeadam.icerikyonetimi.entity.Subject;
import com.bilgeadam.icerikyonetimi.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.entity.User;
import com.bilgeadam.icerikyonetimi.service.LessonService;
import com.bilgeadam.icerikyonetimi.service.SubjectDetailService;
import com.bilgeadam.icerikyonetimi.service.SubjectService;
import com.bilgeadam.icerikyonetimi.utility.HibernateUtils;

public class LessonImpl {
	private LessonService lessonService;
	private SubjectService subjectService;
	private SubjectDetailService subjectDetailService;
	private static Session ss;

	public LessonImpl() {
		lessonService = new LessonService();
		subjectService = new SubjectService();
		subjectDetailService = new SubjectDetailService();

	}

	public void createLesson() {
		Lesson lesson1 = new Lesson("ders1", "4 konu");
		Lesson lesson2 = new Lesson("ders2", "3 konu");
		Lesson lesson3 = new Lesson("ders3", "2 konu");
		lessonService.save(List.of(lesson1, lesson2, lesson3));

		Subject subject1 = new Subject("subject1", lesson1);
		Subject subject2 = new Subject("subject2", lesson1);
		Subject subject3 = new Subject("subject3", lesson1);
		Subject subject4 = new Subject("subject4", lesson1);

		Subject subject5 = new Subject("subject5", lesson2);
		Subject subject6 = new Subject("subject6", lesson2);
		Subject subject7 = new Subject("subject7", lesson2);

		Subject subject8 = new Subject("subject8", lesson3);
		Subject subject9 = new Subject("subject9", lesson3);
		subjectService.save(List.of(subject1, subject1, subject2, subject3, subject4, subject5, subject6, subject7,
				subject8, subject9));

		// userimpl'de oluþan objeleri çekip burda kullanýyorum

		String hql2 = "select u from User as u where  u.id =:id";
		ss = HibernateUtils.getSessionFactory().openSession();
		TypedQuery<User> typedQuery = ss.createQuery(hql2, User.class);
		typedQuery.setParameter("id", 1L);
		System.out.println(typedQuery);
		User user1 = typedQuery.setMaxResults(1).getSingleResult();
		ss.close();

		hql2 = "select u from User as u where  u.id =:id";
		ss = HibernateUtils.getSessionFactory().openSession();
		typedQuery = ss.createQuery(hql2, User.class);
		typedQuery.setParameter("id", 2L);
		System.out.println(typedQuery);
		User user2 = typedQuery.setMaxResults(1).getSingleResult();
		ss.close();

		hql2 = "select u from Questions as u where  u.id =:id";
		ss = HibernateUtils.getSessionFactory().openSession();
		TypedQuery<Questions> typedQueryq = ss.createQuery(hql2, Questions.class);
		typedQueryq.setParameter("id", 1L);
		System.out.println(typedQuery);
		Questions question1 = typedQueryq.setMaxResults(1).getSingleResult();
		ss.close();

		hql2 = "select u from Questions as u where  u.id =:id";
		ss = HibernateUtils.getSessionFactory().openSession();
		typedQueryq = ss.createQuery(hql2, Questions.class);
		typedQueryq.setParameter("id", 2L);
		System.out.println(typedQuery);
		Questions question2 = typedQueryq.setMaxResults(1).getSingleResult();
		ss.close();

		SubjectDetail sDetail = new SubjectDetail(subject1, user1, "detail1", "desc1", "article1", question1);
		SubjectDetail sDetail2 = new SubjectDetail(subject1, user1, "detail1", "desc1", "article1", question1);
		SubjectDetail sDetail3 = new SubjectDetail(subject2, user1, "detail2", "desc2", "article2", question1);
		SubjectDetail sDetail4 = new SubjectDetail(subject3, user1, "detail3", "desc3", "article3", question1);
		SubjectDetail sDetail5 = new SubjectDetail(subject4, user2, "detail4", "desc4", "article4", question2);
		SubjectDetail sDetail6 = new SubjectDetail(subject5, user2, "detail5", "desc5", "article5", question2);
		subjectDetailService.save(List.of(sDetail, sDetail2, sDetail3, sDetail4, sDetail5, sDetail6));
	}
}
