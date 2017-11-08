package com.sample.controller;

import com.sample.model.Consumer;
import com.sample.server.ConsumerServer;
import com.sample.server.JxlService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import jxl.read.biff.BiffException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 *
 * @author zhenghuasheng
 * @date 2016/7/9
 */
@RestController
public class ConsumerController {
    private Logger logger = Logger.getLogger(ConsumerController.class);

    @Autowired
    private ConsumerServer consumerServer;
    @Autowired
    private JxlService jxlService;

    @RequestMapping(value = "/hs",method = RequestMethod.POST)
    @ApiOperation(value = "获取人员信息" )
    @ApiImplicitParam(name = "name" ,value = "用户名",dataType = "String",paramType = "query" )
    public Consumer greeting(@RequestParam(value = "name", required = false, defaultValue = "zhenghuasheng") String name) {
        logger.info("greeting start..........");
        return consumerServer.getConsumer(name);
    }


    @RequestMapping("/insert")
    @ResponseBody
    public int insert() throws IOException, BiffException {
        jxlService.insert();
        return 1;
    }

}
