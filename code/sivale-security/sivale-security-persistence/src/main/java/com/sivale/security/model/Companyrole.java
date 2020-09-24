package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the COMPANYROLE database table.
 * 
 */
@Entity
@NamedQuery(name="CompanyRole.findAll", query="SELECT c FROM CompanyRole c")
public class CompanyRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idcompanyrole;

	private BigDecimal enabled;

	private String name;

	//bi-directional many-to-many association to Company
	@ManyToMany
	@JoinTable(
		name="COMPANIES_ROLES"
		, joinColumns={
			@JoinColumn(name="IDCOMPANYROLE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="IDCOMPANY")
			}
		)
	private Set<Company> companies;


	public long getIdcompanyrole() {
		return this.idcompanyrole;
	}

	public void setIdcompanyrole(long idcompanyrole) {
		this.idcompanyrole = idcompanyrole;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

}