package org.xushu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guanqing
 * @since 2025/3/15
 */
@RestController
public class UserContoller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
