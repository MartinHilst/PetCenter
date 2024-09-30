package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animal;
import repository.AnimalDAO;
import repository.ServicoDAO;
import repository.TutorDAO;

@WebServlet("/RemoveServico")
public class RemoveServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		int idAnimal = Integer.parseInt(request.getParameter("idAnimal"));
		
		ServicoDAO servicoDAO = new ServicoDAO();
		AnimalDAO animalDAO = new AnimalDAO();
		TutorDAO tutorDAO = new TutorDAO();

		servicoDAO.delete(id);
		
		Animal animal = animalDAO.selectById(idAnimal);
		
		request.setAttribute("animal", animal );
		request.setAttribute("tutor", tutorDAO.selectById(animal.getIdTutor()));
		RequestDispatcher rd = request.getRequestDispatcher("/PerfilPet");
		rd.forward(request, response);

	}

}
