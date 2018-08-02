package com.zsanything.cloud.api;

import com.zsanything.cloud.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign-hello-service")
public class HelloServiceController {

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam("name") String name) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public User hello2(@RequestBody User user) {
        if (null == user) {
            return null;
        }
        user.setAge(20);

        return user;
    }
}
