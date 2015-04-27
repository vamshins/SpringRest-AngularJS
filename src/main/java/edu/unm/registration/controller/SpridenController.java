package edu.unm.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.unm.registration.model.VknsSpriden;
import edu.unm.registration.service.impl.VknsSpridenService;

@Controller
@RequestMapping(value="/spriden")
public class SpridenController {
	
	@Autowired
	VknsSpridenService spridenService;
	

	@RequestMapping("/listallspridens")
	public @ResponseBody List<VknsSpriden> listSpridens(ModelMap model) {
		List<VknsSpriden> spridens = spridenService.findAllSpridens();
		return spridens;	
	}
	
	@RequestMapping(value="/addspriden", method = RequestMethod.POST)
	public @ResponseBody String addSpriden(@RequestBody VknsSpriden spriden){
		spridenService.persist(spriden);
		return "{\"status\" : \"success\"}";
	}
	
	@RequestMapping(value="/findspridenbyid", method = RequestMethod.GET)
	public @ResponseBody List<VknsSpriden> findSpridenById(@RequestParam(value = "id",required = false,
            defaultValue = "0") String spridenid){
		System.out.println("spridenid: " + spridenid);
		List<VknsSpriden> spriden = spridenService.findById(spridenid);
		return spriden;
	}
	
	@RequestMapping(value="/updatespriden", method = RequestMethod.POST)
	public @ResponseBody String updateSpriden(@RequestBody VknsSpriden spriden){
		spridenService.persist(spriden);
		return "{\"status\" : \"success\"}";
	}
}
