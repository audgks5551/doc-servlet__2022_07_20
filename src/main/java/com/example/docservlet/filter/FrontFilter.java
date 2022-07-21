package com.example.docservlet.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = {"/*"})
public class FrontFilter implements Filter {
    private int lastId = 0;

    @Override
    public void init(FilterConfig filterConfig) {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("hio" + lastId);
        lastId++;
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}
}
