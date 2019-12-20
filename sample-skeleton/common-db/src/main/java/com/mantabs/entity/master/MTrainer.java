package com.mantabs.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MMF_TRAINER")
public class MTrainer {

	@Id
	@Column(name="id_trainer")
	private String idTrainer;
	
	@Column(name="title_trainer")
	private String titleTrainer;
	
	@Column(name="cre_by")
	private String creBy;
	
	@Column(name="cre_date")
	private String creDate;
	
	@Column(name="mod_by")
	private String modBy;
	
	@Column(name="mod_date")
	private String modDate;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="employee_code")
	private String employeeCode;
	
	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getIdTrainer() {
		return idTrainer;
	}

	public void setIdTrainer(String idTrainer) {
		this.idTrainer = idTrainer;
	}

	public String getTitleTrainer() {
		return titleTrainer;
	}

	public void setTitleTrainer(String titleTrainer) {
		this.titleTrainer = titleTrainer;
	}

	public String getCreBy() {
		return creBy;
	}

	public void setCreBy(String creBy) {
		this.creBy = creBy;
	}

	public String getCreDate() {
		return creDate;
	}

	public void setCreDate(String creDate) {
		this.creDate = creDate;
	}

	public String getModBy() {
		return modBy;
	}

	public void setModBy(String modBy) {
		this.modBy = modBy;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
