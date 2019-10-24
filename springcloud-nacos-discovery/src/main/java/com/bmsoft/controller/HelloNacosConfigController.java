package com.bmsoft.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: tyrion
 * @Date: 2019/10/21 20:56
 * @类描述:
 */
@Controller
@RequestMapping("/config")
@RefreshScope // 原生配置实现自动更新
public class HelloNacosConfigController {

  // @NacosValue 注解设置属性值
  @NacosValue(value = "${flag:false}", autoRefreshed = true)
  private boolean flag;

  @RequestMapping("/get")
  @ResponseBody
  public boolean get() {
    System.out.println("--调用成功----->" + flag);
    return flag;
  }


}
