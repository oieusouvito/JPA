package com.jpa.teste;

import java.sql.*;


public class Aplicacao {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:derby:C:\\Users\\dandf\\MyDB";
		Connection con = DriverManager.getConnection(url);
		
		Statement stmt = con.createStatement();
		
//		String insert = "INSERT INTO loja.cliente(id_cliente, nome, idade) VALUES (2, 'Daniel', 21)";
//		
//		int rowsAffected = stmt.executeUpdate(insert);
//		
//		System.out.println("Número de atualizações: " + rowsAffected);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM loja.cliente");
		
		while (rs.next()) {
			String nome = rs.getString("nome");
			String idade = rs.getString("idade");
			System.out.println(nome + " " + idade);
		}
		
		//rs.close();
		stmt.close();
		con.close();
		
	}
	
}
