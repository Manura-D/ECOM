package com.demo.coursework.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("Ecomm")
public class InvoiceController {
	

    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello User";
    }

    @RequestMapping(value = "invoice", method = RequestMethod.GET)//, produces = MediaType.APPLICATION_JSON_VALUE
    public List<invoice> getAllInvoice(){
        return invoiceService.getAllInvoice();	
    }
    
    @RequestMapping("/invoice/{id}")
	public Optional<invoice> getInvoice(@PathVariable String id) {
		return invoiceService.getInvoice(id);
	}

}
