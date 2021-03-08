package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewAllPurchasesServlet") 
public class viewAllPurchasesServlet extends HttpServlet { 
    private static final long serialVersionUID = 1L; 

    public viewAllPurchasesServlet() {
        super(); 

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        PurchasesHelper ph = new PurchasesHelper(); 
        request.setAttribute("allPurchases", ph.showAllPurchases()); 
        String path = "/view-purchases.jsp"; 
        getServletContext().getRequestDispatcher(path).forward(request, response); 
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        doGet(request, response); 
    }
    
}