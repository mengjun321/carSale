package com.hzit.entity;
public class Company implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer companyId;//公司编号
    private String companyName;//公司名称
    public Company() {
        super();
    }
    public Company(Integer companyId,String companyName) {
        super();
        this.companyId = companyId;
        this.companyName = companyName;
    }
    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
