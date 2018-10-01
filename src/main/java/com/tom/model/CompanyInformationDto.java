package com.tom.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyInformationDto {

    private String symbol;
    private String companyName;
    private String exchange;
    private String industry;
    private String website;
    private String description;
    @JsonProperty("CEO")
    private String ceo;
    private String issueType;
    private String sector;
    private List<String> tags = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCEO() {
        return ceo;
    }

    public void setCEO(String cEO) {
        this.ceo = cEO;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "CompanyInformationDto{" +
                "symbol='" + symbol + '\'' +
                ", companyName='" + companyName + '\'' +
                ", exchange='" + exchange + '\'' +
                ", industry='" + industry + '\'' +
                ", website='" + website + '\'' +
                ", description='" + description + '\'' +
                ", ceo='" + ceo + '\'' +
                ", issueType='" + issueType + '\'' +
                ", sector='" + sector + '\'' +
                ", tags=" + tags +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}