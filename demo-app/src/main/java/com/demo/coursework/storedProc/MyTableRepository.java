package com.demo.coursework.storedProc;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableRepository extends CrudRepository<MyTable, Long> {
    @Procedure(name = "create_invoice")
    public String CreateInvoice(@Param("p_item_id") Integer p_itemId ,
    							@Param("p_customer_id") Integer p_customerId,
    							@Param("p_quantity") Integer p_quantity );

}
