package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MKontributorDao;
import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.collection.master.area_assignment.dto.MKontributorDto;
import com.mantabs.collection.master.area_assignment.dto.MWilayahDto;
import com.mantabs.collection.master.area_assignment.service.MKontributorSvc;
import com.mantabs.entity.master.MEvent;
import com.mantabs.entity.master.MKontributor;
import com.mantabs.entity.master.MWilayah;

@Service("mKontributorSvc")
@Transactional
public class MKontributorSvcImpl implements MKontributorSvc{
	@Autowired
	MKontributorDao mKontributorDao;
	
	@Override
	public List<MKontributorDto> getKontributor() {
		List<MKontributor> mKontributor = mKontributorDao.findKontributor();
		List<MKontributorDto> mKontributorDto = new ArrayList<>();
		for(MKontributor kontributor : mKontributor) {
			MKontributorDto dto = new MKontributorDto();
			dto.setEmployeeCode(kontributor.getEmployeeCode());
			if (kontributor.getLastName()== null) {
				dto.setFirstName(kontributor.getFirstName()+ " " );
				
			} else {
				dto.setFirstName(kontributor.getFirstName()+" " + kontributor.getLastName());
			}
			dto.setNamaJabatan(kontributor.getNamaJabatan());
			
			mKontributorDto.add(dto);
		}
		return mKontributorDto;
	}

}
