package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MCabangDao;
import com.mantabs.collection.master.area_assignment.dto.MCabangDto;
import com.mantabs.collection.master.area_assignment.dto.MRegionalDto;
import com.mantabs.collection.master.area_assignment.service.MCabangSvc;
import com.mantabs.entity.master.MCabang;
import com.mantabs.entity.master.MRegional;

@Service("mCabangSvc")
@Transactional
public class MCabangSvcImpl implements MCabangSvc{
	@Autowired
	MCabangDao mCabangDao;
	
	@Override
	public List<MCabangDto> findAll(String idRegional) {
		List<MCabang> mCabang = mCabangDao.findAllCabang(idRegional);
		List<MCabangDto> mCabangDto = new ArrayList<>();
		for (MCabang cabang : mCabang) {
			MCabangDto dto = new MCabangDto();
			dto.setIdCabang(cabang.getIdCabang());
			dto.setNamaCabang(cabang.getNamaCabang());
			dto.setKelasCabang(cabang.getKelasCabang());
			dto.setIdWilayah(cabang.getIdWilayah());
			dto.setIdRegional(cabang.getIdRegional());
			mCabangDto.add(dto);
		}
		
		return mCabangDto;
	}

}
