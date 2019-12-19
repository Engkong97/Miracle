package com.mantabs.collection.master.area_assignment.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.collection.master.area_assignment.service.MEventSvc;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class AcademyCenterVmd {
	
	@WireVariable
	private MEventSvc mEventSvc;
	
	private List<MEventDto> imgevent = new ArrayList<>();
	
	@Init
	@NotifyChange({"imgevent"})
	public void init() {
		loadImgEvent();
		System.out.println("IMG : "+ imgevent.size());
	}
	
	public List<MEventDto> loadImgEvent() {
		imgevent.clear();
		imgevent = mEventSvc.listImgEvent();
		return imgevent;
	}

	public List<MEventDto> getImgevent() {
		return imgevent;
	}

	public void setImgevent(List<MEventDto> imgevent) {
		this.imgevent = imgevent;
	}
	
	

}
