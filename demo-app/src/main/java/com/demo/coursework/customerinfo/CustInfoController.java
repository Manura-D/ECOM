package com.demo.coursework.customerinfo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Ecomm")

public class CustInfoController {
		
	 @Autowired
	    CustInfoService custinfoService;

	    @RequestMapping(value = "custinfo", method = RequestMethod.GET)//, produces = MediaType.APPLICATION_JSON_VALUE
	    public List<CustomerInfo> getAllCustInfo(){
	        return custinfoService.getAllCustInfo();	
	    }
	    
	    @RequestMapping("/custinfo/{id}")
		public Optional<CustomerInfo> getCustInfo(@PathVariable String id) {
			return custinfoService.getCustInfo(id);
		}
	    
		@RequestMapping(value="custinfo", method=RequestMethod.POST)
		public void addCustInfo(@RequestBody CustomerInfo custinfo) {
			custinfoService.addCustInfo(custinfo);
		}
	

}
