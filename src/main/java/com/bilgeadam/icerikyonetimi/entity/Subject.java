package com.bilgeadam.icerikyonetimi.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tblsubject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Lesson lesson;

	@Temporal(TemporalType.DATE)
	Date createdAt;
	@Temporal(TemporalType.DATE)
	Date updatedAt;

	boolean enabled;

	public Subject() {
		super();
	}

	public Subject(String name, Lesson lesson) {
		super();
		this.name = name;
		this.lesson = lesson;
	}

	public Subject(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
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
		return "Subject [name=" + name + ", lesson=" + lesson + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", enabled=" + enabled + "]";
	}

}
