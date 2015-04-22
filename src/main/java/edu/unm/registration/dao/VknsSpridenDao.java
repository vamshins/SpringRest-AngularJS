package edu.unm.registration.dao;

import java.util.List;

import edu.unm.registration.model.VknsSpriden;


public interface VknsSpridenDao {

	void saveSpriden(VknsSpriden employee);
	
	List<VknsSpriden> findAllSpridens();
	
	void deleteSpridenbyId(String ssn);
}
