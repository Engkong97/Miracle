package com.mantabs.collection.master.area_assignment.viewmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Default;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.util.resource.Labels;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.util.Clients;

import com.mantabs.collection.master.area_assignment.dto.UserMenu;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class SidebarAdminVmd extends SelectorComposer<Component> implements Serializable {
	
	private static final long serialVersionUID = 7010841483291616467L;
	
	private static final Logger logger = LoggerFactory
			.getLogger(SidebarAdminVmd.class);
	
	
	List<UserMenu> listMenu = new ArrayList<>();
//	UserMenu dto = new UserMenu();
	String[] menu = new String[]{"Sports", "Life Style", "Tips And Trick"};
	String[] route = new String[]{"/admin/sport_admin.zul", "/admin/lifesyle_admin.zul", "/admin/tipstrick_admin.zul"};
	
	@Init
	@NotifyChange({"listMenu","dto"})
	public void load() {
		for(int i = 0; i<menu.length; i++){
			UserMenu dto = new UserMenu();
			dto.setMenuTitle(menu[i]);
			dto.setMenuUrl(route[i]);
			listMenu.add(dto);
		}
		
		System.out.println("jumlah list  : " + listMenu.size());
		BindUtils.postNotifyChange(null, null, this, "listMenu");
	}

	public List<UserMenu> getListMenu() {
		return listMenu;
	}

	public void setListMenu(List<UserMenu> listMenu) {
		this.listMenu = listMenu;
	}
	

	
	
	

}
