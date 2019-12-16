package com.mantabs.collection.master.area_assignment.view;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MMF_VW_MST_PORTOFOLIO", schema = "MMF_MASTER")
public class PortofolioViewFull implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Column(name = "ID_CENTRO")
	private String idCentro;

	@Column(name = "NAMA_CENTRO")
	private String namaCentro;

	@Id
	@Column(name = "ID_CABANG")
	private String idCabang;

	@Column(name = "NAMA_CABANG")
	private String namaCabang;

	@Column(name = "ID_REGIONAL")
	private String idRegional;

	@Column(name = "NAMA_REGIONAL")
	private String namaRegional;

	@Column(name = "ID_WILAYAH")
	private String idWilayah;

	@Column(name = "NAMA_WILAYAH")
	private String namaWilayah;

	@Column(name = "JABATAN")
	private String jabatan;
	
	@Column(name = "NAMA_KARYAWAN")
	private String namaKaryawan;
	
	@Column(name = "PORTOFOLIO")
	private String portofolio;
	
	@Column(name = "KATEGORI_PRODUK")
	private String kategoriProduk;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "CREATED_DT")
	private Date createdDt;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "MODIFIED_DT")
	private Date modifiedDt;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}

	public String getNamaCentro() {
		return namaCentro;
	}

	public void setNamaCentro(String namaCentro) {
		this.namaCentro = namaCentro;
	}

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

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getNamaKaryawan() {
		return namaKaryawan;
	}

	public void setNamaKaryawan(String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}

	public String getPortofolio() {
		return portofolio;
	}

	public void setPortofolio(String portofolio) {
		this.portofolio = portofolio;
	}

	public String getKategoriProduk() {
		return kategoriProduk;
	}

	public void setKategoriProduk(String kategoriProduk) {
		this.kategoriProduk = kategoriProduk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDt() {
		return modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
