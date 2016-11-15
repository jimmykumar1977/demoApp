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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity(name = "note")
@Table(name = "note")
@XmlRootElement(name="Notes")
@XmlSeeAlso(User.class)
@XmlType(propOrder = {"nid","title","note","user"})
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
	
	@Override
	public String toString() {
		return "Note [nid=" + nid + ", note=" + note + ", title=" + title + ", created=" + created + ", updated="
				+ updated + ", user=" + user.getEmail() + "]";
	}

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

	@XmlTransient
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@XmlTransient
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
