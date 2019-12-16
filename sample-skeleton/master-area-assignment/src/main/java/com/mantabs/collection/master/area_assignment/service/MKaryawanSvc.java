package com.mantabs.collection.master.area_assignment.service;

import java.util.List;import com.mantabs.collection.master.area_assignment.dao.MKaryawanDao;
import com.mantabs.collection.master.area_assignment.dto.MJabatanDto;
import com.mantabs.collection.master.area_assignment.dto.MKaryawanDto;

public interface MKaryawanSvc {
	public List<MJabatanDto> findJabatan(String id_cabang);
	public List<MKaryawanDto> listEmployeeHbd();
	public List<MKaryawanDto> searchEmployee(String keywords);
}
