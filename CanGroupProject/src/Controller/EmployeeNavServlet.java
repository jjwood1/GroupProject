package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Employee;


/**
 * Servlet implementation class EmployeeNavServlet
 */
@WebServlet("/employeeNavServlet")
public class EmployeeNavServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeNavServlet() {
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
		EmployeeHelper dao = new EmployeeHelper();
		String act = request.getParameter("doThisToItem");
		
		String path = "/employee-page.jsp";
		
		if(act.equals("delete"))
		{
			try {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Employee employeeToDelete = EmployeeHelper.searchForEmployeeById(tempId);
			dao.deleteEmployee(employeeToDelete);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Forgot to select a can");
			}
		}
		request.setAttribute("allEmployees", dao.showAllEmployees());
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
