package com.cg.mobshop.service;

import java.util.List;

import com.cg.mobshop.dto.Mobiles;


public interface MobileService {

	public List<Mobiles> getAllMobiles();
	public Mobiles getMobileDetails(int mobid);
	public int updateMobile(Mobiles mob);
//	public Mobiles searchMobile(int mobileId);
//
//	public void updateMobile(int mobileId, double price);
	public List<Mobiles> deleteMobile(int mobid);
	public Mobiles searchMobile(int mobId);
}
