package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.RodadaMod;
import Persistence.DaoTime;

/**
 * Servlet implementation class RodadaServ
 */
@WebServlet("/RodadaServ")
public class RodadaServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RodadaServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		System.out.println(request.getParameter("datatxt"));
		if(request.getParameter("datatxt") != "") {
			ld = LocalDate.parse(request.getParameter("datatxt"));
		}
		String msg = "";
		List<RodadaMod> listr = new ArrayList();
		DaoTime dt = new DaoTime();
		
		try {
			listr = dt.getRodada(ld);
			msg = dt.getMsg();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("rodadas.jsp");
		request.setAttribute("msg", msg);
		request.setAttribute("list", listr);
		rd.forward(request, response);
	}

}
