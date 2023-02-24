package com.jpa.teste;
import java.sql.*;

public class Update {

	public static void main(String[] args) throws SQLException {
		
		//cria conexão
		String url = "jdbc:derby: C:\\Users\\dandf\\MyDB";
		Connection con = DriverManager.getConnection(url);
		
		//cria statement
		Statement stmt = con.createStatement();
		
		//comando sql
		String sql = "UPDATE loja.cliente SET id_cliente = 100 WHERE id_cliente = 1";
		
		//executa o sql e retorna numero de alterações feitas
		int valoresDeletados = stmt.executeUpdate(sql);
		System.out.println("Quantidade de valores alterados: " + valoresDeletados);
		
		//fecha conexões
		stmt.close();
		con.close();
	}
	
}