package com.demo.coursework.storedProc;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sptest")
@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(name = "create_invoice", procedureName = "create_invoice",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_item_id", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_customer_id", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_quantity", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "_return_msg", type = String.class)
                }
        )
})

public class MyTable implements Serializable {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
