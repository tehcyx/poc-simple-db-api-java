package com.hybris.cloudnativedemo.domain;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    @JsonIgnore
    private Integer version;

    private String name;
    private Integer quantity;

    public String getname() { return this.name; }
    public void setname(String name) { this.name = name; }

    public Integer getquantity() { return this.quantity; }
    public void setquantity(Integer quantity) { this.quantity = quantity; }
}