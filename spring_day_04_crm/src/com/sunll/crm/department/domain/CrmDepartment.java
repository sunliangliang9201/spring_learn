package com.sunll.crm.department.domain;

import com.sunll.crm.post.domain.CrmPost;

import java.util.HashSet;
import java.util.Set;

public class CrmDepartment {
//    CREATE TABLE `crm_department` (
//            `depId` varchar(255) NOT NULL PRIMARY KEY,
//  `depName` varchar(50) DEFAULT NULL
//);

    private String depId;
    private String depName;

    public void setPostSet(Set<CrmPost> postSet) {
        this.postSet = postSet;
    }

    public Set<CrmPost> getPostSet() {
        return postSet;
    }

    private Set<CrmPost> postSet = new HashSet<>();

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepId() {
        return depId;
    }

    public String getDepName() {
        return depName;
    }
}
