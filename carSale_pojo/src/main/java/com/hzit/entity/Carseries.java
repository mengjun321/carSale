package com.hzit.entity;
public class Carseries implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer seriesId;//车系编号
    private String seriesName;//车系名称
    private Integer brandId;//品牌编号
    public Carseries() {
        super();
    }
    public Carseries(Integer seriesId,String seriesName,Integer brandId) {
        super();
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.brandId = brandId;
    }
    public Integer getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return this.seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

}
