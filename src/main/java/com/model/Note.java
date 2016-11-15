package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "note")
@Table(name = "note")
@XmlRootElement
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long nid;
	
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "title")
	private String title;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "created")
	private Date created;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "updated")
	private Date updated;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "usrid", referencedColumnName = "id")
	private User user;

	

	@XmlElement
	public long getNid() {
		return nid;
	}

	public void setNid(long nid) {
		this.nid = nid;
	}

	@XmlElement
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@XmlElement
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@XmlElement
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	@XmlElement
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
