package com.sunll.bean.xmlinject.collection;

import java.util.*;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 14:33
 */
public class CollData {

    private String[] arrayData;
    private List<String> listData;
    private Set<String> setData;
    private Map<String, String> mapData;
    private Properties propertiesData;

    @Override
    public String toString() {
        return "CollData{" +
                "arrayData=" + Arrays.toString(arrayData) +
                ", listData=" + listData +
                ", setData=" + setData +
                ", mapData=" + mapData +
                ", propertiesData=" + propertiesData +
                '}';
    }

    public String[] getArrayData() {
        return arrayData;
    }

    public List<String> getListData() {
        return listData;
    }

    public Set<String> getSetData() {
        return setData;
    }

    public Map<String, String> getMapData() {
        return mapData;
    }

    public void setArrayData(String[] arrayData) {
        this.arrayData = arrayData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public void setSetData(Set<String> setData) {
        this.setData = setData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public void setPropertiesData(Properties propertiesData) {
        this.propertiesData = propertiesData;
    }

    public Properties getPropertiesData() {
        return propertiesData;
    }
}
