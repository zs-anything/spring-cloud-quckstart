package com.zsanything.cloud.hystrix.fallback;

import com.zsanything.cloud.model.User;
import com.zsanything.cloud.service.IHelloFeignService;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignServiceHystrix implements IHelloFeignService {
    @Override
    public String hello1(String name) {
        return "服务不可用" + name;
    }

    @Override
    public User hello2(User user) {
        return user;
    }
}
