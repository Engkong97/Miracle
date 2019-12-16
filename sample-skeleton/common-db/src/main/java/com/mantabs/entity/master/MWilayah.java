package com.mantabs.entity.master;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MMF_MST_WILAYAH")
public class MWilayah {
	
	@Id
	@Column(name="id_wilayah")
	private String idWilayah;
	
	@Column(name="nama_wilayah")
	private String namaWilayah;
	
	@Column(name="status")
	private int isActive;
	
	@Column(name="created_dt")
	private Date createDate;
	
	@Column(name="created_by")
	private String createBy;
	
	@Column(name="modified_dt")
	private Date modDate;
	
	@Column(name="modified_by")
	private String modBy;
	
	@Column(name="end_dt")
	private Date endDate;
	
	@Column(name="id_karyawan") 
	private String idKaryawan;
	

	public String getIdWilayah() {
		return idWilayah;
	}

	public void setIdWilayah(String idWilayah) {
		this.idWilayah = idWilayah;
	}

	public String getNamaWilayah() {
		return namaWilayah;
	}

	public void setNamaWilayah(String namaWilayah) {
		this.namaWilayah = namaWilayah;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public String getIdKaryawan() {
		return idKaryawan;
	}

	public void setIdKaryawan(String idKaryawan) {
		this.idKaryawan = idKaryawan;
	}
	
	
	
	
	
	

}
