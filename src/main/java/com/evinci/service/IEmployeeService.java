package com.evinci.service;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.Employee;
import com.evinci.vo.EmployeeQuery;

/**
 * @author evinci
 * @date 2023/1/6 16:55
 */
public interface IEmployeeService {
    ServerResponse addEmployee(Employee employee);

    ServerResponse updateEmployee(Employee employee);

    ServerResponse getList(EmployeeQuery employeeQuery);

    ServerResponse validPassword(Integer id, String validPass);

    ServerResponse updatePassword(Integer id, String oldPass, String newPass);
}
