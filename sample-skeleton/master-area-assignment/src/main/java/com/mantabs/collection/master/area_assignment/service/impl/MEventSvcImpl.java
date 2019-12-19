package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MEventDao;
import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.collection.master.area_assignment.helper.HelperBase;
import com.mantabs.collection.master.area_assignment.service.MEventSvc;
import com.mantabs.entity.master.MEvent;

@Service("mEventSvc")
@Transactional
public class MEventSvcImpl implements MEventSvc{
	@Autowired
	MEventDao mEventDao;

	@Override
	public List<MEventDto> listEvent() {
		List<MEvent> mEvent = mEventDao.listEvent();
		System.out.println("EVENT : " + mEventDao.listEvent().size());
		List<MEventDto> eventDto = new ArrayList<>();
		for(MEvent event :  mEvent) {
			MEventDto dto = new MEventDto();
			dto.setJudul(event.getJudul());
			dto.setTglEvent(HelperBase.dateFormat(event.getTglEvent()));
			eventDto.add(dto);
			
		}
		return eventDto;
	}

}
