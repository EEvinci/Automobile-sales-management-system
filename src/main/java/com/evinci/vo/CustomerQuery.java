package com.evinci.vo;

import lombok.*;

/**
 * @author evinci
 * @date 2023/1/6 13:29
 */
@Data
public class CustomerQuery {
    private int page = 1;

    private int limit = 5;

    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private String orderBy;
}
