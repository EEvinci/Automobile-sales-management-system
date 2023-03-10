package com.evinci.service.impl;

import com.evinci.common.ServerResponse;
import com.evinci.dao.BrandMapper;
import com.evinci.dao.CarMapper;
import com.evinci.dao.CustomerMapper;
import com.evinci.dao.SeriesMapper;
import com.evinci.pojo.Brand;
import com.evinci.pojo.Car;
import com.evinci.pojo.Customer;
import com.evinci.pojo.Series;
import com.evinci.service.IInitService;
import com.evinci.vo.SeriesTree;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author evinci
 * @date 2023/1/2 21:22
 */
@Slf4j
@Service
public class InitServiceImpl implements IInitService {

    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private SeriesMapper seriesMapper;
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public ServerResponse <List <SeriesTree>> seriesOpt() {
        List <Brand> brandList = brandMapper.getBrand();

        if (!CollectionUtils.isEmpty(brandList)) {
            List<SeriesTree> treeList = new ArrayList <>();
            for (Brand brandItem : brandList) {
                SeriesTree tree = new SeriesTree();
                tree.setValue(brandItem.getBrandId());
                tree.setLabel(brandItem.getBrandName());

                List <Series> seriesList = seriesMapper.selectSeriesByBrand(brandItem.getBrandId());
                if (!CollectionUtils.isEmpty(seriesList)) {
                    List<SeriesTree> seriesTreeList = new ArrayList <>();
                    for (Series series : seriesList) {
                        SeriesTree seriesTree = new SeriesTree();
                        seriesTree.setValue(series.getSeriesId());
                        seriesTree.setLabel(series.getSeriesName());
                        seriesTreeList.add(seriesTree);
                    }
                    tree.setChildren(seriesTreeList);
                    treeList.add(tree);
                }
            }
            return ServerResponse.createBySuccess(treeList);
        }
        return ServerResponse.createByErrorMessage("?????????????????????????????????");
    }

    @Override
    public ServerResponse <List <Brand>> brandOpt() {
        List <Brand> brandList = brandMapper.getBrand();

        if (!CollectionUtils.isEmpty(brandList)) {
            return ServerResponse.createBySuccess(brandList);
        } else {
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse storeOpt(Integer seriesId) {
        List <Car> list = carMapper.selectBySeriesId(seriesId);

        if (!CollectionUtils.isEmpty(list)) {
            return ServerResponse.createBySuccess(list);
        } else {
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse getCustomer(String idCard) {
        Customer customer = customerMapper.selectByIdCard(idCard);

        if (customer != null) {
            return ServerResponse.createBySuccess(customer);
        } else {
            return ServerResponse.createByErrorMessage("???????????????");
        }
    }
}
