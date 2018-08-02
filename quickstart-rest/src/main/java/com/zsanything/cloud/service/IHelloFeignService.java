package com.zsanything.cloud.service;

import com.zsanything.cloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-compose")
public interface IHelloFeignService {

    @RequestMapping(value = "/feign-hello-service/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name);

    @RequestMapping(value = "/feign-hello-service/hello2", method = RequestMethod.POST)
    User hello2(@RequestBody User user);
}
