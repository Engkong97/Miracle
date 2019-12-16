package com.mantabs.collection.master.area_assignment.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.mantabs.collection.master.area_assignment.dto.MKaryawanDto;
import com.mantabs.collection.master.area_assignment.service.MKaryawanSvc;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class CenterVmd {
	@WireVariable
	private MKaryawanSvc mKaryawanSvc;
	
	private List<MKaryawanDto> employee = new ArrayList<MKaryawanDto>();
	
	@Init
	@NotifyChange({"employee"})
	public void init() {
		loadEmployeeHBD();
		System.out.println("HBD Size : " + employee.size());
	}
	
	public List<MKaryawanDto> loadEmployeeHBD() {
		employee.clear();
		employee = mKaryawanSvc.listEmployeeHbd();
		return employee;
	}

	public List<MKaryawanDto> getEmployee() {
		return employee;
	}

	public void setEmployee(List<MKaryawanDto> employee) {
		this.employee = employee;
	}

}
