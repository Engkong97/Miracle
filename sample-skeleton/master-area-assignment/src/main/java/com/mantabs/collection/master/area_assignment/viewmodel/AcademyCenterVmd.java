package com.mantabs.collection.master.area_assignment.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.collection.master.area_assignment.dto.MKontributorDto;
import com.mantabs.collection.master.area_assignment.service.MEventSvc;
import com.mantabs.collection.master.area_assignment.service.MKontributorSvc;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class AcademyCenterVmd {
	//event
	@WireVariable
	private MEventSvc mEventSvc;
	
	private List<MEventDto> imgevent = new ArrayList<>();
	
	//Kontributor
	@WireVariable
	private MKontributorSvc mKontributorSvc;
	
	private List<MKontributorDto> kontributor = new ArrayList<>();
	
	
	@Init
	@NotifyChange({"imgevent"})
	public void init() {
		loadImgEvent();
		loadKontributor();
		System.out.println("IMG : "+ imgevent.size());
	}
	
	public List<MEventDto> loadImgEvent() {
		imgevent.clear();
		imgevent = mEventSvc.listImgEvent();
		return imgevent;
	}
	
	private List<MKontributorDto> loadKontributor() {
		kontributor = mKontributorSvc.getKontributor();
		return kontributor;
		// TODO Auto-generated method stub
		
	}

	public List<MEventDto> getImgevent() {
		return imgevent;
	}

	public void setImgevent(List<MEventDto> imgevent) {
		this.imgevent = imgevent;
	}

	public List<MKontributorDto> getKontributor() {
		return kontributor;
	}

	public void setKontributor(List<MKontributorDto> kontributor) {
		this.kontributor = kontributor;
	}
	
	

}
