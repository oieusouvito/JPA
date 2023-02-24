package com.jpa.teste;

import java.sql.*;

public class Insert {

	public static void main(String[] args) throws SQLException {
		
		//Faz a conexão
		String url = "jdbc:derby: C:\\Users\\dandf\\MyDB";
		Connection con = DriverManager.getConnection(url);
		
		//Cria o statement
		Statement stmt = con.createStatement();
		
		//Código em sql para ser executado
		String sql = "INSERT INTO loja.cliente (id_cliente, nome, idade) VALUES (3, 'Lima', 22)";
		
		//Coloca em uma variável o número de valores adicionados e executa o comando sql
		int valoresAdicionados = stmt.executeUpdate(sql);
		
		//Printa a quantidade de valores adicionados
		System.out.println("O número de valores adicionados foi: " + valoresAdicionados);
		
		//fecha as conexoes
		stmt.close();
		con.close();

	}
}
