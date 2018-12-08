package com.demo.coursework.invoice;
import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "inv_invoice")

public class invoice {
	
	@Id
    @Column(name="invoice_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer invoice_id;	
		
    @Column(name="customer_id")
    private String customer_id;
    
    @Column(name="transaction_date")
    private Date transaction_date;
    
    @Column(name="item_id")
    private String item_id;

    @Column(name="purchase_quantity")
    private Integer purchase_quantity;
    
    @Column(name="status")
    private String status;
    
    
    
    public Integer getId() {
        return invoice_id;
    }
    public void setId(Integer id) {
        this.invoice_id = id;
    }

    public String getcustomer_id() {
        return customer_id;
    }
    public void setcustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

 /*   public Date getransaction_date() {
        return transaction_date;
    }
    public void settransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }
*/
    
    public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	
	
    public String getitem_id() {
        return item_id;
    }

	public void setitem_id(String item_id) {
        this.item_id = item_id;
    }
    
    public Integer getpurchase_quantity() {
        return purchase_quantity;
    }
    public void setpurchase_quantity(Integer purchase_quantity) {
        this.purchase_quantity = purchase_quantity;
    }
    
    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }

}
