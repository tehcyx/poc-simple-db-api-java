package com.hybris.cloudnativedemo.domain;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Entity
@Table
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    @JsonIgnore
    private Integer version;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("orderCode")
    private String orderCode;

    @JsonProperty("baseSiteUid")
    private String baseSiteUid;

    @JsonProperty("items")
    @ElementCollection
    private List<Item> items;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String name) {
        this.firstName = name;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String name) {
        this.lastName = name;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String code) {
        this.orderCode = code;
    }

    public String getBaseSiteUid() {
        return baseSiteUid;
    }

    public void setBaseSiteUid(String uid) {
        this.baseSiteUid = uid;
    }

    public List<Item> getitems() { return this.items; }

    public void setitems(List<Item> items) { this.items = items; }
}