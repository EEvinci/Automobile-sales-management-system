package com.evinci.service.impl;


import com.evinci.service.IOrderService;
import com.evinci.vo.OrderQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author evinci
 * @date 2023/1/10 12:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private IOrderService orderService;

    @Test
    public void getList() {
        orderService.getList(new OrderQuery());
    }

}