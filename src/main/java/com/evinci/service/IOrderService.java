package com.evinci.service;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.OrderDetails;
import com.evinci.vo.DetailsQuery;
import com.evinci.vo.OrderQuery;
import com.evinci.vo.OrderVo;

/**
 * @author evinci
 * @date 2023/1/2 21:16
 */
public interface IOrderService {
    ServerResponse addOrder(OrderVo orderVo);

    ServerResponse getList(OrderQuery orderQuery);

    ServerResponse update(Long orderId, String status);

    ServerResponse updateDetail(OrderDetails orderDetails);

    ServerResponse deleteDetail(String id);

    ServerResponse getDetailsList(DetailsQuery detailsQuery);
}
