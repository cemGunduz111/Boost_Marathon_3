package com.bilgeadam.icerikyonetimi.main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.bilgeadam.icerikyonetimi.entity.User;
import com.bilgeadam.icerikyonetimi.impl.LessonImpl;
import com.bilgeadam.icerikyonetimi.impl.UserImpl;
import com.bilgeadam.icerikyonetimi.utility.HibernateUtils;

public class Test {
	private static Session ss;
	private static Transaction tt;
	private static EntityManager entityManager;
	private static CriteriaBuilder builder;

	public static void main(String[] args) {

		entityManager = HibernateUtils.getSessionFactory().openSession();
		builder = entityManager.getCriteriaBuilder();
		UserImpl userImpl = new UserImpl();
		LessonImpl lessonImpl = new LessonImpl();
		userImpl.createUser();
		lessonImpl.createLesson();
		findMaxContent(); // 2 no'lu idyi vermeli
	}

	public static void findMaxContent() {

		String hql = "select q.user.id from Questions q group by q.user order by count(q.user) desc";
		ss = HibernateUtils.getSessionFactory().openSession();
		Query sum = ss.createQuery(hql);// .setMaxResults(1).getSingleResult();
		System.out.println(sum.getResultList().get(0));

		String hql2 = "select u from User as u  where  u.id =:id";
		TypedQuery<User> typedQuery = ss.createQuery(hql2, User.class);
		typedQuery.setParameter("id", sum.getResultList().get(0));
		User user = typedQuery.setMaxResults(1).getSingleResult();
		System.out.println(user);
	}

}
