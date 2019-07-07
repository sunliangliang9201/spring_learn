package com.sunll.crm.coursetype.domain;

import com.sunll.crm.classes.domain.CrmClasses;

import java.util.HashSet;
import java.util.Set;

public class CrmCourseType {
    /**
     * CREATE TABLE `crm_course_type` (
     *   `courseTypeId` varchar(255) NOT NULL PRIMARY KEY,
     *   `courseCost` double DEFAULT NULL,
     *   `total` int(11) DEFAULT NULL,
     *   `courseName` varchar(500) DEFAULT NULL,
     *   `remark` varchar(5000) DEFAULT NULL
     * );
     */

    private String courseTypeId;
    private Double courseCost;
    private Integer total;
    private String courseName;
    private String remark;

    public void setClassesSet(Set<CrmClasses> classesSet) {
        this.classesSet = classesSet;
    }

    public Set<CrmClasses> getClassesSet() {
        return classesSet;
    }

    private Set<CrmClasses> classesSet = new HashSet<>();

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public void setCourseCost(Double courseCost) {
        this.courseCost = courseCost;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public Double getCourseCost() {
        return courseCost;
    }

    public Integer getTotal() {
        return total;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getRemark() {
        return remark;
    }
}
