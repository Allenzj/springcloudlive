package com.bmsoft.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: tyrion
 * @Date: 2019/5/6 20:35
 * @类描述: zuul不仅只是路由，并且还能过滤和安全验证
 */
@Component
public class Bmfilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(Bmfilter.class);

  /**
   * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
   * pre：路由之前, routing：路由之时,  post： 路由之后, error：发送错误调用
   */
  @Override
  public String filterType() {
    return "pre";
  }

  @Override
  public int filterOrder() {
    return 0;
  }

  /**
   * 默认false,不用过滤
   */
  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    RequestContext context = RequestContext.getCurrentContext();
    HttpServletRequest request = context.getRequest();
    System.out.println("====-" + request.getMethod() + "----" + request.getRequestURL());
    Object name = request.getParameter("name");
    if (name == null) {
      context.setSendZuulResponse(false);
      context.setResponseStatusCode(401);

      try {
        context.getResponse().getWriter().print("no name .was lanjie le ");
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
    System.out.println("name====--->" + name);
    return null;
  }
}
