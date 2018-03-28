package org.kx.consumer;

import com.alibaba.dubbo.rpc.RpcContext;
import org.kx.client.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by sunkx on 2018/3/28
 */
@Service("callHello")
public class CallHello   {

    @Autowired
    HelloService helloService ;


    public void sss(){
        helloService.say();





    }

}
