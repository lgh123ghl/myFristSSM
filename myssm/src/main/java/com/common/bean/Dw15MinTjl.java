package com.common.bean;


import java.io.Serializable;

public class Dw15MinTjl implements Serializable {
  private static final long serialVersionUID = 1L;
  private String id;
  private String measurepointId;
  private java.sql.Timestamp sampletime;
  private String measuretag;
  private double value;
  private String unit;
  private double avgValue;
  private double maxValue;
  private double minValue;
  private java.sql.Timestamp T;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getMeasurepointId() {
    return measurepointId;
  }

  public void setMeasurepointId(String measurepointId) {
    this.measurepointId = measurepointId;
  }


  public java.sql.Timestamp getSampletime() {
    return sampletime;
  }

  public void setSampletime(java.sql.Timestamp sampletime) {
    this.sampletime = sampletime;
  }


  public String getMeasuretag() {
    return measuretag;
  }

  public void setMeasuretag(String measuretag) {
    this.measuretag = measuretag;
  }


  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public double getAvgValue() {
    return avgValue;
  }

  public void setAvgValue(double avgValue) {
    this.avgValue = avgValue;
  }


  public double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(double maxValue) {
    this.maxValue = maxValue;
  }


  public double getMinValue() {
    return minValue;
  }

  public void setMinValue(double minValue) {
    this.minValue = minValue;
  }


  public java.sql.Timestamp getT() {
    return T;
  }

  public void setT(java.sql.Timestamp T) {
    this.T = T;
  }

}
