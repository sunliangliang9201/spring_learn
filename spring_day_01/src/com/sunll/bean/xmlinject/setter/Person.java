package com.sunll.bean.xmlinject.setter;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 12:54
 */
public class Person {

    private String pName;
    private Integer pAge;
    private Address pHomeAddr;

    public void setpHomeAddr(Address pHomeAddr) {
        this.pHomeAddr = pHomeAddr;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pName='" + pName + '\'' +
                ", pAge=" + pAge +
                ", pHomeAddr=" + pHomeAddr +
                '}';
    }
}
