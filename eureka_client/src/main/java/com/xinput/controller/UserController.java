package com.xinput.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinput
 * @date 2018-11-28 23:28
 */
@RestController
public class UserController {

    @RequestMapping(value = "/portal/review")
    public String test() {
        return "测试";
    }

}
