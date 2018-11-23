package com.cg.mobshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.service.MobileService;

@Controller
public class MobileController {

	@Autowired
	MobileService mobileservice;
	public MobileService getMobileservice() {
		return mobileservice;
	}
	
	public void setMobileservice(MobileService mobileservice) {
		this.mobileservice = mobileservice;
	}
	
	
	
//	@RequestMapping(value="mobilesearch",method=RequestMethod.GET)
//	public String searchData(@ModelAttribute("yy") Mobiles mob) {
//	return "searchmobile";
//	}
//	
//	@RequestMapping(value="searchmobile",method=RequestMethod.POST)
//	public ModelAndView dataSearch(@ModelAttribute("yy") Mobiles mob) {
//	Mobiles mobSearch=mobileservice.searchMobile(mob.getMobileId());
//	return new ModelAndView("showsearch","temp",mobSearch);
//	}
	
	@RequestMapping("searchmoblist")
	public String searchData(@RequestParam("mobid") int mobid,Model model){
		return "mobilesearch";
		}
	
	@RequestMapping("searchmoblist")
	public String dataSearch(@RequestParam("mobid") int mobid,Model model){
		Mobiles mobSearch=mobileservice.searchMobile(mobid);
		return null;
		
	}
	
//	
//	public String dataSearch(@RequestParam("mobid") int mobid, Model model){
//		
//	}
	
	@RequestMapping("getmoblist")
	public String showMobileList(Model model){
		List<Mobiles> list = mobileservice.getAllMobiles();
		model.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping("getUpdatePage")
	public String updateMobile(@RequestParam("mobid") int mobid, Model model){
		Mobiles mobile=mobileservice.getMobileDetails(mobid);//selecting a particular record and updating
		
		if(mobile==null){
			model.addAttribute("errmsg", "Invalid entry: "+mobid);
			return "failure";
		}
		else{
		model.addAttribute("mobile",mobile);
		return "update";
		}
	}
	
	@RequestMapping("delete")
	public String deleteMobile(@RequestParam("mobid") int mobid,Model model){
		List<Mobiles> list = mobileservice.deleteMobile(mobid);
		model.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping("updateMobileAction.obj")
	public String updateMobile(@ModelAttribute("mobile") Mobiles mobile,Model model){
		mobileservice.updateMobile(mobile);
		List<Mobiles> list = mobileservice.getAllMobiles();//Displaying all the records along with the updated records
		model.addAttribute("list",list);
		return "home";
	}
	
}

