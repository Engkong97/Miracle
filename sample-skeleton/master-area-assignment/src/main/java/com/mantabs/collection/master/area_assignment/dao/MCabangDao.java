package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mantabs.entity.master.MCabang;
import com.mantabs.entity.master.MRegional;

public interface MCabangDao extends JpaRepository<MCabang, String> {
	@Query(value = "select a.* from MMF_MST_CABANG a where status = 1 and a.id_regional = :idRegional", nativeQuery = true)
	public List<MCabang> findAllCabang(@Param("idRegional") String idRegional);

}
