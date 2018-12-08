package com.demo.coursework.customerinfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustInfoRepository extends JpaRepository<CustomerInfo, Integer> {
}


