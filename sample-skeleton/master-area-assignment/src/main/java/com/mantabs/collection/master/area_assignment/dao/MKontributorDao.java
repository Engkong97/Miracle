package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mantabs.entity.master.MKontributor;

public interface MKontributorDao extends JpaRepository<MKontributor, String>{
	@Query( value = "select mt.*, MMJ.NAMA_JABATAN, MSO.FIRST_NAME, MSO.LAST_NAME " + 
			" from mmf_trainer mt " + 
			" inner join mmf_stg_orange mso on mt.employee_code = mso.employee_code" + 
			" inner join mmf_mst_jabatan mmj on MSO.POSITION_CODE = MMJ.ID_JABATAN ", nativeQuery = true)
	public List<MKontributor> findKontributor();

}
