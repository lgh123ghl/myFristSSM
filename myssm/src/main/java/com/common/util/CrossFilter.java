package com.common.util;

import com.alibaba.druid.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** 过滤器工具类
 * @author : LGH
 * @Date: 2019/5/20 16:05
 * @Description:
 */
public class CrossFilter implements Filter {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        logger.info("【允许跨域访问】refererUrl【{}】", request.getHeader("Referer"));

        //允许跨域访问
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "https://monline.01zhuanche.com");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "0");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,Authorization,SessionToken,JSESSIONID,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("XDomainRequestAllowed","1");


        filterChain.doFilter(request, response);
    }

    public static String getRefererUrl(HttpServletRequest request){
        String returnValue = null;
        if(request != null && !StringUtils.isEmpty(request.getHeader("Referer"))) {
            returnValue = request.getHeader("Referer");
            String[] urls = returnValue.split("/");
            if(urls != null && urls.length > 3) {
                returnValue = urls[0] + "//" + urls[2];
            }
        }
        return returnValue;
    }
    @Override
    public void destroy() {

    }
}



