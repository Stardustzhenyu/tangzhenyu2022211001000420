package com.demo.tang.week2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class helloworldservlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        PrintWriter writer=response.getWriter();
        writer.println("hellow client!!!!");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
