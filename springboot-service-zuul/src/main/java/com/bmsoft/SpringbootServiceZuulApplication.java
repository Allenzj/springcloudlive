package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy  // 网关服务
public class SpringbootServiceZuulApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootServiceZuulApplication.class, args);
  }

}
