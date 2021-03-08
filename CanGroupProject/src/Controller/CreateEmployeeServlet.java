package Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.Employee;
/**
 * Servlet implementation class CreateEmployeeServlet
 */
@WebServlet("/createEmployeeServlet")
public class CreateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateEmployeeServlet() {
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
		String name = request.getParameter("name");
		LocalDate hire_date = LocalDate.now();
		//String priceString = request.getParameter("price");
		//double price = Double.parseDouble(priceString);
		 
		Employee myEmployee = new Employee(name, hire_date);
		EmployeeHelper dao = new EmployeeHelper();
		dao.addEmployee(myEmployee);
		request.setAttribute("allEmployees", dao.showAllEmployees());
		getServletContext().getRequestDispatcher("/employee-page.jsp").forward(request, response);
	}

}
