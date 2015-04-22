package edu.unm.registration.service.impl;

import java.util.List;

import edu.unm.registration.model.VknsSpriden;


public interface VknsSpridenService {

	void saveSpriden(VknsSpriden employee);

	List<VknsSpriden> findAllSpridens();

	void deleteSpridenById(String ssn);
}
