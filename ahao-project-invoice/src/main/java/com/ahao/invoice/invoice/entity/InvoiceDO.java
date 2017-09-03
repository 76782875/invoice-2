package com.ahao.invoice.invoice.entity;

import com.ahao.entity.BaseDO;
import org.apache.ibatis.type.Alias;

import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Ahaochan on 2017/7/29.
 */
@Alias("InvoiceDO")
@Table(name = "invoice")
public class InvoiceDO extends BaseDO {
    public static final String TAG =  "invoiceDO";

    private String code;
    private String number;
    private Date date;
    private Boolean sell;
    private Long unitId;
    private Long reviewId;
    private Long drawerId;

    public InvoiceDO() {

    }

    public InvoiceDO(Long id, Date createTime, Date modifyTime, String code, String number, Date date, Boolean sell, Long unitId, Long reviewId, Long drawerId) {
        super(id, createTime, modifyTime);
        this.code = code;
        this.number = number;
        this.date = date;
        this.sell = sell;
        this.unitId = unitId;
        this.reviewId = reviewId;
        this.drawerId = drawerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getSell() {
        return sell;
    }

    public void setSell(Boolean sell) {
        this.sell = sell;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Long getDrawerId() {
        return drawerId;
    }

    public void setDrawerId(Long drawerId) {
        this.drawerId = drawerId;
    }

    @Override
    public String toString() {
        return "InvoiceDO{" +
                "code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", sell=" + sell +
                ", unitId=" + unitId +
                ", reviewId=" + reviewId +
                ", drawerId=" + drawerId +
                '}';
    }
}
