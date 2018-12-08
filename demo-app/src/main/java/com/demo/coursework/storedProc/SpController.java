package com.demo.coursework.storedProc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.coursework.storedProc.Order;


@RestController
@RequestMapping("Function")
public class SpController {

    @Autowired
    StoredProcService service;

    @RequestMapping(value = "createinvoice", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> CreateInvoice(@RequestBody Order order){
        //System.out.println(order);

        return new ResponseEntity<>(service.CreateInvoice(order.getItemId(), order.getCustomerId(), order.getQuantity()), HttpStatus.OK);
    }
}
