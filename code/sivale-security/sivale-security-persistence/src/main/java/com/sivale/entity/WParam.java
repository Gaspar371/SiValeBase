package com.sivale.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "W_PARAM")
public class WParam {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DS_VALUE")
	private String dsValue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDsValue() {
		return dsValue;
	}

	public void setDsValue(String dsValue) {
		this.dsValue = dsValue;
	}

}
