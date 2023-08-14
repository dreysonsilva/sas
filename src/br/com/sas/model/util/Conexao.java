package br.com.sas.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String url = "jdbc:mysql://localhost:3306/fucturatwo?useTimezone=true&serverTimezone=UTC"; 
	
	private String user = "root";
	private String password ="#root";
	
	Connection conn = null;

	public  Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			if(conn!=null) {
				System.out.println("conectado");
			}
		}catch(Exception e) {
			System.err.println("Erro no DRIVER: \n "+e.getMessage());
		}
		return conn;
	};
	
	
	public void fecharConexao() {
		try {
			if(conn!=null) {
				conn.close();
			}
		}catch(SQLException sqle) {
			System.out.println("Erro ao fehcar conexao."+sqle.getMessage());
		}
	}
}
