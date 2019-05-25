package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient    注释了竟然也可以？？wtf
//@EnableDiscoveryClient
public class SpringbootEurekaClientApplication {

  public static void main(String[] args) {

    SpringApplication.run(SpringbootEurekaClientApplication.class, args);

    System.out.println("=====注册服务 client");
  }

}
