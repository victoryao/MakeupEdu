package com.yaohoo.service.provider.controller.filter;


import com.yaohoo.service.common.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub

    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }


    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
            ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String requestURI = request.getRequestURI();
        HttpSession session = request.getSession();
        if (requestURI.equals("/client/login.do")) {
            chain.doFilter(req, res);
        }
        // 如果Session为空，则跳转到指定页面
        if (session == null || session.getAttribute(Constant.sessionCheckKey) == null) {
            if (!requestURI.equals("/user/login.do")) {
                response.sendRedirect("/");
            } else {
                chain.doFilter(req, res);
            }
        } else {
            chain.doFilter(req, res);
        }

    }

}
