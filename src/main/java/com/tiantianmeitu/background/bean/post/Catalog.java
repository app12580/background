package com.tiantianmeitu.background.bean.post;

import java.io.Serializable;
import java.util.Date;

public class Catalog implements Serializable {
    private Integer catalogId;

    private String name;

    private Integer parentId;

    private Integer orderNo;

    private String operateType;

    private Date operateTime;

    private static final long serialVersionUID = 1L;

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catalogId=").append(catalogId);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", operateType=").append(operateType);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}