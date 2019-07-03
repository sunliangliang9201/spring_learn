package com.sunll.bean.annocation.web;

import org.springframework.stereotype.Repository;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/3 15:37
 */

@Repository("studentDaoId")
public class StudentDapImpl implements StudentDao{

    @Override
    public void save() {
        System.out.println("保存成功");
    }
}
