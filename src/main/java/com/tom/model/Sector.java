package com.tom.model;

public enum Sector {
    ENERGY ("Energy"),
    MATERIALS ("Materials"),
    INDUSTRIALS ("Industrials"),
    TECHNOLOGY ("Technology"),
    HEALTH_CARE ("Health Care"),
    FINANCIALS ("Financials"),
    CONSUMER_DISCRETIONARY ("Consumer Discretionary"),
    CONSUMER_STAPLES ("Consumer Staples"),
    REAL_ESTATE ("Real Estate"),
    UTILITIES ("Utilities"),
    COMMUNICATION_SERVICES ("Communication Services");


    private final String sector;

    Sector(String sector) {
        this.sector = sector;
    }

    public String toString() {
        return this.sector;
    }

}