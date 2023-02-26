package com.evinci.service;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.Employee;

/**
 * @author evinci
 * @date 2018/12/27 9:53
 */
public interface IUserService {

    ServerResponse<Employee> login(Integer userId, String password);
}
