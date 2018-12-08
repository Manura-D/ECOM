package com.demo.coursework.storedProc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoredProcService {

    @Autowired
    MyTableRepository repository;

    public String CreateInvoice(Integer p_itemId, Integer p_customerId, Integer p_quantity){
         return repository.CreateInvoice(p_itemId, p_customerId, p_quantity );
        //return null;
    }
}
