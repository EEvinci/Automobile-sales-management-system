package com.evinci.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author evinci
 * @date 2023/1/10 11:54
 */
@Data
public class Details {
    private String id;

    private Long carId;

    private Integer brandId;

    private Integer seriesId;

    private String brandName;

    private String seriesName;

    private String type;

    private String color;

    private BigDecimal salePrice;

    private Integer carNumber;
}
