
package main;

	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;
	import java.sql.Connection;

	public class Programa {

		public static void main(String[] args) throws SQLException {
			String dbURL = "jdbc:mysql://localhost:3306/Quarto";
			String username = "root";
			String senha = "";
			
			Connection conexao = DriverManager.getConnection(dbURL, username, senha);
			
			if(conexao != null) {
				System.out.println("Conectado!");
			}
			
			//Select
			
		/*	String sql = "select * from Quarto";
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet resultSet = ps.executeQuery();
			
			while( resultSet.next()) {
				int numero_quarto = resultSet.getInt("numero_quarto");
				int quant_pessoas = resultSet.getInt("quant_pessoas");
				int andar = resultSet.getInt("andar");
				
				System.out.println("Numero do quarto: " + numero_quarto);
				System.out.println("Quantidade de pessoas: " + quant_pessoas);
				System.out.println("Numero do andar: " + andar + "\n");
			}
			*/
			
			//Delete
			
		/*	String sql = "delete from Quarto where id_Quarto = ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1,3);
			
			System.out.println("Feito " + ps.executeUpdate());
		*/				
			//Update
			String sql = "update Quarto set quant_pessoas = ? where quant_pessoas > ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, 3);
			ps.setInt(2, 6);
			
			System.out.println("Linhas afetadas " +  ps.executeUpdate());
			
			
			//Insert 
			
		/*	String sql = "insert into Quarto (numero_quarto, quant_pessoas, andar) values(? , ?, ?);";
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o numero do quarto:");
			int numero_quarto = Integer.parseInt( scanner.nextLine());
			System.out.println("Informe a quantidade de pessoas:");
			int quant_pessoas = Integer.parseInt( scanner.nextLine());
			System.out.println("Digite o andar:");
			int andar = Integer.parseInt( scanner.nextLine());
			
			
			ps.setInt(1, numero_quarto);
			ps.setInt(2, quant_pessoas);
			ps.setInt(3, andar);
			
			
			System.out.println("Linhas afetadas" +  ps.executeUpdate());
		*/
		}

	}


