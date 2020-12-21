package com.ust.vendorweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.vendorweb.entities.Vendor;
import com.ust.vendorweb.repos.VendorRepository;

@RestController
@RequestMapping("/vendors")
public class VendorRESTConrtroller {
	@Autowired
	VendorRepository vendorRepository;
	
	@GetMapping
	public List<Vendor> getvendors(){
		return vendorRepository.findAll();
	}
	
	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	@PutMapping
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		vendorRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Vendor> getLocation(@PathVariable("id") int id) {
		return vendorRepository.findById(id);
	}
}
