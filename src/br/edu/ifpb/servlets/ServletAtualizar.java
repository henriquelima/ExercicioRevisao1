package br.edu.ifpb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifpb.dao.UsuarioDAO;
import br.edu.ifpb.entidade.Usuario;

@WebServlet("/ServletAtualizar")
public class ServletAtualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAtualizar() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		HttpSession sessao = request.getSession();		
		
		Usuario usuario = (Usuario)sessao.getAttribute("usuario");	
		
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);				
		
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.atualiza(usuario);
		
		out.println("<h1>Usuario Atualizado</h1>");	
		
	}

}
