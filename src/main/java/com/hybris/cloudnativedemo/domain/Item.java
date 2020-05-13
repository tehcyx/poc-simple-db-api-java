package com.hybris.cloudnativedemo.domain;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "items")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

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