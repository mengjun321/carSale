package com.hzit.entity;
public class Customer implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer customerId;//客户编号
    private Long storeId;
    private String customerSex;//客户性别
    private Object addressId;
    private String lastName;
    private Integer active;
    private String customerName;//客户姓名
    private Integer companyId;//公司编号
    private String customerPhone;//客户电话
    private String customerType;//客户类型（1：个人、2：公司）
    private java.util.Date customerCreateTime;//创建时间
    private java.util.Date lastUpdate;
    private java.util.Date customerBirthday;//客户生日
//    private Object customerId;
    private java.util.Date createDate;
    private String firstName;
    private String email;
    public Customer() {
        super();
    }
//    ,Object customerId
    public Customer(Integer customerId,Long storeId,String customerSex,Object addressId,String lastName,Integer active,String customerName,Integer companyId,String customerPhone,String customerType,java.util.Date customerCreateTime,java.util.Date lastUpdate,java.util.Date customerBirthday,java.util.Date createDate,String firstName,String email) {
        super();
        this.customerId = customerId;
        this.storeId = storeId;
        this.customerSex = customerSex;
        this.addressId = addressId;
        this.lastName = lastName;
        this.active = active;
        this.customerName = customerName;
        this.companyId = companyId;
        this.customerPhone = customerPhone;
        this.customerType = customerType;
        this.customerCreateTime = customerCreateTime;
        this.lastUpdate = lastUpdate;
        this.customerBirthday = customerBirthday;
        this.customerId = customerId;
        this.createDate = createDate;
        this.firstName = firstName;
        this.email = email;
    }
//    public Integer getCustomerId() {
//        return this.customerId;
//    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getCustomerSex() {
        return this.customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public Object getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getActive() {
        return this.active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public java.util.Date getCustomerCreateTime() {
        return this.customerCreateTime;
    }

    public void setCustomerCreateTime(java.util.Date customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public java.util.Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.util.Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public java.util.Date getCustomerBirthday() {
        return this.customerBirthday;
    }

    public void setCustomerBirthday(java.util.Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public Object getCustomerId() {
        return this.customerId;
    }

//    public void setCustomerId(Object customerId) {
//        this.customerId = customerId;
//    }

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
