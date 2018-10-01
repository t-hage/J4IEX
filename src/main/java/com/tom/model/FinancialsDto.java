package com.tom.model;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

class FinancialsDto {

    @JsonProperty("reportDate")
    private String reportDate;
    @JsonProperty("grossProfit")
    private long grossProfit;
    @JsonProperty("costOfRevenue")
    private long costOfRevenue;
    @JsonProperty("operatingRevenue")
    private long operatingRevenue;
    @JsonProperty("totalRevenue")
    private long totalRevenue;
    @JsonProperty("operatingIncome")
    private long operatingIncome;
    @JsonProperty("netIncome")
    private long netIncome;
    @JsonProperty("researchAndDevelopment")
    private long researchAndDevelopment;
    @JsonProperty("operatingExpense")
    private long operatingExpense;
    @JsonProperty("currentAssets")
    private long currentAssets;
    @JsonProperty("totalAssets")
    private long totalAssets;
    @JsonProperty("totalLiabilities")
    private Object totalLiabilities;
    @JsonProperty("currentCash")
    private long currentCash;
    @JsonProperty("currentDebt")
    private long currentDebt;
    @JsonProperty("totalCash")
    private long totalCash;
    @JsonProperty("totalDebt")
    private long totalDebt;
    @JsonProperty("shareholderEquity")
    private long shareholderEquity;
    @JsonProperty("cashChange")
    private long cashChange;
    @JsonProperty("cashFlow")
    private long cashFlow;
    @JsonProperty("operatingGainsLosses")
    private Object operatingGainsLosses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reportDate")
    public String getReportDate() {
        return reportDate;
    }

    @JsonProperty("reportDate")
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    @JsonProperty("grossProfit")
    public long getGrossProfit() {
        return grossProfit;
    }

    @JsonProperty("grossProfit")
    public void setGrossProfit(long grossProfit) {
        this.grossProfit = grossProfit;
    }

    @JsonProperty("costOfRevenue")
    public long getCostOfRevenue() {
        return costOfRevenue;
    }

    @JsonProperty("costOfRevenue")
    public void setCostOfRevenue(long costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    @JsonProperty("operatingRevenue")
    public long getOperatingRevenue() {
        return operatingRevenue;
    }

    @JsonProperty("operatingRevenue")
    public void setOperatingRevenue(long operatingRevenue) {
        this.operatingRevenue = operatingRevenue;
    }

    @JsonProperty("totalRevenue")
    public long getTotalRevenue() {
        return totalRevenue;
    }

    @JsonProperty("totalRevenue")
    public void setTotalRevenue(long totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @JsonProperty("operatingIncome")
    public long getOperatingIncome() {
        return operatingIncome;
    }

    @JsonProperty("operatingIncome")
    public void setOperatingIncome(long operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    @JsonProperty("netIncome")
    public long getNetIncome() {
        return netIncome;
    }

    @JsonProperty("netIncome")
    public void setNetIncome(long netIncome) {
        this.netIncome = netIncome;
    }

    @JsonProperty("researchAndDevelopment")
    public long getResearchAndDevelopment() {
        return researchAndDevelopment;
    }

    @JsonProperty("researchAndDevelopment")
    public void setResearchAndDevelopment(long researchAndDevelopment) {
        this.researchAndDevelopment = researchAndDevelopment;
    }

    @JsonProperty("operatingExpense")
    public long getOperatingExpense() {
        return operatingExpense;
    }

    @JsonProperty("operatingExpense")
    public void setOperatingExpense(long operatingExpense) {
        this.operatingExpense = operatingExpense;
    }

    @JsonProperty("currentAssets")
    public long getCurrentAssets() {
        return currentAssets;
    }

    @JsonProperty("currentAssets")
    public void setCurrentAssets(long currentAssets) {
        this.currentAssets = currentAssets;
    }

    @JsonProperty("totalAssets")
    public long getTotalAssets() {
        return totalAssets;
    }

    @JsonProperty("totalAssets")
    public void setTotalAssets(long totalAssets) {
        this.totalAssets = totalAssets;
    }

    @JsonProperty("totalLiabilities")
    public Object getTotalLiabilities() {
        return totalLiabilities;
    }

    @JsonProperty("totalLiabilities")
    public void setTotalLiabilities(Object totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    @JsonProperty("currentCash")
    public long getCurrentCash() {
        return currentCash;
    }

    @JsonProperty("currentCash")
    public void setCurrentCash(long currentCash) {
        this.currentCash = currentCash;
    }

    @JsonProperty("currentDebt")
    public long getCurrentDebt() {
        return currentDebt;
    }

    @JsonProperty("currentDebt")
    public void setCurrentDebt(long currentDebt) {
        this.currentDebt = currentDebt;
    }

    @JsonProperty("totalCash")
    public long getTotalCash() {
        return totalCash;
    }

    @JsonProperty("totalCash")
    public void setTotalCash(long totalCash) {
        this.totalCash = totalCash;
    }

    @JsonProperty("totalDebt")
    public long getTotalDebt() {
        return totalDebt;
    }

    @JsonProperty("totalDebt")
    public void setTotalDebt(long totalDebt) {
        this.totalDebt = totalDebt;
    }

    @JsonProperty("shareholderEquity")
    public long getShareholderEquity() {
        return shareholderEquity;
    }

    @JsonProperty("shareholderEquity")
    public void setShareholderEquity(long shareholderEquity) {
        this.shareholderEquity = shareholderEquity;
    }

    @JsonProperty("cashChange")
    public long getCashChange() {
        return cashChange;
    }

    @JsonProperty("cashChange")
    public void setCashChange(long cashChange) {
        this.cashChange = cashChange;
    }

    @JsonProperty("cashFlow")
    public long getCashFlow() {
        return cashFlow;
    }

    @JsonProperty("cashFlow")
    public void setCashFlow(long cashFlow) {
        this.cashFlow = cashFlow;
    }

    @JsonProperty("operatingGainsLosses")
    public Object getOperatingGainsLosses() {
        return operatingGainsLosses;
    }

    @JsonProperty("operatingGainsLosses")
    public void setOperatingGainsLosses(Object operatingGainsLosses) {
        this.operatingGainsLosses = operatingGainsLosses;
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
        return "FinancialsDto{" +
                "reportDate='" + reportDate + '\'' +
                ", grossProfit=" + grossProfit +
                ", costOfRevenue=" + costOfRevenue +
                ", operatingRevenue=" + operatingRevenue +
                ", totalRevenue=" + totalRevenue +
                ", operatingIncome=" + operatingIncome +
                ", netIncome=" + netIncome +
                ", researchAndDevelopment=" + researchAndDevelopment +
                ", operatingExpense=" + operatingExpense +
                ", currentAssets=" + currentAssets +
                ", totalAssets=" + totalAssets +
                ", totalLiabilities=" + totalLiabilities +
                ", currentCash=" + currentCash +
                ", currentDebt=" + currentDebt +
                ", totalCash=" + totalCash +
                ", totalDebt=" + totalDebt +
                ", shareholderEquity=" + shareholderEquity +
                ", cashChange=" + cashChange +
                ", cashFlow=" + cashFlow +
                ", operatingGainsLosses=" + operatingGainsLosses +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}