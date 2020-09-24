package com.sivale.security.model;


import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the USERS_SV database table.
 * 
 */
@Entity
@Table(name="USERS_SV")
@NamedQuery(name="UsersSv.findAll", query="SELECT u FROM UsersSv u")
public class UsersSv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long iduser;

	@Column(name="\"2FACODE\"")
	private String _facode;

	@Column(name="\"2FATIME\"")
	private Timestamp _fatime;

	private String email;

	private BigDecimal failedattemps;

	private String firstname;

	private Timestamp lastaccess;

	private String lastname;

	private BigDecimal sessions;

	private Timestamp timelocked;

	//bi-directional many-to-one association to History
	@OneToMany(mappedBy="usersSv")
	private Set<History> histories;

	//bi-directional many-to-one association to Lastpassword
	@OneToMany(mappedBy="usersSv")
	private Set<LastPassword> lastpasswords;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="IDCOMPANY")
	private Company company;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="IDSTATUS")
	private Status status;

	//bi-directional many-to-many association to Userrole
	@ManyToMany
	@JoinTable(
		name="USERS_ROLES"
		, joinColumns={
			@JoinColumn(name="IDUSER")
			}
		, inverseJoinColumns={
			@JoinColumn(name="IDUSERROLE")
			}
		)
	private Set<UserRole> userroles;



	public long getIduser() {
		return this.iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	public String get_facode() {
		return this._facode;
	}

	public void set_facode(String _facode) {
		this._facode = _facode;
	}

	public Timestamp get_fatime() {
		return this._fatime;
	}

	public void set_fatime(Timestamp _fatime) {
		this._fatime = _fatime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getFailedattemps() {
		return this.failedattemps;
	}

	public void setFailedattemps(BigDecimal failedattemps) {
		this.failedattemps = failedattemps;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Timestamp getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Timestamp lastaccess) {
		this.lastaccess = lastaccess;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigDecimal getSessions() {
		return this.sessions;
	}

	public void setSessions(BigDecimal sessions) {
		this.sessions = sessions;
	}

	public Timestamp getTimelocked() {
		return this.timelocked;
	}

	public void setTimelocked(Timestamp timelocked) {
		this.timelocked = timelocked;
	}

	public Set<History> getHistories() {
		return this.histories;
	}

	public void setHistories(Set<History> histories) {
		this.histories = histories;
	}

	public History addHistory(History history) {
		getHistories().add(history);
		history.setUsersSv(this);

		return history;
	}

	public History removeHistory(History history) {
		getHistories().remove(history);
		history.setUsersSv(null);

		return history;
	}

	public Set<LastPassword> getLastpasswords() {
		return this.lastpasswords;
	}

	public void setLastpasswords(Set<LastPassword> lastpasswords) {
		this.lastpasswords = lastpasswords;
	}

	public LastPassword addLastpassword(LastPassword lastpassword) {
		getLastpasswords().add(lastpassword);
		lastpassword.setUsersSv(this);

		return lastpassword;
	}

	public LastPassword removeLastpassword(LastPassword lastpassword) {
		getLastpasswords().remove(lastpassword);
		lastpassword.setUsersSv(null);

		return lastpassword;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Set<UserRole> getUserroles() {
		return this.userroles;
	}

	public void setUserroles(Set<UserRole> userroles) {
		this.userroles = userroles;
	}

}