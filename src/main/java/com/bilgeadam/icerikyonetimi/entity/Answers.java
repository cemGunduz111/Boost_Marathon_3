package com.bilgeadam.icerikyonetimi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tblanswers")
public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Questions questions;

	@ManyToOne
	private User user;

	@Temporal(TemporalType.DATE)
	Date createdAt;
	@Temporal(TemporalType.DATE)
	Date updatedAt;

	boolean enabled;

	public Answers(Questions questions, User user) {
		super();
		this.questions = questions;
		this.user = user;
	}

	public Answers() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		return "Answers [id=" + id + ", questions=" + questions + ", user=" + user + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
