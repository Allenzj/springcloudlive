package com.bmsoft.client;

import org.springframework.stereotype.Component;

/**
 * @Auther: tyrion
 * @Date: 2019/4/22 18:09
 * @类描述:
 */
@Component
public class DemoClientHystric implements DemoClient {

  @Override
  public String hello() {
    return "hello，我是feign自带的路由器操作";
  }
}
