package com.mantabs.collection.master.area_assignment.service;

import java.util.List;

import com.mantabs.collection.master.area_assignment.dto.MCabangDto;
import com.mantabs.collection.master.area_assignment.dto.MRegionalDto;

public interface MCabangSvc {
	public List<MCabangDto> findAll(String idRegional);
}
