/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thomas Skiffington
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstString = request.getParameter("first");
        String secondString  = request.getParameter("second");
        
        int first;
        int second;
        int calc = 0;
        boolean isValid = true;
        
        
        try{
             Integer.parseInt(firstString);
             Integer.parseInt(secondString);
        }
        
        catch (NumberFormatException e)
        {
              isValid = false;
        }
        
       if(isValid == false){
           request.setAttribute("result","invalid");
       }
       
       else{
             first = Integer.parseInt(firstString);
             second = Integer.parseInt(secondString);
             
           if(request.getParameter("+") != null){
               calc = first + second;
               request.setAttribute("result",calc);
           }
           else if(request.getParameter("-") != null){
               calc = first - second;
               request.setAttribute("result",calc);
           }
            else if(request.getParameter("*") != null){
               calc = first * second;
               request.setAttribute("result",calc);
           }
            else if(request.getParameter("%") != null){
                if(second == 0){
                     request.setAttribute("result","invalid");
                }
                else{
               calc = first % second;
               request.setAttribute("result",calc);
                }
           }
           
       }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
