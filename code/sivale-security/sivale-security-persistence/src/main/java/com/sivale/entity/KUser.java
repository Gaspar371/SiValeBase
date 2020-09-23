package com.sivale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sivale.architecture.model.BaseDO;

@Entity
@Table(name = "K_USER")
public class KUser extends BaseDO{

	@Id
	@Column(name = "ID_USER")
	private Integer idUser;

	@Column(name = "DS_NAME")
	private String dsName;

	@Column(name = "DS_LAST_NAME")
	private String dsLastName;

	@Column(name = "QT_AGE")
	private Integer qtAge;

	public KUser() {

	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getDsName() {
		return dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getDsLastName() {
		return dsLastName;
	}

	public void setDsLastName(String dsLastName) {
		this.dsLastName = dsLastName;
	}

	public Integer getQtAge() {
		return qtAge;
	}

	public void setQtAge(Integer qtAge) {
		this.qtAge = qtAge;
	}
}
