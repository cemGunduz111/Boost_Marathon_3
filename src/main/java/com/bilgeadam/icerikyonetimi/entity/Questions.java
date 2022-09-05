package com.bilgeadam.icerikyonetimi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@NamedQueries({ @NamedQuery(name = "Questions.findMax", query = "SELECT ") })
@Entity
@Table(name = "tblquestions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SubjectDetail> subjectDetail;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	private String title;
	private String question;

	@Temporal(TemporalType.DATE)
	Date createdAt;
	@Temporal(TemporalType.DATE)
	Date updatedAt;

	boolean enabled;

	public Questions() {
		super();
	}

	public Questions(String title, String question) {
		super();
		this.title = title;
		this.question = question;
	}

	public List<SubjectDetail> getSubjectDetail() {
		return subjectDetail;
	}

	public void setSubjectDetail(List<SubjectDetail> subjectDetail) {
		this.subjectDetail = subjectDetail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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
		return "Questions [id=" + id + ", title=" + title + ", question=" + question + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
