package Controller;
import Model.Can;
import Model.Employee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CanNavigation
 */
@WebServlet("/canNavigation")
public class CanNavigation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CanNavigation() {
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
		CanHelper dao = new CanHelper();
		String act = request.getParameter("doThisToItem");
		
		String path = "/can-edit-page.jsp";
		
		if(act.equals("delete"))
		{
			try {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Can canToDelete = dao.searchForCanById(tempId);
			dao.deleteCan(canToDelete);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Forgot to select a can");
			}
		}
		else if(act.equals("edit or add cans"))
		{
			try {
			Integer tempId =  Integer.parseInt(request.getParameter("id"));
			Can canToEdit = dao.searchForCanById(tempId);
			request.setAttribute("canToEdit", canToEdit);
			path = "/add-cans.jsp";
			} 
			catch (NumberFormatException e)
			{
				System.out.println("Forgot to select a can");
			}
			
		}
		else if(act.equals("sell cans"))
		{
			try {
				Integer tempId =  Integer.parseInt(request.getParameter("id"));
				Can canToEdit = dao.searchForCanById(tempId);
				EmployeeHelper dao1 = new EmployeeHelper();
			
				request.setAttribute("canToEdit", canToEdit);
				request.setAttribute("allEmployees", dao1.showAllEmployees());
				path = "/purchase.jsp";
			}
			catch (NumberFormatException e)
			{
				System.out.println("Forgot to select a can");
			}
		}
		request.setAttribute("allCans", dao.showAllItems());
		getServletContext().getRequestDispatcher(path).forward(request, response);
		}
		
	}


