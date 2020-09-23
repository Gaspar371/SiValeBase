package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COMPANIES_ROLES database table.
 * 
 */
@Embeddable
public class CompaniesRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long idcompany;

	@Column(insertable=false, updatable=false)
	private long idcompanyrole;

	public CompaniesRolePK() {
	}
	public long getIdcompany() {
		return this.idcompany;
	}
	public void setIdcompany(long idcompany) {
		this.idcompany = idcompany;
	}
	public long getIdcompanyrole() {
		return this.idcompanyrole;
	}
	public void setIdcompanyrole(long idcompanyrole) {
		this.idcompanyrole = idcompanyrole;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CompaniesRolePK)) {
			return false;
		}
		CompaniesRolePK castOther = (CompaniesRolePK)other;
		return 
			(this.idcompany == castOther.idcompany)
			&& (this.idcompanyrole == castOther.idcompanyrole);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idcompany ^ (this.idcompany >>> 32)));
		hash = hash * prime + ((int) (this.idcompanyrole ^ (this.idcompanyrole >>> 32)));
		
		return hash;
	}
}