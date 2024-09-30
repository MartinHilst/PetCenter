package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.ColaboradorDAO;
import repository.TutorDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TutorDAO tutorDAO = new TutorDAO();
		ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
		
		String cpf = request.getParameter("cpf");
		String senha = request.getParameter("senha");
		
		
		if(colaboradorDAO.validarLogin(cpf, senha)) {
			RequestDispatcher rd = request.getRequestDispatcher("/menu.jsp");
			rd.forward(request, response);
		} else if(tutorDAO.validarLogin(cpf, senha)) {
			RequestDispatcher rd = request.getRequestDispatcher("/menu.jsp");
			rd.forward(request, response);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?error=invalid");
		rd.forward(request, response);

	}

}
