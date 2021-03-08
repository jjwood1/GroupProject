package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Can;
/**
 * Servlet implementation class AddCansServlet
 */
@WebServlet("/AddCansServlet")
public class AddCansServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCansServlet() {
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
		
		String quantity = request.getParameter("quantity");
		 int q =Integer.parseInt(quantity);
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		Can myCan = dao.searchForCanById(tempId);
		myCan.addCan(q);
		getServletContext().getRequestDispatcher("/can-edit-page").forward(request, response);
	}

}
