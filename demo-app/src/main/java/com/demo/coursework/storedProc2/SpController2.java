package com.demo.coursework.storedProc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Function")
public class SpController2 {
	
	   @Autowired
	    StoredProcService2 service;

	    @RequestMapping(value = "updateinvoice", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	    public ResponseEntity<String> UpdateInvoice(@RequestBody Order2 order){
	        //System.out.println(order);

	        return new ResponseEntity<>(service.UpdateInvoice(order.getInvoiceId(), order.getStatus()), HttpStatus.OK);
	    }

}
