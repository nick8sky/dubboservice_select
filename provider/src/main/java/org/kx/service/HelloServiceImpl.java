package org.kx.service;

import org.kx.client.HelloService;
import org.springframework.stereotype.Service;

/**
 * create by sunkx on 2018/3/28
 */
@Service("helloService")
public class HelloServiceImpl  implements HelloService {
    public void say() {
        System.out.println("2");
    }
}
