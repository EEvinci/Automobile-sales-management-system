package com.evinci.vo;

import lombok.Data;

/**
 * @author evinci
 * @date 2023/1/10 9:55
 */
@Data
public class OrderQuery {
    private int page = 1;

    private int limit = 5;

    private Long orderId;

    private String customerName;

    private String employeeName;

    private String status;

    private String orderBy;
}
