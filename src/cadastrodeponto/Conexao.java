package cadastrodeponto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {
	private String url;
	private String usuario;
	private String senha; 
	private Connection con;
	
	Conexao() {
		url = "jdbc:postgresql://localhost:5432/controle_ponto";
		usuario = "postgres";
		senha = "postgres";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão Realizada com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu n ó");
		}
		
	}
	
	public int rodaSQL(String sql) {
		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);
			con.close();
			return res;
		} catch (Exception e) {
			return 0;
			
		}
	}
 }
