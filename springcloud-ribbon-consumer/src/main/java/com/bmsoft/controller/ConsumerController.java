package com.bmsoft.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: tyrion
 * @Date: 2019/4/17 16:40
 * @类描述:
 */
@RestController
public class ConsumerController {

  @Autowired
  private RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "hi")
  @GetMapping(value = "/hello")
  public String hello() {
    // 做了负载均衡
    // restTemplate.getForEntity() 会拿到header头信息
    return restTemplate.getForObject("http://bm-eureka-client/info", String.class);
  }

  // 降级:就是在执行主流程时，主流程突然出现意外执行不下去了，那就执行另外一个方法让主流程看起来是正常的
  // 熔断就跟保险丝一样，当一个服务请求并发特别大，服务器已经招架不住了，调用错误率飙升，当错误率达到一定阈值后，就将这个服务熔断了。熔断之后，后续的请求就不会再请求服务器了，以减缓服务器的压力。
  // 这里只演示降级
  public String hi() {
    return "你出错啦~";
  }

}
