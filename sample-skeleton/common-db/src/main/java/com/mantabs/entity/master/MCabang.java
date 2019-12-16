package com.mantabs.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MMF_MST_CABANG")
public class MCabang {
	@Id
	@Column(name="id_cabang")
	private String idCabang;

	@Column(name="nama_cabang")
	private String namaCabang;
	
	@Column(name="kelas_cabang")
	private String kelasCabang;
	
	@Column(name="id_wilayah")
	private String idWilayah;
	
	@Column(name="id_regional")
	private String idRegional;

	public String getIdCabang() {
		return idCabang;
	}

	public void setIdCabang(String idCabang) {
		this.idCabang = idCabang;
	}

	public String getNamaCabang() {
		return namaCabang;
	}

	public void setNamaCabang(String namaCabang) {
		this.namaCabang = namaCabang;
	}

	public String getKelasCabang() {
		return kelasCabang;
	}

	public void setKelasCabang(String kelasCabang) {
		this.kelasCabang = kelasCabang;
	}

	public String getIdWilayah() {
		return idWilayah;
	}

	public void setIdWilayah(String idWilayah) {
		this.idWilayah = idWilayah;
	}

	public String getIdRegional() {
		return idRegional;
	}

	public void setIdRegional(String idRegional) {
		this.idRegional = idRegional;
	}
	
	
	
}
