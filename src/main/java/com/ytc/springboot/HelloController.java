package com.ytc.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:.<br>
 *
 * @author yintianchao
 * @date 2019/10/23
 */
@RestController
@PropertySource("classpath:application-prod.properties")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${com.ytc.say1}")
    private String say;

    @RequestMapping("/hello")
    public String hello(){
        logger.info("=================hello==============");
        return say;
    }
}
