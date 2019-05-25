package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient  // 自带ribbon负载均衡
@SpringBootApplication
@EnableHystrix
//@EnableHystrixDashboard
public class SpringbootRibbonConsumerApplication {

  // @LoadBalanced注解表明这个restRemplate开启负载均衡的功能;用feign则不需要
  @LoadBalanced  // 默认轮询
  @Bean
  RestTemplate restTemplate() { // spring提供的网络资源调用，类似于httpClient
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringbootRibbonConsumerApplication.class, args);
  }

}
