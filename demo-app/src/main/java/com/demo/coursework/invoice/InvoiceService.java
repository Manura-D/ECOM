package com.demo.coursework.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository InvoiceRepository;

    public List<invoice> getAllInvoice(){
        List<invoice> invoiceList = new ArrayList<>();
        InvoiceRepository.findAll().forEach(invoiceList::add);
        return invoiceList;
    }
    
    
    public Optional<invoice> getInvoice(String id) {
    	return InvoiceRepository.findById(Integer.valueOf(id));
		 
	}

}