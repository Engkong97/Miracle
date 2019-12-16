package com.mantabs.collection.master.area_assignment.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import com.mantabs.entity.master.MWilayah;
import com.mantabs.entity.master.MenuItem;

public class MWilayahDto {
	private String idWilayah;
	
	private String namaWilayah;
	
	private int isActive;
	
	private Date createDate;
	
	private String createBy;
	
	private Date modDate;
	
	private String modBy;
	
	private Date endDate;

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
