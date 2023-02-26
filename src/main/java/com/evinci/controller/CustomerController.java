package com.evinci.controller;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.Customer;
import com.evinci.service.ICustomerService;
import com.evinci.vo.CustomerQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evinci
 * @date 2023/1/6 10:03
 */
@Slf4j
@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "addCustomer", method = RequestMethod.GET)
    public ServerResponse addCustomer(Customer customer) {
        return customerService.addCustomer(customer);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(CustomerQuery customerQuery) {
        return customerService.getList(customerQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Customer customer) {
        return customerService.updateCustomer(customer);
    }
}
