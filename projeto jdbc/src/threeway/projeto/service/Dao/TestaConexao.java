package threeway.projeto.service.Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		
		Connection con;
		
		try {
			
			con = FabricaConexao.getConexao();
			
			if(con!=null) {
				System.out.println("Conex�o Estabelecida!");
				
				con.close();
			}
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
