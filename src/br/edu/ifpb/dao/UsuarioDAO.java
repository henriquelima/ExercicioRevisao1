package br.edu.ifpb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifpb.conexao.ConnectionFactory;
import br.edu.ifpb.entidade.Usuario;

public class UsuarioDAO {
	private Connection con;
	
	public UsuarioDAO(){
		this.con = new ConnectionFactory().getConnection();			
	}
	public void adiciona(Usuario usuario){
		String sql = "insert into usuarios" + "(nome,email,senha)" + " values (?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,usuario.getNome());
			stmt.setString(2,usuario.getEmail());
			stmt.setString(3,usuario.getSenha());
			
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e); 
		} 
	}
}
