package com.common.bean;

import java.sql.Timestamp;

public class Sign {
  private Long id;
  private String userId;
  private String userName;
  private java.sql.Timestamp signTime;
  private Long signType;
  private String stationId;
  private String stationName;
  private String address;
  private Double lon;
  private Double lat;
  private String remark;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Timestamp getSignTime() {
    return signTime;
  }

  public void setSignTime(Timestamp signTime) {
    this.signTime = signTime;
  }

  public Long getSignType() {
    return signType;
  }

  public void setSignType(Long signType) {
    this.signType = signType;
  }

  public String getStationId() {
    return stationId;
  }

  public void setStationId(String stationId) {
    this.stationId = stationId;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
