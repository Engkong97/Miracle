package com.mantabs.collection.master.area_assignment.service.impl;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mantabs.collection.master.area_assignment.service.LoginSvc;


@Service("loginSvc")
@Transactional(readOnly = true)
public class LoginSvcImpl implements LoginSvc {

	@Override
	public Map<String, Object> findRoleMenu(String userId, String password) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLoginTime(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateWrongPass(int wrongPass, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lockUser(String userId) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Map<String, Object> findRoleMenu(String userId, String password)
//			throws NoSuchAlgorithmException {
//		Map<String, Object> map = new HashMap<>();
//		List<UserMenuAccordion> userMenuAccordions = new ArrayList<>();
//		
//		int wrongPass =0;
//		MGlobalDto mGlobalDto = mGlobalSvc.findOneGlobalParameter("role.admin");
//		String roleAdmin = mGlobalDto.getGlobalValue();
//
//		MUserMonitoring mUserMonitoring = mUserMonitoringDao.findByUserId(userId);
//
//		if (mUserMonitoring != null) {
//			if ((mUserMonitoring.getUserid() != null)) {
//				// ===========================
//				String concatUsernamePas = userId + password;
//				String encrypSHA1 = CryptoUtil.md5Java(concatUsernamePas);
//				System.out.println("Ini enkripnya = " + encrypSHA1);
//				// ===========================
//
//				
//				MUserMonitoringDto monitoringDto = new MUserMonitoringDto();
//				monitoringDto.setStatus(mUserMonitoring.getStatus());
//				monitoringDto.setRoleId(mUserMonitoring.getRoleId());
//				monitoringDto.setLoginCounter(mUserMonitoring.getLoginCounter());
//				wrongPass = mUserMonitoring.getLoginCounter();
//				if (mUserMonitoring.getPassword().equals("admin")) {
//					monitoringDto.setId(mUserMonitoring.getId());
//					monitoringDto.setArea(mUserMonitoring.getArea());
//					monitoringDto.setBranchCode(mUserMonitoring.getBranchCode());
//					monitoringDto.setBranchName(mUserMonitoring.getBranchName());
//					monitoringDto.setEmail(mUserMonitoring.getEmail());
//					monitoringDto.setEndDate(mUserMonitoring.getEndDate());
//					monitoringDto.setFullname(mUserMonitoring.getFullname());
//					monitoringDto.setKeySession(mUserMonitoring.getKeySession());
//					monitoringDto.setLoginTime(mUserMonitoring.getLoginTime());
//					monitoringDto.setPassword(mUserMonitoring.getPassword());
//					monitoringDto.setStartDate(mUserMonitoring.getStartDate());
//					monitoringDto.setType(mUserMonitoring.getType());
//					monitoringDto.setUserid(mUserMonitoring.getUserid());
//					map.put("userMonitoring", monitoringDto);
//					
//					updateWrongPass(0, userId);
//					
////					for (Object[] obj : listObjekUser) {
////						
//						List<MRoleAccessDto> listMenuRoles = mRoleAccessSvc
//								.findAccessMenu(mUserMonitoring.getRoleId());
//						if (listMenuRoles != null) {
//							for (int j = 0; j < listMenuRoles.size(); j++) {
//								String menuName = listMenuRoles.get(j)
//										.getMenuName();
//								UserMenuAccordion userMenuAccordion = new UserMenuAccordion(
//										listMenuRoles.get(j).getMenuName().toUpperCase(),
//										listMenuRoles.get(j).getAppRoleLink());
//								userMenuAccordions.add(userMenuAccordion);
//							}
//							map.put("listMenu", userMenuAccordions);
//						}
//						else {
//							map.put("userMonitoring", monitoringDto);
//							map.put("listMenu", userMenuAccordions);
//							return map;
//						}
////					
////					}
//				}
//				else {
//					if (mUserMonitoring.getRoleId().equals(roleAdmin)) {
//						wrongPass = 0;
//					}
//					else{
//						wrongPass++;
//					}
//					
//					updateWrongPass(wrongPass, userId);
//					monitoringDto.setLoginCounter(wrongPass);
//					MGlobalDto globalDto = mGlobalSvc.findOneGlobalParameter("MaxPassword");
//					if(monitoringDto.getLoginCounter() >= Integer.parseInt(globalDto.getGlobalValue())) lockUser(userId);
//					map.put("userMonitoring", monitoringDto);
//					map.put("listMenu", userMenuAccordions);
//					return map;
//				}
//
//			}
//			else {
//				map.put("userMonitoring", new MUserMonitoringDto());
//				map.put("listMenu", new ArrayList<>());
//				return new HashMap<>();
//			}
//		}
//		else {
//			map.put("userMonitoring", new MUserMonitoringDto());
//			map.put("listMenu", new ArrayList<>());
//			return new HashMap<>();
//		}
//
//		return map;
//
//	}
//
//	@Override
//	public void updateLoginTime(String userId) {
//		mUserMonitoringDao.updateLoginTime( userId);
//		
//	}
//
//	@Override
//	public void updateWrongPass(int wrongPass, String userId) {
//		mUserMonitoringDao.updateWrongPass(wrongPass, userId);
//		
//	}
//
//	@Override
//	public void lockUser(String userId) {
//		mUserMonitoringDao.lockUser(userId);
//	}

}
