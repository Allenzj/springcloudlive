package com.bmsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: tyrion
 * @Date: 2019/10/23 21:12
 * @类描述:
 */
@RestController
@RequestMapping("/consumer")
public class HelloNacosConsumerController {

  private final RestTemplate restTemplate;

  @Autowired
  public HelloNacosConsumerController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate; //初始化restTemplate
  }


  @GetMapping(value = "/discovery/{str}")
  public String discovery(@PathVariable String str) {
    System.out.println("----调用服务开始");
    return restTemplate.getForObject("http://nacos/discovery/echo/" + str, String.class);
  }

}
