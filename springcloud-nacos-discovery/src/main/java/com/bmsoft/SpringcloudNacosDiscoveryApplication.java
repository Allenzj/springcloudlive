package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 服务注册于发现方法
public class SpringcloudNacosDiscoveryApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringcloudNacosDiscoveryApplication.class, args);
    System.out.println("====启动nacos客户端的config和服务注册发现====");
  }

}
