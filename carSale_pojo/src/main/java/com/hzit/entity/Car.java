package com.hzit.entity;
public class Car implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer carId;//汽车编号
    private Double carPrice;//汽车价格
    private String carName;//汽车名称
    private java.util.Date carTime;//出厂日期
    private Integer seriesId;//车系编号
    public Car() {
        super();
    }
    public Car(Integer carId,Double carPrice,String carName,java.util.Date carTime,Integer seriesId) {
        super();
        this.carId = carId;
        this.carPrice = carPrice;
        this.carName = carName;
        this.carTime = carTime;
        this.seriesId = seriesId;
    }
    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Double getCarPrice() {
        return this.carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public java.util.Date getCarTime() {
        return this.carTime;
    }

    public void setCarTime(java.util.Date carTime) {
        this.carTime = carTime;
    }

    public Integer getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

}
