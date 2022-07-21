package com.example.docservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest request;
    private final HttpServletResponse response;
    public Rq(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;

        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {}
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
    }

    public int getIntParam(String parameter, int defaultValue) {
        String parameterValue = request.getParameter(parameter);

        if (parameterValue == null ) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(parameterValue);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public void appendBody(String body) {
        try {
            response.getWriter().append(body);
        } catch (IOException e) {}
    }
}
