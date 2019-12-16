package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mantabs.entity.master.MRegional;
import com.mantabs.entity.master.MWilayah;


public interface MWilayahDao extends JpaRepository<MWilayah, String> {
	@Query(value = "select a.* from MMF_MST_WILAYAH a ", nativeQuery = true)
	public List<MWilayah> findAllwilayah();
}
