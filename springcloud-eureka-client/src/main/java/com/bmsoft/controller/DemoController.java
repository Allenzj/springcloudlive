package com.bmsoft.controller;

import java.io.File;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tyrion
 * @Date: 2019/4/17 10:48
 * @类描述:
 */
@RestController
public class DemoController {

  @Value("${server.port}")
  private String port;

  @RequestMapping("/info")
  public String getInfo() {
    String path =
        FileUtil.rootPath() + File.separator + "springcloud-eureka-client" + File.separator + "pdf";
    InputStream stream = DemoController.class.getClassLoader()
        .getResourceAsStream("pdf/a.pdf");
    String path1 = DemoController.class.getClassLoader().getResource("pdf/a.pdf").getPath();
    System.out.println(path1 + "----PDF模板文件的根路径：" + path);
    String template = path + File.separator + "a.pdf";

    File file = new File(template);
    File path_file = new File(path1);
    System.out.println(file + "====>" + file.exists());
    System.out.println(path_file + "====>" + path_file.exists());
    return "eureka、zookeeper、consol的区别，集群端口--->" + port;
  }


  @RequestMapping("/info2")
  public String getInfo2() {
    String path =
        FileUtil.rootPath() + File.separator + "springcloud-eureka-client" + File.separator + "pdf";

    System.out.println("PDF模板文件的根路径：" + path);
    String template = path + File.separator + "b.pdf";
    File file = new File(template);
    System.out.println(file + "====>" + file.exists());
//    try {
//      PdfReader reader = new PdfReader(template);
//      System.out.println("reader----" + reader);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    return "eureka、zookeeper、consol的区别，集群端口--->" + port;
  }
}
