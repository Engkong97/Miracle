package com.mantabs.collection.master.area_assignment.viewmodel;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.json.JSONObject;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;



//@ToServerCommand("verify")
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class LoginVmd{

//	@WireVariable
//	LoginSvc loginSvc;
//
//	@WireVariable
//	MGlobalSvc mGlobalSvc;
//	
//	@WireVariable
//	MPasswordSvc mPasswordSvc;

	private String username;
	private String password;
	private boolean disabled = false;
	final String SECRET = "6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe"; //from reCaptcha

//	private MUserMonitoringDto monitoringDto = new MUserMonitoringDto();
//	private MPasswordDto mPasswordDto = new MPasswordDto();
//	private List<MPasswordDto> mPasswordDtos = new ArrayList<>();
	private boolean isPassExp;
	private Date date = new Date();
	private long time;
	private Timestamp timestamp;
	private String currentPass;
	private boolean captchaVisible;
	
	@Init
	public void load(){
		
	}
	
	@Command("login")
	@NotifyChange({ "username", "password", "captchaVisible", "disabled" })
	public void login() throws NoSuchAlgorithmException {
		if(username != null && password != null){
			if (username.equals("admin") && password.equals("admin")){
				Executions.sendRedirect("/admin/administrator.zul");
			} else if (username.equals("asdf") && password.equals("asdf")){
				Executions.sendRedirect("/home.zul");
			} else  {
				Clients.alert(
						"Username Atau Password Salah",
						"Warning", "");
			}
		} else {
			if(username == null){
				Clients.alert(
						"Username tidak boleh kosong",
						"Warning", "");
			} else if (password == null){
				Clients.alert(
						"Password tidak boleh kosong",
						"Warning", "");
			} else {
				Clients.alert(
					"Mohon Isi Semua Kolom",
					"Warning", "");
			}
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isPassExp() {
		return isPassExp;
	}

	public void setPassExp(boolean isPassExp) {
		this.isPassExp = isPassExp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCurrentPass() {
		return currentPass;
	}

	public void setCurrentPass(String currentPass) {
		this.currentPass = currentPass;
	}

	public boolean isCaptchaVisible() {
		return captchaVisible;
	}

	public void setCaptchaVisible(boolean captchaVisible) {
		this.captchaVisible = captchaVisible;
	}

//	@Command("login")
//	@NotifyChange({ "username", "password", "captchaVisible", "disabled" })
//	public void login() throws NoSuchAlgorithmException {
//		int maxWrong;
//		MGlobalDto mGlobalDto = mGlobalSvc
//				.findOneGlobalParameter("MaxPassword");
//		maxWrong = Integer.parseInt(mGlobalDto.getGlobalValue());
//
//		if (username != null && password != null) {
//			Map<String, Object> map = loginSvc.findRoleMenu(username, password);
//			System.out.println("=========>" + map.size());
//			// dsfMstUser2Dto = (DsfMstUser2Dto) map.get("dsfMstUser2");
//			monitoringDto = (MUserMonitoringDto) map.get("userMonitoring");
//			if (monitoringDto != null) {
//				if (monitoringDto.getUserid() != null
//						&& monitoringDto.getStatus().equals("1")
//						&& monitoringDto.getLoginCounter() < maxWrong) {
//					List<UserMenuAccordion> a = (List<UserMenuAccordion>) map.get("listMenu");
//					monitoringDto.setLisAccordions(a);
//					Sessions.getCurrent().setAttribute("user", monitoringDto);
//					MUserMonitoringDto dsfMstUserDtoSession = (MUserMonitoringDto) Sessions
//							.getCurrent().getAttribute("user");
//					// ================
//					Date da = new Date();
//					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//					DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
//					String tgl = df.format(da);
//					String loginTime = df2.format(da);
//					// dsfMstLoginHistorySvc.insertLoginHistory(dsfMstUser2Dto.getUserID(),
//					// tgl, loginTime);
//
//					// ===============
//					
//					/*
//					mPasswordDtos = mPasswordSvc.findPasswordByUser(monitoringDto.getUserid());
//					time = date.getTime();
//					Date oldpassdate = new Date(mPasswordDtos.get(mPasswordDtos.size() - 1).getDateModified().getTime());
//					long datediff = (time - oldpassdate.getTime()) / (24 * 60 * 60 * 1000);
//					
//					if (dsfMstUserDtoSession.getLoginTime() == null) {
//						if(monitoringDto.getPassword().equals(CryptoUtil.md5Java(monitoringDto.getUserid() + monitoringDto.getUserid()))) Sessions.getCurrent().setAttribute("isChangePass", true);
//						else if(datediff > 30)Sessions.getCurrent().setAttribute("isChangePass", true);
//						else Sessions.getCurrent().setAttribute("isChangePass", false);
//						Executions.sendRedirect("/index.zul");
//					}
//					else {
//						loginSvc.updateLoginTime(monitoringDto.getUserid());
//						if(monitoringDto.getPassword().equals(CryptoUtil.md5Java(monitoringDto.getUserid() + monitoringDto.getUserid()))) Sessions.getCurrent().setAttribute("isChangePass", true);
//						else if(datediff > 30)Sessions.getCurrent().setAttribute("isChangePass", true);
//						else Sessions.getCurrent().setAttribute("isChangePass", false);
//						Executions.sendRedirect("/index.zul");
//					}*/
//					Sessions.getCurrent().setAttribute("isChangePass", false);
//					Executions.sendRedirect("/index.zul");
//				}
//				else {
//					if (monitoringDto.getStatus().equals("0")) {
//						Clients.alert(
//								"Maaf User Anda Dinonaktifkan, Silahkan Hubungi Admin",
//								"Warning", "");
//					}
//					else /*if (!(monitoringDto.getRoleId().equals("R01")))*/ {
//						if (monitoringDto.getLoginCounter() < maxWrong) {
//							Clients.alert(
//									"Maaf UserId dan Password Tidak Valid",
//									"Warning", "");
//							if(monitoringDto.getLoginCounter() >= 3){
//								captchaVisible = true;
//								disabled = true;
//							}
//						}
//						else {
//							Clients.alert(
//									"Maaf User Anda Terkunci, Silahkan Hubungi Admin",
//									"Warning", "");
//						}
//
//						// Messagebox.show("Maaf UserId dan Password Tidak Valid",
//						// "Message", null,
//						// null, null);
//						setUsername(null);
//						setPassword(null);
//					}
//				}
//			}
//			else {
//				Clients.alert("User Name Tidak Ditemukan. Silakan Coba Lagi.",
//						"Warning", "");
//			}
//
//		}
//		else {
//			Messagebox.show("Mohon isi semua kolom", "Message", null, null,
//					null);
//		}
//		// TODO: handle exception
//	}
	
//	@Command("loginAdmin")
//	@NotifyChange({ "username", "password", "captchaVisible", "disabled" })
//	public void loginAdmin() throws NoSuchAlgorithmException {
//		int maxWrong;
//		MGlobalDto mGlobalDto = mGlobalSvc
//				.findOneGlobalParameter("MaxPassword");
//		maxWrong = Integer.parseInt(mGlobalDto.getGlobalValue());
//
//		if (username != null && password != null) {
//			Map<String, Object> map = loginSvc.findRoleMenu(username, password);
//			System.out.println("=========>" + map.size());
//			// dsfMstUser2Dto = (DsfMstUser2Dto) map.get("dsfMstUser2");
//			monitoringDto = (MUserMonitoringDto) map.get("userMonitoring");
//			if (monitoringDto != null) {
//				if (monitoringDto.getUserid() != null
//						&& monitoringDto.getStatus().equals("1")
//						&& monitoringDto.getLoginCounter() < maxWrong
//						&& monitoringDto.getRoleId().equals("R01")) {
//					List<UserMenuAccordion> a = (List<UserMenuAccordion>) map
//							.get("listMenu");
//					monitoringDto.setLisAccordions(a);
//					Sessions.getCurrent().setAttribute("user", monitoringDto);
//					MUserMonitoringDto dsfMstUserDtoSession = (MUserMonitoringDto) Sessions.getCurrent().getAttribute("user");
//					// ================
//					Date da = new Date();
//					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//					DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
//					String tgl = df.format(da);
//					String loginTime = df2.format(da);
//					// dsfMstLoginHistorySvc.insertLoginHistory(dsfMstUser2Dto.getUserID(),
//					// tgl, loginTime);
//
//					// ===============
//					if (dsfMstUserDtoSession.getLoginTime() == null) {
//						if(monitoringDto.getPassword().equals(CryptoUtil.md5Java(monitoringDto.getUserid() + monitoringDto.getUserid()))) Sessions.getCurrent().setAttribute("isChangePass", true);
//						else Sessions.getCurrent().setAttribute("isChangePass", false);
//						Executions.sendRedirect("/index.zul");
//					}
//					else {
//						loginSvc.updateLoginTime(monitoringDto.getUserid());
//						if(monitoringDto.getPassword().equals(CryptoUtil.md5Java(monitoringDto.getUserid() + monitoringDto.getUserid()))) Sessions.getCurrent().setAttribute("isChangePass", true);
//						else Sessions.getCurrent().setAttribute("isChangePass", false);
//						Executions.sendRedirect("/index.zul");
//					}
//				}
//				else {
//					if (monitoringDto.getStatus().equals("0")) {
//						Clients.alert(
//								"Maaf User Anda Dinonaktifkan, Silahkan Hubungi Admin",
//								"Warning", "");
//					}
//					else /*if (!(monitoringDto.getRoleId().equals("R01")))*/ {
//						if (monitoringDto.getLoginCounter() < maxWrong) {
//							Clients.alert(
//									"Maaf UserId dan Password Tidak Valid",
//									"Warning", "");
//							if(monitoringDto.getLoginCounter() >= 3){
//								captchaVisible = true;
//								disabled = true;
//							}
//						}
////						else if(monitoringDto.getLoginCounter() >= 3) captchaVisible = true;
//						else {
//							Clients.alert(
//									"Maaf User Anda Terkunci, Silahkan Hubungi Admin",
//									"Warning", "");
//						}
//
//						// Messagebox.show("Maaf UserId dan Password Tidak Valid",
//						// "Message", null,
//						// null, null);
//						setUsername(null);
//						setPassword(null);
//					}
//				}
//			}
//			else {
//				Clients.alert("User Name Tidak Ditemukan. Silakan Coba Lagi.",
//						"Warning", "");
//			}
//
//		}
//		else {
//			Messagebox.show("Mohon isi semua kolom", "Message", null, null,
//					null);
//		}
//		// TODO: handle exception
//	}
//	
//	@Command 
//	@NotifyChange("disabled")
//	public void verify(@BindingParam("response")String response) throws Exception{
//		System.out.println("Isi Response : "+response);
//		JSONObject result = RecaptchaVerifier.verifyResponse(SECRET, response);
//		if (Boolean.parseBoolean(result.get("success").toString())){
//			disabled = false;
//		}
//		else{
//			String errorCode = result.get("error-codes").toString();
//			//log or show error
//			Clients.showNotification(errorCode);
//		}
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public boolean isCaptchaVisible() {
//		return captchaVisible;
//	}
//
//	public void setCaptchaVisible(boolean captchaVisible) {
//		this.captchaVisible = captchaVisible;
//	}
//
//	public boolean isDisabled() {
//		return disabled;
//	}
//
//	public void setDisabled(boolean disabled) {
//		this.disabled = disabled;
//	}
	

}
