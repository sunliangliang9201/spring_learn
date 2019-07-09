package com.sunll.mybatis.po;

import java.util.Date;
import java.util.List;

public class Orders {
    private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;

    private List<Orderdetail> detailList;

    public void setDetailList(List<Orderdetail> detailList) {
        this.detailList = detailList;
    }

    public List<Orderdetail> getDetailList() {
        return detailList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", detailList=" + detailList +
                '}';
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }



    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}