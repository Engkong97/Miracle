package com.mantabs.collection.master.area_assignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mantabs.collection.master.area_assignment.dto.MKaryawanDto;
import com.mantabs.entity.master.MCabang;
import com.mantabs.entity.master.MJabatan;
import com.mantabs.entity.master.MKaryawan;

public interface MKaryawanDao extends JpaRepository<MKaryawan, String>{
	@Query(value = "select mmj.NAMA_JABATAN from MMF_STG_ORANGE mso " + 
			"left join MMF_MST_JABATAN  mmj on mso.POSITION_CODE = mmj.ID_JABATAN " + 
			"where mso.BRANCH_CODE = :id_cabang ", nativeQuery = true)
	public List<String> findJabatan(@Param("id_cabang") String idCabang);
	
	@Query(value = "select a.*, b.NAMA_JABATAN from MMF_STG_ORANGE a  "
			+ "left join MMF_MST_JABATAN b on a.POSITION_CODE = b.ID_JABATAN "
			+ "where to_char(a.BIRTHDATE, 'Month') = to_char(sysdate, 'Month') "
			+ "order by to_char(a.BIRTHDATE, 'Day') asc", nativeQuery = true)
	public List<MKaryawan> employeeHbd();
	
	@Query(value="select a.*, b.NAMA_JABATAN from MMF_STG_ORANGE a  "
			+ "left join MMF_MST_JABATAN b on a.POSITION_CODE = b.ID_JABATAN "
			+ "where a.first_name like UPPER(:keywords)", nativeQuery = true)
	public List<MKaryawan> searchEmployee(@Param("keywords") String keywords);
}
