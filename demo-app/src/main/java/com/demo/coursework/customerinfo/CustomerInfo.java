package com.demo.coursework.customerinfo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crm_cust_info")

public class CustomerInfo {
	@Id
    @Column(name="customer_id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customer_id;	
		
    @Column(name="cust_name")
    private String cust_name;
    
    @Column(name="cust_address")
    private String cust_address;
    
    @Column(name="cust_email_address")
    private String cust_email_address;
    
    

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_email_address() {
		return cust_email_address;
	}

	public void setCust_email_address(String cust_email_address) {
		this.cust_email_address = cust_email_address;
	}


	

}
