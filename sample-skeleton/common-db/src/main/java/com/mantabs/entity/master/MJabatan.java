package com.mantabs.entity.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MMF_MST_JABATAN")
public class MJabatan {
	@Id
	@Column(name="id_jabatan")
	private String idJabatan;
	
	@Column(name="nama_jabatan")
	private String namaJabatan;
	
	@Column(name="status")
	private String status;
	
	@Column(name="created_dt")
	private Date creDate;
	
	@Column(name="created_by")
	private String creBy;
	
	@Column(name="modified_dt")
	private Date modDate;
	
	@Column(name="modified_by")
	private String modBy;
	
	@Column(name="end_date")
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

	public Date getCreDate() {
		return creDate;
	}

	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}

	public String getCreBy() {
		return creBy;
	}

	public void setCreBy(String creBy) {
		this.creBy = creBy;
	}

	public Date getModDate() {
		return modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	public String getModBy() {
		return modBy;
	}

	public void setModBy(String modBy) {
		this.modBy = modBy;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
