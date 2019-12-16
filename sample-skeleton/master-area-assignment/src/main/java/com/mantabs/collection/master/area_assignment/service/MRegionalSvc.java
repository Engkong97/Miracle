package com.mantabs.collection.master.area_assignment.service;

import java.util.List;

import com.mantabs.collection.master.area_assignment.dto.MRegionalDto;
import com.mantabs.collection.master.area_assignment.dto.MWilayahDto;

public interface MRegionalSvc {
	public List<MRegionalDto> findAll(String idWilayah);
}
