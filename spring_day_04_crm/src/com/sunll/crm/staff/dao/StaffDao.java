package com.sunll.crm.staff.dao;

import com.sunll.crm.staff.domain.CrmStaff;

public interface StaffDao {

    public CrmStaff find(String loginName, String loginPwd);
}
