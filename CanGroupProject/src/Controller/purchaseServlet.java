package Controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;

/**
 * Servlet implementation class purchaseServlet
 */
@WebServlet("/purchaseServlet")
public class purchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public purchaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Can myCan = CanHelper.searchForCanById(Integer.parseInt(request.getParameter("canid")));
		EmployeeHelper eh = new EmployeeHelper();
		Employee emp = eh.searchForEmployeeById(Integer.parseInt(request.getParameter("id")));
		PurchasesHelper help = new PurchasesHelper(); 
		
		//Integer id = Integer.parseInt(request.getParameter("id")); 
		//Purchases toUpdate = help.searchPurchaseByID(id); 
		
		Integer q = Integer.parseInt(request.getParameter("amountSold"));
		Purchases myPurchases = new Purchases(myCan, emp, LocalDate.now());
		myCan.removeCan(q);
		CanHelper.updateCan(myCan);
		help.updatePurchases(myPurchases);
		getServletContext().getRequestDispatcher("/viewAllPurchasesServlet").forward(request, response);
	}

}
