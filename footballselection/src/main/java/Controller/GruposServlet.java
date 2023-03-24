package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Persistence.DaoTime;
import Model.GruposMod;

/**
 * Servlet implementation class GruposServlet
 */
@WebServlet("/GruposServlet")
public class GruposServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GruposServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DaoTime dt = new DaoTime();
		try {
			dt.RodadasGen();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<GruposMod> la = new ArrayList();
		List<GruposMod> lb = new ArrayList();
		List<GruposMod> lc = new ArrayList();
		List<GruposMod> ld = new ArrayList();
		
		DaoTime dt = new DaoTime();
		
		try {
			la = dt.getGrupos("A");
			lb = dt.getGrupos("B");
			lc = dt.getGrupos("C");
			ld = dt.getGrupos("D");
			System.out.println(la.get(0).getNomeTime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd= request.getRequestDispatcher("grupos.jsp");
		request.setAttribute("ListaA", la);
		request.setAttribute("ListaB", lb);
		request.setAttribute("ListaC", lc);
		request.setAttribute("ListaD", ld);
		rd.forward(request, response);

	}

}
