package com.damu;


import com.damu.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class HelloServiceImpl implements HelloService{
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
    @Override
    public String sayhello(HelloObject helloObject) {
        logger.info("接收到消息：{}", helloObject.getMessage());
        return "这是Hello的Impl1方法";
    }
}