package com.sivale.security.model;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the COMPANYROLE database table.
 * 
 */
@Entity
@NamedQuery(name="Companyrole.findAll", query="SELECT c FROM Companyrole c")
public class Companyrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idcompanyrole;

	private BigDecimal enabled;

	private String name;

	//bi-directional many-to-one association to CompaniesRole
	@OneToMany(mappedBy="companyrole")
	private List<CompaniesRole> companiesRoles;

	public Companyrole() {
	}

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

	public List<CompaniesRole> getCompaniesRoles() {
		return this.companiesRoles;
	}

	public void setCompaniesRoles(List<CompaniesRole> companiesRoles) {
		this.companiesRoles = companiesRoles;
	}

	public CompaniesRole addCompaniesRole(CompaniesRole companiesRole) {
		getCompaniesRoles().add(companiesRole);
		companiesRole.setCompanyrole(this);

		return companiesRole;
	}

	public CompaniesRole removeCompaniesRole(CompaniesRole companiesRole) {
		getCompaniesRoles().remove(companiesRole);
		companiesRole.setCompanyrole(null);

		return companiesRole;
	}

}