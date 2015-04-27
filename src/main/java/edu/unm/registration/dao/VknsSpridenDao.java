package edu.unm.registration.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.unm.registration.model.VknsSpriden;


public interface VknsSpridenDao {

/*	void saveSpriden(VknsSpriden employee);
	
	void deleteSpridenbyId(String ssn);*/
	
	List<VknsSpriden> findAllSpridens();
	
//	SessionFactory getSessionFactory();
	void persist(VknsSpriden transientInstance);
	void attachDirty(VknsSpriden instance);
	void attachClean(VknsSpriden instance);
	void delete(VknsSpriden persistentInstance);
	VknsSpriden merge(VknsSpriden detachedInstance);
	List<VknsSpriden> findById(java.lang.String id);
	List findByExample(VknsSpriden instance);
}
