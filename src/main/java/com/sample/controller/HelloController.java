package com.sample.controller;

import com.alibaba.fastjson.JSON;
import com.sample.model.Consumer;
import com.sample.server.rabbitmq.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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

    @Autowired
    private JavaMailSender mailSender;


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




    @RequestMapping("/sendMail")
    @ResponseBody
    public String sendMail(String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("52126375@qq.com");
        message.setTo("1367729767@qq.com");
        message.setSubject("主题：简单邮件");

        if (StringUtils.isEmpty(content)) {
            message.setText("测试邮件内容");
        }else {
            message.setText(content);
        }

        mailSender.send(message);
        return "success";
    }


    public static void main(String[] args) {

        Consumer consumer = new Consumer();
        consumer.setId(1);
        consumer.setMemberName("zhs");
        System.out.println(JSON.toJSONString(consumer));

        String s = "{\n" +
                "\t\"date\": 1556270290281,\n" +
                "\t\"id\": 1,\n" +
                "\t\"memberName\": \"zhs\",\n" +
                "\t\"sss\": \"123456789\"\n" +
                "}";


        Consumer c = JSON.parseObject(s, Consumer.class);
        System.out.println(c);
    }

}

