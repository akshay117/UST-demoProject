package com.ust.vendorweb.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.ust.vendorweb.entities.Vendor;
import com.ust.vendorweb.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	private VendorRepository repository;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return repository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return repository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		repository.delete(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return (List<Vendor>) repository.findAll();
	}
	
	public VendorRepository getRepository() {
		return repository;
	}

	public void setRepository(VendorRepository repository) {
		this.repository = repository;
	}
	

}
