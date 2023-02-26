package com.evinci.service;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.Customer;
import com.evinci.vo.CustomerQuery;

/**
 * @author evinci
 * @date 2023/1/6 10:05
 */
public interface ICustomerService {
    ServerResponse addCustomer(Customer customer);

    ServerResponse getList(CustomerQuery customerQuery);

    ServerResponse updateCustomer(Customer customer);
}
