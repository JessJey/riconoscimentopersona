package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.model.Persona;

@WebServlet("/CheckPresenzaServlet")
public class CheckPresenzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckPresenzaServlet() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomeInputDaJsp = request.getParameter("nomeInput");
		String cognomeInputDaJsp = request.getParameter("cognomeInput");
		
		Persona persona = new Persona(nomeInputDaJsp,cognomeInputDaJsp);
		
		if(persona.getNome().equalsIgnoreCase("Jessica") && persona.getCognome().equalsIgnoreCase("Petrungaro")) {
			request.setAttribute("rispostaNomeAttribute", persona.getNome());
			request.setAttribute("rispostaCognomeAttribute", persona.getCognome());
			RequestDispatcher rd = request.getRequestDispatcher("riconosciuto.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("rispostaNomeAttribute", persona.getNome());
			request.setAttribute("rispostaCognomeAttribute", persona.getCognome());
			RequestDispatcher rd = request.getRequestDispatcher("sconosciuto.jsp");
			rd.forward(request, response);
		}
		
	}

}
