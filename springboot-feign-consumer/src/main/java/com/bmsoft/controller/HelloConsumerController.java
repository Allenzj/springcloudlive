package com.bmsoft.controller;

import com.bmsoft.client.DemoClient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tyrion
 * @Date: 2019/4/17 17:17
 * @类描述:
 */
@RestController
public class HelloConsumerController {

  @Autowired
  DemoClient demoClient;

  @Autowired
  DiscoveryClient discoveryClient;

  // 调用方式一，不用feign，用DiscoveryClient
  @GetMapping(value = "/hello")
  public String hello() {
    List<ServiceInstance> instances = discoveryClient.getInstances("bm-eureka-client");
    ServiceInstance serviceInstance = instances.get(0);
    return serviceInstance.getPort() + "";
  }

  @GetMapping(value = "/info")
  public String info() {
    System.out.println("====调用开始====");
    return demoClient.hello();
  }

}
