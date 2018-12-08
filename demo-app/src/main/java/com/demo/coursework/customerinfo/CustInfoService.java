package com.demo.coursework.customerinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustInfoService {
	
    @Autowired
    CustInfoRepository custinfoRepository;

    public List<CustomerInfo> getAllCustInfo(){
        List<CustomerInfo> custinfoList = new ArrayList<>();
        custinfoRepository.findAll().forEach(custinfoList::add);
        return custinfoList;
    }
    
    
    public Optional<CustomerInfo> getCustInfo(String id) {
    	return custinfoRepository.findById(Integer.valueOf(id));
		 
	}


	public void addCustInfo(CustomerInfo custinfo) {
		custinfoRepository.save(custinfo);
		
	}
	

	

}
