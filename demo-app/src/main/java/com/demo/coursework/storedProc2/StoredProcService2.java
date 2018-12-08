package com.demo.coursework.storedProc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoredProcService2 {

	@Autowired
	MyTableRepository2 repository;
	public String UpdateInvoice(Integer invoiceId, String status) {
		return repository.UpdateInvoice(invoiceId, status);
		//return null;
	}
	
	
	
	

}
