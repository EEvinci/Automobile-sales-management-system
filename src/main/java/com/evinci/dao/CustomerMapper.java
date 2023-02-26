package com.evinci.dao;

import com.evinci.pojo.Customer;
import com.evinci.vo.CustomerQuery;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectSelective(CustomerQuery customerQuery);

    Customer selectByIdCard(String idCard);
}