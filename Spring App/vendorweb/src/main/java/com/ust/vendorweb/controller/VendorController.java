package com.ust.vendorweb.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ust.vendorweb.entities.Vendor;
import com.ust.vendorweb.repos.VendorRepository;
import com.ust.vendorweb.service.VendorService;
import com.ust.vendorweb.util.EmailUtil;
import com.ust.vendorweb.util.ReportUtil;

@Controller
public class VendorController {
	
	@Autowired
	VendorService service;
	
	@Autowired
	VendorRepository repository;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor vendorSaved = service.saveVendor(vendor);
		String msg = "Vendor Details  saved with Id: " + vendorSaved.getId();
		modelMap.addAttribute("msg", msg);
		
		emailUtil.sendEmail("javamailust@gmail.com", "Vendor Details Saved", "Saved Vendor Details and getting ready to update the user");
		return "createVendor"; 
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap ) {
		//Location location = service.getLocationById(id);
		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("locations", vendors);
		return "displayVendors";
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap ) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendor";
	}
	@RequestMapping("/updateLoc")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap ) {
		service.updateVendor(vendor);
		
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		
		return "displayVendors";
	}
	
	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = sc.getRealPath("/");
		List<Object[]> data = repository.findTypeAndTypeCount();
		reportUtil.generatePieChart(path, data);
		return "report";

	}

}
