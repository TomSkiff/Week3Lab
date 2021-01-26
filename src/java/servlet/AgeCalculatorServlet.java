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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        int age = 0;
        boolean isValid = true;
        String ageString = request.getParameter("age");
        
        try{
             age = Integer.parseInt(ageString)+1;
        }
        
        catch (NumberFormatException e)
        {
              isValid = false;
        }
        
        if (isValid == false){
            request.setAttribute("message","You must enter a number.");
        }
        else{
            request.setAttribute("message","Your age next birthday will be "+ age);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

        
        
    }


