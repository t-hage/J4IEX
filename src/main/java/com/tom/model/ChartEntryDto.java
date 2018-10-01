package com.tom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ChartEntryDto {

    private String date;
    private String minute;
    private float open;
    private float high;
    private float low;
    private float average;
    private float close;
    private float volume;
    private float notional;
    private int numberOfTrades;
    private float marketHigh;
    private float marketLow;
    private float marketAverage;
    private float marketVolume;
    private float marketNotional;
    private int marketNumberOfTrades;
    private float unadjustedVolume;
    private float change;
    private float changePercent;
    private float vwap;
    private String label;
    private float marketOpen;
    private float marketClose;
    private float changeOverTime;
    private float marketChangeOverTime;

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getUnadjustedVolume() {
        return unadjustedVolume;
    }

    public void setUnadjustedVolume(float unadjustedVolume) {
        this.unadjustedVolume = unadjustedVolume;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(float changePercent) {
        this.changePercent = changePercent;
    }

    public float getVwap() {
        return vwap;
    }

    public void setVwap(float vwap) {
        this.vwap = vwap;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getChangeOverTime() {
        return changeOverTime;
    }

    public void setChangeOverTime(float changeOverTime) {
        this.changeOverTime = changeOverTime;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public float getNotional() {
        return notional;
    }

    public void setNotional(float notional) {
        this.notional = notional;
    }

    public int getNumberOfTrades() {
        return numberOfTrades;
    }

    public void setNumberOfTrades(int numberOfTrades) {
        this.numberOfTrades = numberOfTrades;
    }

    public float getMarketHigh() {
        return marketHigh;
    }

    public void setMarketHigh(float marketHigh) {
        this.marketHigh = marketHigh;
    }

    public float getMarketLow() {
        return marketLow;
    }

    public void setMarketLow(float marketLow) {
        this.marketLow = marketLow;
    }

    public float getMarketAverage() {
        return marketAverage;
    }

    public void setMarketAverage(float marketAverage) {
        this.marketAverage = marketAverage;
    }

    public float getMarketVolume() {
        return marketVolume;
    }

    public void setMarketVolume(float marketVolume) {
        this.marketVolume = marketVolume;
    }

    public float getMarketNotional() {
        return marketNotional;
    }

    public void setMarketNotional(float marketNotional) {
        this.marketNotional = marketNotional;
    }

    public int getMarketNumberOfTrades() {
        return marketNumberOfTrades;
    }

    public void setMarketNumberOfTrades(int marketNumberOfTrades) {
        this.marketNumberOfTrades = marketNumberOfTrades;
    }

    public float getMarketOpen() {
        return marketOpen;
    }

    public void setMarketOpen(float marketOpen) {
        this.marketOpen = marketOpen;
    }

    public float getMarketClose() {
        return marketClose;
    }

    public void setMarketClose(float marketClose) {
        this.marketClose = marketClose;
    }

    public float getMarketChangeOverTime() {
        return marketChangeOverTime;
    }

    public void setMarketChangeOverTime(float marketChangeOverTime) {
        this.marketChangeOverTime = marketChangeOverTime;
    }

    @Override
    public String toString() {
        return "ChartEntryDto{" +
                "date='" + date + '\'' +
                ", minute='" + minute + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", average=" + average +
                ", close=" + close +
                ", volume=" + volume +
                ", notional=" + notional +
                ", numberOfTrades=" + numberOfTrades +
                ", marketHigh=" + marketHigh +
                ", marketLow=" + marketLow +
                ", marketAverage=" + marketAverage +
                ", marketVolume=" + marketVolume +
                ", marketNotional=" + marketNotional +
                ", marketNumberOfTrades=" + marketNumberOfTrades +
                ", unadjustedVolume=" + unadjustedVolume +
                ", change=" + change +
                ", changePercent=" + changePercent +
                ", vwap=" + vwap +
                ", label='" + label + '\'' +
                ", marketOpen=" + marketOpen +
                ", marketClose=" + marketClose +
                ", changeOverTime=" + changeOverTime +
                ", marketChangeOverTime=" + marketChangeOverTime +
                '}';
    }
}
