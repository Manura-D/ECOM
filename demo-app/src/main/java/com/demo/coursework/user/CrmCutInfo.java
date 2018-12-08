package com.demo.coursework.user;

import javax.persistence.*;

@Entity
@Table(name = "crm_cust_info")
public class CrmCutInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Integer custId;

    @Column(name = "cust_address")
    private String custAddr;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_email_address")
    private String email;
}
