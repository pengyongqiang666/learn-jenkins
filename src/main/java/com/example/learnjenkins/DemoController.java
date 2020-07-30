package com.example.learnjenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengYongQiang
 * @version 1.0
 * @date 2020/7/29 16:49
 */
@RestController
public class DemoController {

    @RequestMapping("demo")
    public String demo(){
        return "hellp1";
    }
}
