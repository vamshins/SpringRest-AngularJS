package edu.unm.registration.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import edu.unm.registration.model.VknsSpriden;


public interface VknsSpridenService {

	/*void saveSpriden(VknsSpriden spriden);

	void deleteSpridenById(String ssn);*/
	
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
