package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Can;

/**
 * Servlet implementation class AddCanServlet
 */
@WebServlet("/createCanServlet")
public class CreateCanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String company = request.getParameter("company");
		String content = request.getParameter("content");
		String priceString = request.getParameter("price");
		double price = Double.parseDouble(priceString);
		 
		Can myCan = new Can(company, content, price);
		CanHelper dao = new CanHelper();
		dao.insertItem(myCan);
		getServletContext().getRequestDispatcher("/can-edit-page").forward(request, response);
	}

}
