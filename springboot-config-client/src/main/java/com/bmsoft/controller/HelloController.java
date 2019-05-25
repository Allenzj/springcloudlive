package com.bmsoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tyrion
 * @Date: 2019/5/9 17:49
 * @类描述:
 */
@RestController
@RefreshScope // 开启感知功能
public class HelloController {

  @Value("${slave}")
  String slave;

  @RequestMapping("/name")
  public String hello() {
    return "读取配置--->" + slave;
  }

}
