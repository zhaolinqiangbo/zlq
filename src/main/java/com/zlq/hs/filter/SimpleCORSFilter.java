package com.zlq.hs.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleCORSFilter implements Filter {
    private boolean isCross = false;

    public void destroy() {
        isCross = false;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        if (isCross) {
            res.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
            if(req.getHeader("Origin")!=null&&!"".equals(req.getHeader("Origin"))){
                res.setHeader("Access-Control-Allow-Origin",req.getHeader("Origin"));
            }else{
                res.setHeader("Access-Control-Allow-Origin","*");
            }
            res.setHeader("Access-Control-Allow-Credentials", "true");
            res.setHeader("Access-Control-Allow-Headers",
                    "Accept,Accept-Encoding,Accept-Language,Connection,Content-Length,Content-Type, Cookie,Host,Origin,Referer,User-Agent, Authorization,X-Requested-With,OsType");
            res.setHeader("Access-Control-Allow-Methods", "POST,GET, HEAD,PUT, DELETE, TRACE, OPTIONS");
        }
        if("OPTIONS".equalsIgnoreCase(req.getMethod())){
            response.getOutputStream().close();
        }else{

            chain.doFilter(req, res);
        }
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        String isCrossStr = filterConfig.getInitParameter("IsCross");
        isCross = isCrossStr.equals("true") ? true : false;
    }
}
