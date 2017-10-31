package com.sample.controller;

import com.sample.server.rabbitmq.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhenghuasheng on 2017/5/12.15:14
 */
@Controller
public class HelloController {
    @Autowired
    private RabbitSender rabbitSender;

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


    @ResponseBody
    @RequestMapping("/send")
    public String sendMessage(String content) {
        rabbitSender.sendMessage(content);
        return "success";
    }


}

