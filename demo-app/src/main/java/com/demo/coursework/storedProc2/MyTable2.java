package com.demo.coursework.storedProc2;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sptest")
@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(name = "update_invoice", procedureName = "update_invoice",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_invoice_id", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_status", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "_return_msg", type = String.class)
                }
        )
})

public class MyTable2 implements Serializable {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
