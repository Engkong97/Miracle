package com.mantabs.entity.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MMF_EVENT")
public class MEvent {

	@Id
	@Column(name="id_event")
	private int idEvent;

	@Column(name="judul")
	private String Judul;
	
	@Column(name="isi_kontributor")
	private String Isi;
	
	@Column(name="path_img")
	private String PathImg;
	
	@Column(name="type")
	private String Type;
	
	@Column(name="id_employee")
	private String IdEmployee;
	
	@Column(name="position_code")
	private String positionCode;
	
	@Column(name="cre_by")
	private String creBy;
	
	@Column(name="cre_date")
	private String creDate;
	
	@Column(name="mod_by")
	private String modBy;
	
	@Column(name="mod_date")
	private String modDate;
	
	@Column(name="tgl_event")
	private Date tglEvent;

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getJudul() {
		return Judul;
	}

	public void setJudul(String judul) {
		Judul = judul;
	}

	public String getIsi() {
		return Isi;
	}

	public void setIsi(String isi) {
		Isi = isi;
	}

	public String getPathImg() {
		return PathImg;
	}

	public void setPathImg(String pathImg) {
		PathImg = pathImg;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		IdEmployee = idEmployee;
	}

	public Date getTglEvent() {
		return tglEvent;
	}

	public void setTglEvent(Date tglEvent) {
		this.tglEvent = tglEvent;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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
	
	
	
	
}
