package com.javadevjournal.product.data;

import javax.persistence.*;

@Entity
@Table(name ="message")
public class ProductModel {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}