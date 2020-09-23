package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMPANIES_ROLES database table.
 * 
 */
@Entity
@Table(name="COMPANIES_ROLES")
@NamedQuery(name="CompaniesRole.findAll", query="SELECT c FROM CompaniesRole c")
public class CompaniesRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CompaniesRolePK id;

	//bi-directional many-to-one association to Companyrole
	@ManyToOne
	@JoinColumn(name="IDCOMPANYROLE")
	private Companyrole companyrole;

	public CompaniesRole() {
	}

	public CompaniesRolePK getId() {
		return this.id;
	}

	public void setId(CompaniesRolePK id) {
		this.id = id;
	}

	public Companyrole getCompanyrole() {
		return this.companyrole;
	}

	public void setCompanyrole(Companyrole companyrole) {
		this.companyrole = companyrole;
	}

}