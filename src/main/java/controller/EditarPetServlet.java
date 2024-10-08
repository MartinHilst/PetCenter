package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.TutorDAO;

/**
 * Servlet implementation class CadastroPetServlet
 */
@WebServlet("/EditarPetServlet")
public class EditarPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TutorDAO tutorDAO = new TutorDAO();
		
		request.setAttribute("tutores", tutorDAO.selectAll());
		RequestDispatcher rd = request.getRequestDispatcher("/cadastroPet.jsp");
		rd.forward(request, response);

	}

}
