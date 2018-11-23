package com.cg.mobshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.mobshop.dto.Mobiles;

@Repository
@Transactional
public class MobileDAOImpl implements MobileDAO {

	@PersistenceContext
	EntityManager entitymanager;
	
	
	public EntityManager getEntitymanager() {
		return entitymanager;
	}


	public void setEntitymanager(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}


	public List<Mobiles> getAllMobiles(){
		String str="select mobile from Mobiles mobile";
		TypedQuery<Mobiles> query=entitymanager.createQuery(str,Mobiles.class);
		return query.getResultList();	
	}

	@Override
	public Mobiles getMobileDetails(int mobid) {
		Mobiles mobile=entitymanager.find(Mobiles.class, mobid);
		return mobile;
	}

	@Override
	public int updateMobile(Mobiles mob) {
		entitymanager.merge(mob);
		return mob.getMobileId();
	}

	public List<Mobiles> deleteMobile(int mobid) {
	Mobiles mobile=getMobileDetails(mobid);
	entitymanager.remove(mobile);
	return getAllMobiles();
	}


	@Override
	public Mobiles searchMobile(int mobId) {
		Query querysearch=entitymanager.createQuery("FROM Mobile WHERE mobId=:mobdata");
		querysearch.setParameter("mobdata", mobId);
		Mobiles mob=(Mobiles) querysearch.getResultList().get(0);
		return mob;
	}



	


	
	
}
