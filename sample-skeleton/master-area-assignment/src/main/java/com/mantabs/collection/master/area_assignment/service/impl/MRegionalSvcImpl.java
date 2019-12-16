package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MRegionalDao;
import com.mantabs.collection.master.area_assignment.dto.MRegionalDto;
import com.mantabs.collection.master.area_assignment.service.MRegionalSvc;
import com.mantabs.entity.master.MRegional;

@Service("mRegionalSvc")
@Transactional
public class MRegionalSvcImpl implements MRegionalSvc{
	@Autowired
	MRegionalDao mRegionalDao;
	
	@Override
	public List<MRegionalDto> findAll(String idWilayah) {
		List<MRegional> mRegional = mRegionalDao.findAllRegional(idWilayah);
		List<MRegionalDto>  mRegionalDto = new ArrayList<>();
		for (MRegional regional : mRegional) {
			MRegionalDto dto = new MRegionalDto();
			dto.setIdRegional(regional.getIdWilayah());
			dto.setNamaRegional(regional.getNamaRegional());
			dto.setPicRegMkt(regional.getPicRegMkt());
			dto.setPicRegOpt(regional.getPicRegOpt());
			dto.setIsActive(regional.getIsActive());
			dto.setCreDate(regional.getCreDate());
			dto.setCreBy(regional.getCreBy());
			dto.setModDate(regional.getModDate());
			dto.setModBy(regional.getModBy());
			dto.setEndDate(regional.getEndDate());
			dto.setIdKaryawan(regional.getIdKaryawan());
			dto.setIdWilayah(regional.getIdWilayah());
			mRegionalDto.add(dto);
		}
		return mRegionalDto;
	}

}
