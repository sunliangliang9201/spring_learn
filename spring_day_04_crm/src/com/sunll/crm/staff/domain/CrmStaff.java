package com.sunll.crm.staff.domain;


import com.sunll.crm.post.domain.CrmPost;

import java.util.Date;

public class CrmStaff {
    /**
     * CREATE TABLE `crm_staff` (
     *   `staffId` varchar(255) NOT NULL PRIMARY KEY,
     *   `loginName` varchar(100) DEFAULT NULL,
     *   `loginPwd` varchar(100) DEFAULT NULL,
     *   `staffName` varchar(100) DEFAULT NULL,
     *   `gender` varchar(20) DEFAULT NULL,
     *   `onDutyDate` datetime DEFAULT NULL,
     *   `postId` varchar(255) DEFAULT NULL,
     *   CONSTRAINT FOREIGN KEY (`postId`) REFERENCES `crm_post` (`postId`)
     * );
     */
    private String staffId;
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private Date onDutyDate;

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public void setCrmPost(CrmPost crmPost) {
        this.crmPost = crmPost;
    }

    //多个员工属于一个职务，多对一
    private CrmPost crmPost;

    public String getStaffId() {
        return staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getGender() {
        return gender;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public CrmPost getCrmPost() {
        return crmPost;
    }
}
