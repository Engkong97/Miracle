package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mantabs.entity.master.MRegional;
import com.mantabs.entity.master.MWilayah;

public interface MRegionalDao extends JpaRepository<MRegional, String>{
	@Query(value = "select a.* from MMF_MST_REGIONAL a where status = 1 and a.id_wilayah = :idWilayah", nativeQuery = true)
	public List<MRegional> findAllRegional(
			@Param("idWilayah") String idWilayah
			);

}
