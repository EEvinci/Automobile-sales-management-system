package com.evinci.service;

import com.evinci.common.ServerResponse;
import com.evinci.pojo.Car;
import com.evinci.vo.StoreQuery;

/**
 * @author evinci
 * @date 2023/1/3 10:07
 */
public interface IStoreService {

    ServerResponse addBrand(String brandName);

    ServerResponse delBrand(Integer brandId);

    ServerResponse addSeries(Integer brandId, String seriesName);

    ServerResponse delSeries(Integer seriesId);

    ServerResponse addStore(Car car);

    ServerResponse getList(StoreQuery storeQuery);

    ServerResponse updateStore(Car car);
}
