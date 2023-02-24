package com.jpa.teste;

import java.sql.*;

public class Select {

	public static void main(String[] args) throws SQLException {
		
		//Cria conexão
		String url = "jdbc:derby: C:\\Users\\dandf\\MyDB";
		Connection con = DriverManager.getConnection(url);
		
		//Cria statement
		Statement stmt = con.createStatement();
		
		//Comando sql
		String sql = "SELECT * FROM loja.cliente";
		
		//Cria resultset e executa query comando sql
		ResultSet rs = stmt.executeQuery(sql);
		
		//Loop para mostrar o conteúdo da tabela
		while (rs.next()) {
			String idCliente = rs.getString("id_cliente");
			String nome = rs.getString("nome");
			String idade = rs.getString("idade");
			
			System.out.println(idCliente + "|" + nome + "|" + idade);
		}
		
		//Fecha conexões
		rs.close();
		stmt.close();
		con.close();
	}
	
}
