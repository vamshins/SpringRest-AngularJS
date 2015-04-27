package edu.unm.registration.service.impl;

import java.util.List;

import javax.naming.InitialContext;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.unm.registration.dao.VknsSpridenDao;
import edu.unm.registration.model.VknsSpriden;


@Service("spridenService")
@Transactional
public class VknsSpridenServiceImpl implements VknsSpridenService{

	@Autowired
	private VknsSpridenDao dao;
	
/*	public void saveSpriden(VknsSpriden spriden) {
		dao.saveSpriden(spriden);
	}

	public void deleteSpridenById(String id) {
		dao.deleteSpridenbyId(id);
	}*/
	
	public List<VknsSpriden> findAllSpridens() {
		return dao.findAllSpridens();
	}
	
	/*public SessionFactory getSessionFactory() {
		return dao.getSessionFactory();
	}*/

	public void persist(VknsSpriden transientInstance) {
		dao.persist(transientInstance);
	}

	public void attachDirty(VknsSpriden instance) {
		dao.attachDirty(instance);
	}

	public void attachClean(VknsSpriden instance) {
		dao.attachClean(instance);
	}

	public void delete(VknsSpriden persistentInstance) {
		dao.delete(persistentInstance);
	}

	public VknsSpriden merge(VknsSpriden detachedInstance) {
		return dao.merge(detachedInstance);
	}

	public List<VknsSpriden> findById(java.lang.String id) {
		return dao.findById(id);
	}

	public List findByExample(VknsSpriden instance) {
		return dao.findByExample(instance);
	}

}
