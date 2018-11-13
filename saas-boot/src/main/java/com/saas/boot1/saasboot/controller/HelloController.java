package com.saas.boot1.saasboot.controller;

import com.saas.boot1.saasboot.validaparams.DemoReq;
import com.saas.boot1.saasboot.validaparams.ValidatorUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/hello1")
    public String index1() throws Exception {
        if (true)
            throw new Exception("ddd");
        return "OK";
    }

    @PostMapping ("/demo/valid")
    public String demoValid(@Valid DemoReq req) {
        return req.getCode() + "," + req.getName();
    }

    /*不使用@valid的情况下，也可利用编程的方式编写一个工具类，进行实体参数校验*/
    @PostMapping("/demo/valid1")
    public String demoValid1(@Valid DemoReq req) throws Exception {
        //手动校验
        ValidatorUtil.validate(req);
        return req.getCode() + "," + req.getName();
    }
}
