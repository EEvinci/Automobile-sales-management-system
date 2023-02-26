package com.evinci.service;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.Brand;
import com.evinci.vo.SeriesTree;

import java.util.List;

/**
 * @author evinci
 * @date 2023/1/3 12:56
 */
public interface IInitService {

    /**
     * 封装车系选择
     * @return
     */
    ServerResponse<List<SeriesTree>> seriesOpt();

    /**
     * 封装品牌选择
     * @return
     */
    ServerResponse<List<Brand>> brandOpt();

    ServerResponse storeOpt(Integer seriesId);

    ServerResponse getCustomer(String idCard);
}
