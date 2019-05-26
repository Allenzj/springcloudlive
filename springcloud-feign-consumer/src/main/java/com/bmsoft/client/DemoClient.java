package com.bmsoft.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: tyrion
 * @Date: 2019/4/17 17:12
 * @类描述: 指定这个接口所要调用的 提供者服务名称 "bm-eureka-client"
 */
@FeignClient(value = "bm-eureka-client",fallback = DemoClientHystric.class)
public interface DemoClient {

  @RequestMapping(value = "/info", method = RequestMethod.GET)
  String hello();

}
