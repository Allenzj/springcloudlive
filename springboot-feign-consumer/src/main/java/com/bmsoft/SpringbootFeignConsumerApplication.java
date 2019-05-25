package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableEurekaClient
public class SpringbootFeignConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootFeignConsumerApplication.class, args);
    System.out.println("====服务消费方开始调用feign============");
  }

}
