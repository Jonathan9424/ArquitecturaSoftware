package com.arquitectura.practicaUno.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario")
public class Formulario extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = (String) request.getParameter("nombre");
		String apellidos = (String) request.getParameter("apellidos");
		String telefono = (String) request.getParameter("telefono");
		String cedula = (String) request.getParameter("cedula");

		request.setAttribute("nombre", nombre);
		request.setAttribute("apellidos", apellidos);
		request.setAttribute("telefono", telefono);
		request.setAttribute("cedula", cedula);
		System.out.println(nombre + " / " + apellidos + " / " + telefono + " / " + cedula);
		request.getRequestDispatcher("redirect/bienvenida.jsp").forward(request, response);
	}

}
