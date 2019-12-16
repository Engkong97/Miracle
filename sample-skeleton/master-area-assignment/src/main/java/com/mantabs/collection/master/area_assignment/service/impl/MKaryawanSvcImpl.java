package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MKaryawanDao;
import com.mantabs.collection.master.area_assignment.dto.MCabangDto;
import com.mantabs.collection.master.area_assignment.dto.MJabatanDto;
import com.mantabs.collection.master.area_assignment.dto.MKaryawanDto;
import com.mantabs.collection.master.area_assignment.helper.Base;
import com.mantabs.collection.master.area_assignment.service.MKaryawanSvc;
import com.mantabs.entity.master.MCabang;
import com.mantabs.entity.master.MKaryawan;

@Service("mKaryawanSvc")
@Transactional
public class MKaryawanSvcImpl implements MKaryawanSvc {
	@Autowired
	MKaryawanDao mKaryawanDao;

	@Override
	public List<MJabatanDto> findJabatan(String id_cabang) {
		List<String> mKaryawan = mKaryawanDao.findJabatan(id_cabang);
		List<MJabatanDto> mKaryawanDto = new ArrayList<>();
		for (String o : mKaryawan) {
			MJabatanDto dto = new MJabatanDto();
			dto.setNamaJabatan((String)o);
			mKaryawanDto.add(dto);
		}
		
		System.out.println("TEST JABATAN : " + mKaryawan.toString());
		
		return mKaryawanDto;
	}

	@Override
	public List<MKaryawanDto> listEmployeeHbd() {
		List<MKaryawan> mKaryawan = mKaryawanDao.employeeHbd();
		List<MKaryawanDto> mKaryawanDto = new ArrayList<>();
		for (MKaryawan karyawan : mKaryawan) {
			MKaryawanDto dto = new MKaryawanDto();
			dto.setEmployeeCode(karyawan.getEmployeeCode());
			dto.setFirstName(karyawan.getFirstName()+" "+karyawan.getLastName());
			dto.setMiddleName(karyawan.getMiddleName());
			dto.setLastName(karyawan.getLastName());
			dto.setPositionCode(karyawan.getJabatan());
			dto.setBirthDate(Base.dateFormat(karyawan.getBirthDate()));
			mKaryawanDto.add(dto);
		}
		return mKaryawanDto;
	}

	@Override
	public List<MKaryawanDto> searchEmployee(String keywords) {
		List<MKaryawan> mKaryawan = mKaryawanDao.searchEmployee(keywords);
		List<MKaryawanDto> mKaryawanDtos = new ArrayList<>();
		for(MKaryawan karyawan : mKaryawan) {
			MKaryawanDto dto = new MKaryawanDto();
			dto.setEmployeeCode(karyawan.getEmployeeCode());
			dto.setFirstName(karyawan.getFirstName()+" "+karyawan.getLastName());
			dto.setMiddleName(karyawan.getMiddleName());
			dto.setLastName(karyawan.getLastName());
			dto.setPositionCode(karyawan.getJabatan());
			dto.setBirthDate(Base.dateFormat(karyawan.getBirthDate()));
			mKaryawanDtos.add(dto);
		}
		return mKaryawanDtos;
	}

}
