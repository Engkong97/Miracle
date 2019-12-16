package com.mantabs.collection.master.area_assignment.service;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;

public interface LoginSvc {
	public Map<String , Object> findRoleMenu(String userId, String password) throws NoSuchAlgorithmException;
	public void updateLoginTime(String userId);
	public void updateWrongPass(int wrongPass, String userId);
	public void lockUser(String userId);
}
