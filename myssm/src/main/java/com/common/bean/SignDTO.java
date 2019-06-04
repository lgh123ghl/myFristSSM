package com.common.bean;

import java.io.Serializable;

/**
 * @author LGH
 * @Date: 2019/6/4 14:49
 * @Description:
 */
public class SignDTO implements Serializable {
    private static final long serialVersionUID = -5254906356330643584L;
    private String userId;
    private String userName;
    private String signTime;
    private Long signType;
    private String address;
    private Double lon;
    private Double lat;

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

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public Long getSignType() {
        return signType;
    }

    public void setSignType(Long signType) {
        this.signType = signType;
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
}
