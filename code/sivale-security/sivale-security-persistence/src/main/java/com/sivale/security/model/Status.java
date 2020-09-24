package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the STATUS database table.
 * 
 */
@Entity
@NamedQuery(name="Status.findAll", query="SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idstatus;

	private BigDecimal enabled;

	private String statusname;

	//bi-directional many-to-one association to Company
	@OneToMany(mappedBy="status")
	private Set<Company> companies;

	//bi-directional many-to-one association to UsersSv
	@OneToMany(mappedBy="status")
	private Set<UsersSv> usersSvs;



	public long getIdstatus() {
		return this.idstatus;
	}

	public void setIdstatus(long idstatus) {
		this.idstatus = idstatus;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getStatusname() {
		return this.statusname;
	}

	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}

	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

	public Company addCompany(Company company) {
		getCompanies().add(company);
		company.setStatus(this);

		return company;
	}

	public Company removeCompany(Company company) {
		getCompanies().remove(company);
		company.setStatus(null);

		return company;
	}

	public Set<UsersSv> getUsersSvs() {
		return this.usersSvs;
	}

	public void setUsersSvs(Set<UsersSv> usersSvs) {
		this.usersSvs = usersSvs;
	}

	public UsersSv addUsersSv(UsersSv usersSv) {
		getUsersSvs().add(usersSv);
		usersSv.setStatus(this);

		return usersSv;
	}

	public UsersSv removeUsersSv(UsersSv usersSv) {
		getUsersSvs().remove(usersSv);
		usersSv.setStatus(null);

		return usersSv;
	}

}