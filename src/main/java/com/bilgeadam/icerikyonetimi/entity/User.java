package com.bilgeadam.icerikyonetimi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbluser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String surname;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Questions> questions;

	@OneToMany(mappedBy = "user")
	private List<Answers> answersList;

	@Enumerated(EnumType.STRING)
	ERole role;
	@Temporal(TemporalType.DATE)
	Date createdAt;
	@Temporal(TemporalType.DATE)
	Date updatedAt;

	boolean enabled;

	public User(String name, String surname, ERole role) {
		super();
		this.name = name;
		this.surname = surname;
		this.role = role;
	}

	public User(String name, String surname, List<Questions> questions, ERole role) {
		super();
		this.name = name;
		this.surname = surname;
		this.questions = questions;
		this.role = role;
		for (Questions qq : questions) {
			qq.setUser(this);
		}
	}

	public User() {
		super();
	}

	public List<Answers> getAnswersList() {
		return answersList;
	}

	public void setAnswersList(List<Answers> answersList) {
		this.answersList = answersList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ERole getRole() {
		return role;
	}

	public void setRole(ERole role) {
		this.role = role;
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
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", role=" + role + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
