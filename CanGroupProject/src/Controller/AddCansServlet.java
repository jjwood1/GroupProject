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
@WebServlet("/addCansServlet")
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CanHelper dao = new CanHelper();
		String company = request.getParameter("company");
		String content = request.getParameter("content");
		String quantity = request.getParameter("quantity");
		 int q =Integer.parseInt(quantity);
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		Can myCan = dao.searchForCanById(tempId);
		myCan.setCompany(company);
		myCan.setContent(content);
		myCan.addCan(q);
		dao.updateCan(myCan);
		request.setAttribute("allCans", dao.showAllItems());
		getServletContext().getRequestDispatcher("/can-edit-page.jsp").forward(request, response);
	}

}
