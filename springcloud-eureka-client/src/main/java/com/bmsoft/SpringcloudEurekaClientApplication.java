package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient    注释了竟然也可以？？wtf
//@EnableDiscoveryClient
public class SpringcloudEurekaClientApplication {

  public static void main(String[] args) {

    SpringApplication.run(SpringcloudEurekaClientApplication.class, args);

    System.out.println("=====注册服务 client");
  }

}
