package com.mantabs.collection.master.area_assignment.service;

import java.util.List;

import com.mantabs.collection.master.area_assignment.dto.MEventDto;
import com.mantabs.entity.master.MEvent;

public interface MKontributorSvc {
	public List<MEventDto> getKontributor();
}
