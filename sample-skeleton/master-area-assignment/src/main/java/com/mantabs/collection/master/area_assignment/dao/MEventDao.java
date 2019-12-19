package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mantabs.entity.master.MEvent;

public interface MEventDao extends JpaRepository<MEvent, String>{
	@Query(value = "select a.* from MMF_EVENT a ", nativeQuery = true)
	public List<MEvent> listEvent();
	
	@Query(value = "select * from mmf_event where rownum <= 5 order by id_event desc", nativeQuery = true)
	public List<MEvent> listImgEvent();
	
}
