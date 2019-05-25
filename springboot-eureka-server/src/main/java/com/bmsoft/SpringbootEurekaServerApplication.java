package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   // 将此项目配置为eureka服务注册中心服务端
public class SpringbootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaServerApplication.class, args);
		System.out.println("=====服务注册中心启动===========");
	}

}
