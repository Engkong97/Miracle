package com.mantabs.collection.master.area_assignment.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.collection.master.area_assignment.dto.MKaryawanDto;
import com.mantabs.collection.master.area_assignment.service.MEventSvc;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class SideBarAcademyVmd {

	@WireVariable
	private MEventSvc mEventSvc;
	
	private List<MEventDto> event = new ArrayList<>();
	
	@Init
	@NotifyChange({"event"})
	public void init() {
		loadEvent();
		System.out.println("Event Size : " + event.size());
	}
	
	public List<MEventDto> loadEvent() {
		event = mEventSvc.listEvent();
		return event;
	}

	public List<MEventDto> getEvent() {
		return event;
	}

	public void setEvent(List<MEventDto> event) {
		this.event = event;
	}
	
	
}
