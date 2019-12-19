package com.mantabs.collection.master.area_assignment.viewmodel;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class HomeViewModel {
	
	private String url = "";
	private String urlSideBar = "";
	
	
	@Init
	@NotifyChange({ "url", "urlSideBar"})
	public void init(){
		System.out.println("URL : " + BannerController.flag);
		if(BannerController.flag.equals("academy")) {
			setUrl("/academy/academy_center.zul");
			setUrlSideBar("/academy/academy_side_bar.zul");
		} else {
			setUrl("/dashboard/center.zul");
			setUrlSideBar("/dashboard/side_bar.zul");
		}
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUrlSideBar() {
		return urlSideBar;
	}


	public void setUrlSideBar(String urlSideBar) {
		this.urlSideBar = urlSideBar;
	}
	
	

	
	
	
}
