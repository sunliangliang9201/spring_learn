package com.sunll.crm.staff.service.impl;

import com.sunll.crm.staff.dao.StaffDao;
import com.sunll.crm.staff.domain.CrmStaff;
import com.sunll.crm.staff.service.StaffService;

public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public CrmStaff login(CrmStaff staff) {
        return staffDao.find(staff.getLoginName(), staff.getLoginPwd());
    }
}
