package com.hybris.cloudnativedemo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommerceOrderEntryProduct {

    private String name;
    private String code;

    public void setname(String name) { this.name = name; }

    public String getname() { return this.name; }

    public void setcode(String code) { this.code = code; }

    public String getcode() { return this.code; }
}