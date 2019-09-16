package com.hzit.entity;
public class Position implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer positionId;//职务编号
    private String positionName;//职务名称（经理、操作员、销售员)
    private String positionLevel;//职务等级
    public Position() {
        super();
    }
    public Position(Integer positionId,String positionName,String positionLevel) {
        super();
        this.positionId = positionId;
        this.positionName = positionName;
        this.positionLevel = positionLevel;
    }
    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionLevel() {
        return this.positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

}
