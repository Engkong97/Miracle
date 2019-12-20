package com.mantabs.collection.master.area_assignment.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.mantabs.collection.master.area_assignment.dto.MTrainerDto;
import com.mantabs.collection.master.area_assignment.service.MTrainerSvc;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class TrainerVmd {
	@WireVariable
	private MTrainerSvc mTrainerSvc;
	
	private List<MTrainerDto> trainerevent = new ArrayList<>();
	
	@Init
	@NotifyChange({"trainerevent"})
	public void init() {
		loadTrainer();

		System.out.println("Trainer : "+ trainerevent.size());
	}
	private List<MTrainerDto> loadTrainer() {
		trainerevent= mTrainerSvc.getTrainer();
		return trainerevent;
		// TODO Auto-generated method stub
		
	}

	public List<MTrainerDto> getTrainerevent() {
		return trainerevent;
	}
	public void setTrainerevent(List<MTrainerDto> trainerevent) {
		this.trainerevent = trainerevent;
	}
	
}
