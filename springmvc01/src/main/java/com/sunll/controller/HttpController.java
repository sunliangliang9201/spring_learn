package com.sunll.controller;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * desc
 *
 * @author sunliangliang
 * @date 2019/7/10 9:38
 */
public class HttpController implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("hello", "凤姐不喜欢你");
        request.getRequestDispatcher("/WEB-INF/jsps/index.jsp").forward(request, response);
    }
}
