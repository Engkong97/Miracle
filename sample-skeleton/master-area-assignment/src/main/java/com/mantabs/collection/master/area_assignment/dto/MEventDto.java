package com.mantabs.collection.master.area_assignment.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class MEventDto {
	
	private int idEvent;

	private String Judul;
	
	private String Isi;
	
	private String PathImg;
	
	private String Type;
	
	private String IdEmployee;
	
	private String tglEvent;

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

	public String getTglEvent() {
		return tglEvent;
	}

	public void setTglEvent(String tglEvent) {
		this.tglEvent = tglEvent;
	}	
	
	
}
