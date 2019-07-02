package com.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
public class TLivelihoodBodyDo {
    private Long id;

    private String barCode;

    private String orgCode;

    private String orgName;

    private String bodyOne;

    private String bodyTwo;

    private String bodyThree;

    private String bodyType;

    private String effectFlag;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getBodyOne() {
        return bodyOne;
    }

    public void setBodyOne(String bodyOne) {
        this.bodyOne = bodyOne;
    }

    public String getBodyTwo() {
        return bodyTwo;
    }

    public void setBodyTwo(String bodyTwo) {
        this.bodyTwo = bodyTwo;
    }

    public String getBodyThree() {
        return bodyThree;
    }

    public void setBodyThree(String bodyThree) {
        this.bodyThree = bodyThree;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getEffectFlag() {
        return effectFlag;
    }

    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}