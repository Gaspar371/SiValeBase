package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LASTPASSWORDS database table.
 * 
 */
@Entity
@Table(name="LASTPASSWORDS")
@NamedQuery(name="LastPassword.findAll", query="SELECT l FROM LastPassword l")
public class LastPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//bi-directional many-to-one association to UsersSv
	@Id
	@ManyToOne
	@JoinColumn(name="IDUSER")
	private UsersSv usersSv;
	@Id
	private String password;

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public UsersSv getUsersSv() {
		return this.usersSv;
	}

	public void setUsersSv(UsersSv usersSv) {
		this.usersSv = usersSv;
	}	

}