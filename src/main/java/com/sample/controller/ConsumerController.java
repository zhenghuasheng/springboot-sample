package com.sample.controller;

import com.sample.model.Consumer;
import com.sample.server.ConsumerServer;
import com.sample.server.JxlService;
import jxl.read.biff.BiffException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by zhenghuasheng on 2016/7/9.
 */
@Controller
public class ConsumerController {
    private Logger logger = Logger.getLogger(ConsumerController.class);

    @Autowired
    private ConsumerServer consumerServer;
    @Autowired
    private JxlService jxlService;

    @RequestMapping("/hs")
    @ResponseBody
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
