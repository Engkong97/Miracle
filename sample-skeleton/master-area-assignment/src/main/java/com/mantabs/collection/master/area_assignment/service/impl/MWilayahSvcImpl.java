package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MWilayahDao;
import com.mantabs.collection.master.area_assignment.dto.MWilayahDto;
import com.mantabs.collection.master.area_assignment.service.MWilayahSvc;
import com.mantabs.entity.master.MWilayah;

@Service("mWilayahSvc")
@Transactional
public class MWilayahSvcImpl implements MWilayahSvc{
	@Autowired
	MWilayahDao mWilayahDao;
	
	@Override
	public List<MWilayahDto> findAll() {
		List<MWilayah> mWilayah = mWilayahDao.findAllwilayah();
		List<MWilayahDto> mWilayahDtos = new ArrayList<>();
		for(MWilayah wilayah: mWilayah){
			MWilayahDto mWilayahDto = new MWilayahDto();
			mWilayahDto.setIdWilayah(wilayah.getIdWilayah());
			mWilayahDto.setNamaWilayah(wilayah.getNamaWilayah());
			mWilayahDto.setIsActive(wilayah.getIsActive());
			mWilayahDto.setCreateDate(wilayah.getCreateDate());
			mWilayahDto.setCreateBy(wilayah.getCreateBy());
			mWilayahDto.setModDate(wilayah.getModDate());
			mWilayahDto.setModBy(wilayah.getModBy());
			mWilayahDto.setEndDate(wilayah.getEndDate());
			mWilayahDto.setIdKaryawan(wilayah.getIdKaryawan());
			mWilayahDtos.add(mWilayahDto);
		}
		return mWilayahDtos;
	}

}
