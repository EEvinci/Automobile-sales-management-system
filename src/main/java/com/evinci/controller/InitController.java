package com.evinci.controller;

import com.evinci.common.ServerResponse;
import com.evinci.service.IInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取brand和series信息
 * @author evinci
 * @date 2023/1/3 12:40
 */
@RestController
@RequestMapping("init")
public class InitController {

    @Autowired
    private IInitService initService;

    @RequestMapping(value = "seriesOpt", method = RequestMethod.GET)
    public ServerResponse seriesOpt() {
        return initService.seriesOpt();
    }

    @RequestMapping(value = "brandOpt", method = RequestMethod.GET)
    public ServerResponse brandOpt() {
        return initService.brandOpt();
    }

    @RequestMapping(value = "storeOpt", method = RequestMethod.GET)
    public ServerResponse storeOpt(Integer seriesId) {
        return initService.storeOpt(seriesId);
    }

    @RequestMapping(value = "getCustomer", method = RequestMethod.GET)
    public ServerResponse getCustomer(String idCard) {
        return initService.getCustomer(idCard);
    }
}
