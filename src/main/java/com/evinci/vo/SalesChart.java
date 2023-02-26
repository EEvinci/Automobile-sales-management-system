package com.evinci.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author evinci
 * @date 2023/1/14 12:10
 */
@Data
public class SalesChart {
    private String date;

    private BigDecimal income;

    private BigDecimal expenditure;

    private BigDecimal profit;
}
