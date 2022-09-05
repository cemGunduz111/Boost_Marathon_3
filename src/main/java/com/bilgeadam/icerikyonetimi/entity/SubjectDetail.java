package com.bilgeadam.icerikyonetimi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tblsubjectdetail")
public class SubjectDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Subject subject;

	@OneToOne
	private User user;

	private String title;

	private String description;

	private String article;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Questions questions;

	@Temporal(TemporalType.DATE)
	Date createdAt;
	@Temporal(TemporalType.DATE)
	Date updatedAt;

	boolean enabled;

	public SubjectDetail(Subject subject, User user, String title, String description, String article,
			Questions question) {
		super();
		this.subject = subject;
		this.user = user;
		this.title = title;
		this.description = description;
		this.article = article;
		this.questions = question;
	}

	public SubjectDetail() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "SubjectDetail [id=" + id + ", subject=" + subject + ", user=" + user + ", title=" + title
				+ ", description=" + description + ", article=" + article + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", enabled=" + enabled + "]";
	}

}
