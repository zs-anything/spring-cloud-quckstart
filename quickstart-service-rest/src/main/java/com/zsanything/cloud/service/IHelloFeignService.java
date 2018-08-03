package com.zsanything.cloud.service;

import com.zsanything.cloud.hystrix.fallback.HelloFeignServiceHystrix;
import com.zsanything.cloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用服务
 * @FeignClient
 *      name：服务名 就是工程配置的spring.application.name
 *      fallback：服务不可用，触发断路器时调用的方法
 */
@FeignClient(name = "service-compose", fallback = HelloFeignServiceHystrix.class)
public interface IHelloFeignService {

    @RequestMapping(value = "/feign-hello-service/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam("name") String name);

    @RequestMapping(value = "/feign-hello-service/hello2", method = RequestMethod.POST)
    User hello2(@RequestBody User user);
}
