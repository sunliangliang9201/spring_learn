package com.sunll.crm.post.domain;

import com.sunll.crm.department.domain.CrmDepartment;
import com.sunll.crm.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

public class CrmPost {
    /**
     * CREATE TABLE `crm_post` (
     *   `postId` varchar(255) NOT NULL PRIMARY KEY,
     *   `postName` varchar(100) DEFAULT NULL,
     *   `depId` varchar(255) DEFAULT NULL,
     *   CONSTRAINT FOREIGN KEY (`depId`) REFERENCES `crm_department` (`depId`)
     * );
     */

    private String postId;
    private String postName;

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void setDepartment(CrmDepartment department) {
        this.department = department;
    }

    public void setStaffSet(Set<CrmStaff> staffSet) {
        this.staffSet = staffSet;
    }

    //多对一
    private CrmDepartment department;

    public String getPostId() {
        return postId;
    }

    public String getPostName() {
        return postName;
    }

    public CrmDepartment getDepartment() {
        return department;
    }

    public Set<CrmStaff> getStaffSet() {
        return staffSet;
    }

    //一对多
    private Set<CrmStaff>  staffSet = new HashSet<>();


}
