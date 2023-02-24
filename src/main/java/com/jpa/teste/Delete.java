package com.jpa.teste;
import java.sql.*;

public class Delete {

	public static void main(String[] args) throws SQLException {
		
		//cria conexão
		String url = "jdbc:derby: C:\\Users\\dandf\\MyDB";
		Connection con = DriverManager.getConnection(url);
		
		//cria statement
		Statement stmt = con.createStatement();
		
		//comando sql
		String sql = "DELETE FROM loja.cliente WHERE id_cliente = 3";
		
		//executa o sql e retorna numero de deleções feitas
		int valoresDeletados = stmt.executeUpdate(sql);
		System.out.println("Quantidade de valores deletados: " + valoresDeletados);
		
		//fecha conexões
		stmt.close();
		con.close();
	}
	
}
