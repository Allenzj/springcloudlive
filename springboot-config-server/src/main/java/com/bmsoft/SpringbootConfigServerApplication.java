package com.bmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer  // 开启配置服务器功能
@SpringBootApplication
public class SpringbootConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootConfigServerApplication.class, args);
  }

}
