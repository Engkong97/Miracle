package com.mantabs.collection.master.area_assignment.dto;

import java.util.Date;

import javax.persistence.Column;

public class MJabatanDto {
	
	private String idJabatan;
	
	private String namaJabatan;
	
	private String status;
	
	private Date creDate;
	
	private String creBy;
	
	private Date modDate;
	
	private String modBy;
	
	private Date endDate;

	public String getIdJabatan() {
		return idJabatan;
	}

	public void setIdJabatan(String idJabatan) {
		this.idJabatan = idJabatan;
	}

	public String getNamaJabatan() {
		return namaJabatan;
	}

	public void setNamaJabatan(String namaJabatan) {
		this.namaJabatan = namaJabatan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
