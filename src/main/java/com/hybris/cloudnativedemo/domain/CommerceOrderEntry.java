package com.hybris.cloudnativedemo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommerceOrderEntry {

    private Integer quantity;
    private CommerceOrderEntryProduct product;

    public void setquantity(Integer quantity) { this.quantity = quantity; }

    public Integer getquantity() { return this.quantity; }

    public void setproduct(CommerceOrderEntryProduct product) { this.product = product; }

    public CommerceOrderEntryProduct getproduct() { return this.product; }
}