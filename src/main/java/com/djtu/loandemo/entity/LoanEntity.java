package com.djtu.loandemo.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author vwater
 * @since 2018-06-29
 */

@Data
//@TableName("user")
public class LoanEntity implements Serializable {

    private static final long serialVersionUID = 1L;

/*//    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "user{" +
        ", id=" + id +

        "}";
    }*/
}
