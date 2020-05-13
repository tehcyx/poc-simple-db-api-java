package com.hybris.cloudnativedemo.domain;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

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

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Item> items;

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

    public Set<Item> getitems() { return this.items; }

    public void setitems(Set<Item> items) { this.items = items; }
}