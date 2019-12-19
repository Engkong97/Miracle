package com.mantabs.entity.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MMF_MST_REGIONAL")
public class MRegional {

	@Id
	@Column(name="id_regional")
	private String idRegional;
	
	@Column(name="nama_regional")
	private String namaRegional;
	
	@Column(name="pic_reg_mkt")
	private String picRegMkt;
	
	@Column(name="pic_reg_opr")
	private String picRegOpt;
	
	@Column(name="status")
	private int isActive;
	
	@Column(name="created_dt")
	private Date creDate;
	
	@Column(name="created_by")
	private String creBy;
	
	@Column(name="modified_dt")
	private Date modDate;
	
	@Column(name="modified_by")
	private String modBy;
	
	@Column(name="end_dt")
	private Date endDate;
	
	@Column(name="id_karyawan")
	private String idKaryawan;
	
	@Column(name="id_wilayah")
	private String idWilayah;

	public String getIdRegional() {
		return idRegional;
	}

	public void setIdRegional(String idRegional) {
		this.idRegional = idRegional;
	}

	public String getNamaRegional() {
		return namaRegional;
	}

	public void setNamaRegional(String namaRegional) {
		this.namaRegional = namaRegional;
	}

	public String getPicRegMkt() {
		return picRegMkt;
	}

	public void setPicRegMkt(String picRegMkt) {
		this.picRegMkt = picRegMkt;
	}

	public String getPicRegOpt() {
		return picRegOpt;
	}

	public void setPicRegOpt(String picRegOpt) {
		this.picRegOpt = picRegOpt;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
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

	public String getIdKaryawan() {
		return idKaryawan;
	}

	public void setIdKaryawan(String idKaryawan) {
		this.idKaryawan = idKaryawan;
	}

	public String getIdWilayah() {
		return idWilayah;
	}

	public void setIdWilayah(String idWilayah) {
		this.idWilayah = idWilayah;
	}
	
	
}
