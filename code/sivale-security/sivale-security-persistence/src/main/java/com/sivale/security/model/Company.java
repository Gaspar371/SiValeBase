package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the COMPANY database table.
 * 
 */
@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idcompany;

	private String email;

	private String name;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="IDSTATUS")
	private Status status;

	//bi-directional many-to-many association to Companyrole
	@ManyToMany(mappedBy="companies")
	private Set<CompanyRole> companyroles;

	//bi-directional many-to-one association to UsersSv
	@OneToMany(mappedBy="company")
	private Set<UsersSv> usersSvs;


	public long getIdcompany() {
		return this.idcompany;
	}

	public void setIdcompany(long idcompany) {
		this.idcompany = idcompany;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Set<CompanyRole> getCompanyroles() {
		return this.companyroles;
	}

	public void setCompanyroles(Set<CompanyRole> companyroles) {
		this.companyroles = companyroles;
	}

	public Set<UsersSv> getUsersSvs() {
		return this.usersSvs;
	}

	public void setUsersSvs(Set<UsersSv> usersSvs) {
		this.usersSvs = usersSvs;
	}

	public UsersSv addUsersSv(UsersSv usersSv) {
		getUsersSvs().add(usersSv);
		usersSv.setCompany(this);

		return usersSv;
	}

	public UsersSv removeUsersSv(UsersSv usersSv) {
		getUsersSvs().remove(usersSv);
		usersSv.setCompany(null);

		return usersSv;
	}

}