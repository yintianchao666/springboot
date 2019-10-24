package com.ytc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:.<br>
 *
 * @author yintianchao
 * @date 2019/10/23
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot";
    }
}
