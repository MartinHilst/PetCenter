package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tutor;
import repository.AnimalDAO;
import repository.TutorDAO;



@WebServlet("/PerfilTutorReal")
public class PerfilTutorReal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TutorDAO tutorDAO = new TutorDAO();
		AnimalDAO dao = new AnimalDAO();
		

		int id= Integer.parseInt(request.getParameter("id"));

		Tutor tutor = tutorDAO.selectById(id);
		request.setAttribute("tutor", tutor);
		request.setAttribute("animais", dao.selectByTutorId(tutor.getIdTutor()));
		RequestDispatcher rd = request.getRequestDispatcher("/perfilTutor.jsp");
		rd.forward(request, response);

	}


}
