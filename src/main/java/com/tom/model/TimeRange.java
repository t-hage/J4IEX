package com.tom.model;

public enum TimeRange {
    FIVE_YEARS ("5y"),
    TWO_YEARS ("2y"),
    ONE_YEAR ("1y"),
    YEAR_TO_DATE ("ytd"),
    SIX_MONTHS ("6m"),
    THREE_MONTHS ("3m"),
    ONE_MONTH ("1m"),
    ONE_DAY ("1d"),
    DYNAMIC ("dynamic");


    private final String timeRange;

    TimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String toString() {
        return this.timeRange;
    }

}
