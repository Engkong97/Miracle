package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mantabs.entity.master.MEvent;

public interface MKontributorDao extends JpaRepository<MEvent, String>{
	@Query( value = "select e.ID_EMPLOYEE, o.FIRST_NAME, o.LAST_NAME , j.NAMA_JABATAN " + 
			"from MMF_EVENT e " + 
			"left join MMF_STG_ORANGE o on e.ID_EMPLOYEE = o.EMPLOYEE_CODE " + 
			"left join MMF_MST_JABATAN j on O.POSITION_CODE = J.ID_JABATAN", nativeQuery = true)
	public List<MEvent> findKontributor();

}
