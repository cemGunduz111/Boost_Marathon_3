package com.bilgeadam.icerikyonetimi.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilgeadam.icerikyonetimi.entity.Answers;
import com.bilgeadam.icerikyonetimi.entity.Lesson;
import com.bilgeadam.icerikyonetimi.entity.Questions;
import com.bilgeadam.icerikyonetimi.entity.Subject;
import com.bilgeadam.icerikyonetimi.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.entity.User;

public class HibernateUtils {

	// hibernate ile baðlantýmýzý kuracak

	private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(Answers.class);
			configuration.addAnnotatedClass(Lesson.class);
			configuration.addAnnotatedClass(Subject.class);
			configuration.addAnnotatedClass(SubjectDetail.class);
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(Questions.class);

			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

			return factory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
