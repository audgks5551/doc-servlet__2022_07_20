package com.example.docservlet.servlet;

import com.example.docservlet.Rq;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class gugudanServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Rq rq = new Rq(request, response);

        int dan = rq.getIntParam("dan", 0);
        int limit = rq.getIntParam("limit", 0);

        rq.appendBody("<h1>%d단</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }
    }
}