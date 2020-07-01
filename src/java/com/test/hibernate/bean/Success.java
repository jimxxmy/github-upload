/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hibernate.bean;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

/**
 *
 * @author Jimit Vaghela
 */
public class Success extends HttpServlet {
    
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
 
        writer.println("" + "" + "<center>"
                + "Details Added Successfully" + "</center>" + ""
                + "");
    }
    
}
