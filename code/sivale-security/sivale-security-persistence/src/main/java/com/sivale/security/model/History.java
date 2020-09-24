package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the HISTORY database table.
 * 
 */
@Entity
@NamedQuery(name="History.findAll", query="SELECT h FROM History h")
public class History implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="\"DATE\"")
	private Date date;

	@Column(name="\"ACTION\"")
	private String action;

	private String info;

	@Column(name="\"MESSAGE\"")
	private String message;

	private String window;

	//bi-directional many-to-one association to UsersSv
	@ManyToOne
	@JoinColumn(name="IDUSER")
	private UsersSv usersSv;



	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getWindow() {
		return this.window;
	}

	public void setWindow(String window) {
		this.window = window;
	}

	public UsersSv getUsersSv() {
		return this.usersSv;
	}

	public void setUsersSv(UsersSv usersSv) {
		this.usersSv = usersSv;
	}

}