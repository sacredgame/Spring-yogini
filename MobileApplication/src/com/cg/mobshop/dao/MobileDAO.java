package com.cg.mobshop.dao;

import java.util.List;

import com.cg.mobshop.dto.Mobiles;

public interface MobileDAO {

	public List<Mobiles> getAllMobiles();
	public Mobiles getMobileDetails(int mobid);
	public int updateMobile(Mobiles mob);
	public List<Mobiles> deleteMobile(int mobid);
	public Mobiles searchMobile(int mobId);
//	public Mobiles searchMobile(int mobileId);
//	public void updateMobile(int mobileId, double price);
}
