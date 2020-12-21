package com.ust.vendorweb.service;

import java.util.List;

import com.ust.vendorweb.entities.Vendor;

public interface VendorService {
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendors();
}

