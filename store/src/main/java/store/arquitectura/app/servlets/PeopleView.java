package store.arquitectura.app.servlets;

import java.io.IOException;
import java.io.Serializable;
import java.rmi.ServerException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import store.arquitectura.app.facade.IPeopleController;
import store.arquitectura.app.mappingtables.People;

@WebServlet("/PeopleView")
public class PeopleView extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private IPeopleController ip;

	public PeopleView() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = (String) request.getParameter("nombre");
		String telefono = (String) request.getParameter("telefono");

		People p = new People();
		p.setNombre(nombre);
		p.setTelefono(telefono);
		ip.addPeople(p);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = (String) request.getParameter("nombre");
		String telefono = (String) request.getParameter("telefono");

		People p = new People();
		p.setNombre(nombre);
		p.setTelefono(telefono);
		ip.addPeople(p);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
