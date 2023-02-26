package com.evinci.dao;

import com.evinci.pojo.Order;
import com.evinci.vo.EmpChart;
import com.evinci.vo.OrderQuery;
import com.evinci.vo.OrderList;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int updatePayTimeByPrimaryKey(Long orderId);

    List<OrderList> selectSale(OrderQuery orderQuery);

    int updateStatusByPrimaryKey(@Param("orderId") Long orderId, @Param("status") String status);

    int addTotalPriceByPrimaryKey(@Param("orderId") Long orderId, @Param("totalPrice") BigDecimal totalPrice);

    List<EmpChart> selectChartByDate(String date);

    List<EmpChart> selectYesterdayChart();
}