package com.mantabs.collection.master.area_assignment.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;

import com.mantabs.collection.master.area_assignment.dto.MCabangDto;
import com.mantabs.collection.master.area_assignment.dto.MJabatanDto;
import com.mantabs.collection.master.area_assignment.dto.MKaryawanDto;
import com.mantabs.collection.master.area_assignment.dto.MRegionalDto;
import com.mantabs.collection.master.area_assignment.dto.MWilayahDto;
import com.mantabs.collection.master.area_assignment.service.MCabangSvc;
import com.mantabs.collection.master.area_assignment.service.MKaryawanSvc;
import com.mantabs.collection.master.area_assignment.service.MRegionalSvc;
import com.mantabs.collection.master.area_assignment.service.MWilayahSvc;
import com.mantabs.entity.master.MJabatan;
import com.mantabs.entity.master.MenuItem;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class BannerController {

	@WireVariable
	private MWilayahSvc mWilayahSvc;

	@WireVariable
	private MRegionalSvc mRegionalSvc;

	@WireVariable
	private MCabangSvc mCabangSvc;

	@WireVariable
	private MKaryawanSvc mKaryawanSvc;

	private List<MWilayahDto> listWilayah = new ArrayList<MWilayahDto>();
	private List<MRegionalDto> listRegional = new ArrayList<MRegionalDto>();
	private List<MCabangDto> listCabang = new ArrayList<MCabangDto>();
	private List<MJabatanDto> listJabatan = new ArrayList<MJabatanDto>();
	private List<MKaryawanDto> listKaryawan = new ArrayList<MKaryawanDto>();

	private List<MenuItem> nodes;

	private static List<MenuItem> menus = new ArrayList<MenuItem>();

	private String keywords = "";

	@Init
	@NotifyChange({ "nodes", "menus" })
	public void init() {
		menus.clear();
		loadDataWilayah();

		{

			for (MWilayahDto jod : listWilayah) {
				MenuItem m1_lv1 = new MenuItem();
				m1_lv1.setName(jod.getNamaWilayah());
				m1_lv1.setLevel(1);
				for (MRegionalDto reg : loadDataRegional(jod.getIdWilayah())) {
					MenuItem m2_lvl2 = new MenuItem();
					m2_lvl2.setName(reg.getNamaRegional());
					m2_lvl2.setLevel(2);
					m1_lv1.addChild(m2_lvl2);
					for (MCabangDto cabang : loadDataCabangl(reg.getIdWilayah(), reg.getIdRegional())) {
						MenuItem m3_lvl3 = new MenuItem();
						m3_lvl3.setName(cabang.getNamaCabang());
						m3_lvl3.setLevel(3);
						m2_lvl2.addChild(m3_lvl3);
						for (MJabatanDto mJabatan : loadDataJabatan(cabang.getIdCabang())) {
							MenuItem m4_lvl4 = new MenuItem();
							m4_lvl4.setName(mJabatan.getNamaJabatan());
							m4_lvl4.setLevel(4);
							m3_lvl3.addChild(m4_lvl4);
						}
					}
				}
				menus.add(m1_lv1);
			}

		}

		nodes = new ArrayList<MenuItem>();
		nodes = getAllMenus();
		System.out.println("NODES : " + listWilayah.size());
		System.out.println("NODES : " + loadDataWilayah().size());
	}

	public List<MWilayahDto> loadDataWilayah() {
		listWilayah.clear();
		listWilayah = mWilayahSvc.findAll();
		return listWilayah;
	}

	public List<MRegionalDto> loadDataRegional(String idWilayah) {
		listRegional.clear();
		listRegional = mRegionalSvc.findAll(idWilayah);
		return listRegional;
	}

	public List<MCabangDto> loadDataCabangl(String idWilayah, String idRegional) {
		listCabang.clear();
		listCabang = mCabangSvc.findAll(idWilayah, idRegional);
		return listCabang;
	}

	public List<MJabatanDto> loadDataJabatan(String id_cabang) {
		listJabatan.clear();
		listJabatan = mKaryawanSvc.findJabatan(id_cabang);
		return listJabatan;
	}

	@Command("search")
	@NotifyChange({ "keywords", "listKaryawan", })
	public void search() {
//		if (keywords.contentEquals("")) {
//			Clients.alert("Data Tidak Ditemukan", "Warning", "");
//		} else {
//			listKaryawan.clear();
//			listKaryawan = mKaryawanSvc.searchEmployee("%" + keywords + "%");
//		}
	}

	@Command("clearData")
	@NotifyChange({ "keywords", "listKaryawan", })
	public void clearData() {
		listKaryawan.clear();
		keywords = "";

	}

	public static List<MenuItem> getAllMenus() {
		return new ArrayList<MenuItem>(menus);
	}

	public List<MWilayahDto> getListWilayah() {
		return listWilayah;
	}

	public void setListWilayah(List<MWilayahDto> listWilayah) {
		this.listWilayah = listWilayah;
	}

	public List<MenuItem> getNodes() {
		return nodes;
	}

	public void setNodes(List<MenuItem> nodes) {
		this.nodes = nodes;
	}

	public static List<MenuItem> getMenus() {
		return menus;
	}

	public static void setMenus(List<MenuItem> menus) {
		BannerController.menus = menus;
	}

	public MWilayahSvc getmWilayahSvc() {
		return mWilayahSvc;
	}

	public void setmWilayahSvc(MWilayahSvc mWilayahSvc) {
		this.mWilayahSvc = mWilayahSvc;
	}

	public List<MRegionalDto> getListRegional() {
		return listRegional;
	}

	public void setListRegional(List<MRegionalDto> listRegional) {
		this.listRegional = listRegional;
	}

	public List<MCabangDto> getListCabang() {
		return listCabang;
	}

	public void setListCabang(List<MCabangDto> listCabang) {
		this.listCabang = listCabang;
	}

	public List<MJabatanDto> getListJabatan() {
		return listJabatan;
	}

	public void setListJabatan(List<MJabatanDto> listJabatan) {
		this.listJabatan = listJabatan;
	}

	public List<MKaryawanDto> getListKaryawan() {
		return listKaryawan;
	}

	public void setListKaryawan(List<MKaryawanDto> listKaryawan) {
		this.listKaryawan = listKaryawan;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}