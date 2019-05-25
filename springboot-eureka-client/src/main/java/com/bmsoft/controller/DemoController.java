package com.bmsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tyrion
 * @Date: 2019/4/17 10:48
 * @类描述:
 */
@RestController
public class DemoController {

  @Value("${server.port}")
  private String port;

  @RequestMapping("/info")
  public String getInfo() {
    return "eureka、zookeeper、consol的区别，集群端口--->" + port;
  }

}
