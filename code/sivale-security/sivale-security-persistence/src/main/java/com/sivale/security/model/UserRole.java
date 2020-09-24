package com.sivale.security.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the USERROLE database table.
 * 
 */
@Entity
@NamedQuery(name="UserRole.findAll", query="SELECT u FROM UserRole u")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long iduserrole;

	private BigDecimal enabled;

	private String rolename;

	//bi-directional many-to-many association to UsersSv
	@ManyToMany(mappedBy="userroles")
	private Set<UsersSv> usersSvs;


	public long getIduserrole() {
		return this.iduserrole;
	}

	public void setIduserrole(long iduserrole) {
		this.iduserrole = iduserrole;
	}

	public BigDecimal getEnabled() {
		return this.enabled;
	}

	public void setEnabled(BigDecimal enabled) {
		this.enabled = enabled;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Set<UsersSv> getUsersSvs() {
		return this.usersSvs;
	}

	public void setUsersSvs(Set<UsersSv> usersSvs) {
		this.usersSvs = usersSvs;
	}

}