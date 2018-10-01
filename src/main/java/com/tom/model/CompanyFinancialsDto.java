package com.tom.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "symbol",
        "financials"
})
public class CompanyFinancialsDto {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("financials")
    private List<FinancialsDto> financials = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("financials")
    public List<FinancialsDto> getFinancials() {
        return financials;
    }

    @JsonProperty("financials")
    public void setFinancials(List<FinancialsDto> financials) {
        this.financials = financials;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "CompanyFinancialsDto{" +
                "symbol='" + symbol + '\'' +
                ", financials=" + financials +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}