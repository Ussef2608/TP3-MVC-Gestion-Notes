package Controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import mod.sco.Scolarite;
import form.beans.NoteForm;

@WebServlet("/ControleurServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleurServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoteForm nf = new NoteForm();
		Scolarite sco = new Scolarite();

		nf.setNumIns(request.getParameter("numIns"));
		nf.setLesNotes(sco.getNotes(nf.getNumIns()));

		HttpSession session = request.getSession();
		session.setAttribute("nf", nf);

		response.sendRedirect("Note.jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
