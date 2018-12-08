package com.demo.coursework.storedProc2;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MyTableRepository2 extends CrudRepository<MyTable2, Long> {
    @Procedure(name = "update_invoice")
    public String UpdateInvoice(@Param("p_invoice_id") Integer p_itemId ,
    							@Param("p_status") String p_customerId ) ;

}