package com.cg.mobshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mobshop.dao.MobileDAO;
import com.cg.mobshop.dto.Mobiles;

@Service
@Transactional
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileDAO mobiledao;
	
	@Override
	public List<Mobiles> getAllMobiles() {
		return mobiledao.getAllMobiles();

	}

//	public Mobiles searchMobile(int mobileId) {
//		return mobiledao.searchMobile(mobileId);
//	}

	@Override
	public Mobiles getMobileDetails(int mobid) {
	
		return mobiledao.getMobileDetails(mobid);
	}

	@Override
	public int updateMobile(Mobiles mob) {
		return mobiledao.updateMobile(mob);
	}

	public List<Mobiles> deleteMobile(int mobid) {
		return mobiledao.deleteMobile(mobid);
	}

	@Override
	public Mobiles searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return mobiledao.searchMobile(mobId);
	}





}
