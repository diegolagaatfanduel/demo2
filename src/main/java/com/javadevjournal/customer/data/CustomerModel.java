package com.javadevjournal.customer.data;

import javax.persistence.*;

@Entity
@Table(name ="message")
public class CustomerModel {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}