package com.mantabs.collection.master.area_assignment.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantabs.collection.master.area_assignment.dao.MTrainerDao;
import com.mantabs.collection.master.area_assignment.dto.MTrainerDto;
import com.mantabs.collection.master.area_assignment.service.MTrainerSvc;
import com.mantabs.entity.master.MTrainer;

@Service("mTrainerSvc")
@Transactional
public class MTrainerSvcImpl implements MTrainerSvc {
	@Autowired
	MTrainerDao mTrainerDao;

	@Override
	public List<MTrainerDto> getTrainer() {
		List<MTrainer> mTrainer = mTrainerDao.findTrainer();
		List<MTrainerDto> mTrainerDto = new ArrayList<>();
		for(MTrainer trainer : mTrainer) {
			MTrainerDto dto = new MTrainerDto();
			dto.setEmployeeCode(trainer.getEmployeeCode());
			if (trainer.getLastName()== null) {
				dto.setFirstName(trainer.getFirstName()+ " " );
				
			} else {
				dto.setFirstName(trainer.getFirstName()+" " + trainer.getLastName());
			}
			dto.setEmail(trainer.getEmail());
			dto.setTitleTrainer(trainer.getTitleTrainer());
			
			mTrainerDto.add(dto);
			
		}
		// TODO Auto-generated method stub
		return mTrainerDto;
	}
}
