package com.zsanything.cloud.controller;

import com.zsanything.cloud.model.User;
import com.zsanything.cloud.service.IHelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @RestController 是@ResponseBody和@Controller的组合注解
 */
@RestController
public class HelloController {

    @Autowired
    private IHelloFeignService helloFeignService;

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1() {
        return helloFeignService.hello1("张三");
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello2() {
        User user = new User();
        user.setName("李四");
        return helloFeignService.hello2(user);
    }

}
