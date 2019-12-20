package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mantabs.entity.master.MTrainer;

public interface MTrainerDao  extends JpaRepository<MTrainer, String>{

	@Query( value = "select mt.*,  MSO.FIRST_NAME, MSO.LAST_NAME, MSO.EMAIL, MT.TITLE_TRAINER " + 
			" from mmf_trainer mt " + 
			" inner join mmf_stg_orange mso on mt.employee_code = mso.employee_code" + 
			" inner join mmf_mst_jabatan mmj on MSO.POSITION_CODE = MMJ.ID_JABATAN ", nativeQuery = true)
	 public List<MTrainer> findTrainer();
}
