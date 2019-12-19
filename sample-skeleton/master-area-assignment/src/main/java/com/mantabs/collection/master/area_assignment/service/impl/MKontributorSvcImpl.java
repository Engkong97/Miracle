package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MKontributorDao;
import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.collection.master.area_assignment.dto.MWilayahDto;
import com.mantabs.collection.master.area_assignment.service.MKontributorSvc;
import com.mantabs.entity.master.MEvent;
import com.mantabs.entity.master.MWilayah;

@Service("mKontributorSvc")
@Transactional
public class MKontributorSvcImpl implements MKontributorSvc{
	@Autowired
	MKontributorDao mKontributorDao;
	
	@Override
	public List<MEventDto> getKontributor() {
		List<MEvent> mEvent = mKontributorDao.findKontributor();
		List<MEventDto> mEventDto = new ArrayList<>();
		for(MEvent event : mEvent) {
			MEventDto dto = new MEventDto();
			dto.setIdEmployee(event.getIdEmployee());
//			dto.setFirstName(event.getFirstName());
//			dto.setLastName(event.getLastName());
//			dto.setJabatan(event.getNamaJabatan());
			mEventDto.add(dto);
		}
		return mEventDto;
	}

}
