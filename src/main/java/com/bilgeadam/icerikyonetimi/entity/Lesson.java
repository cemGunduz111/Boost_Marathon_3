package com.bilgeadam.icerikyonetimi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbllesson")
public class Lesson {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String description;

	@OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Subject> subjectList;

	@Temporal(TemporalType.DATE)
	Date createdAt;
	@Temporal(TemporalType.DATE)
	Date updatedAt;

	boolean enabled;

	public Lesson(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Lesson(String name, String description, List<Subject> subjectList) {
		super();
		this.name = name;
		this.description = description;
		this.subjectList = subjectList;
	}

	public Lesson() {
		super();
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Lesson [id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", enabled=" + enabled + "]";
	}

}
