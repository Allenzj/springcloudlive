package com.bmsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: tyrion
 * @Date: 2019/10/23 21:12
 * @类描述:
 */
@Controller
@RequestMapping("/discovery")
public class HelloNacosDiscoveryController {

  //  服务注册上来
  @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
  @ResponseBody
  public String echo(@PathVariable("str") String str) {
    System.out.println("====服务进来了吗？====");
    return "nacos 服务发现 " + str;
  }

}
