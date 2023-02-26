package com.evinci.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author evinci
 * @date 2023/1/2 21:18
 */
@Getter
@Setter
public class SeriesTree {
    private Integer value;
    private String label;
    private List<SeriesTree> children;
}
