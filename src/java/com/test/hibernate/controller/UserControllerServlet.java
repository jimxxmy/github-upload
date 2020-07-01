/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hibernate.controller;

/**
 *
 * @author Jimit Vaghela
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.hibernate.bean.UserDAO;
 
public class UserControllerServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
     protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
    
 
        HttpSession session = request.getSession(true);
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(firstNumber, secondNumber);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }
    
}
