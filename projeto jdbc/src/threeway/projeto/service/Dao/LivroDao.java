package threeway.projeto.service.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import threeway.projeto.service.modelo.Livro;

public class LivroDao {
	
	private static final String CONSULTAR_SQL = "SELECT * FROM LIVRO WHERE TITULO LIKE ?";
	private static final String CONSULTAR_SQL_POR_ID = "SELECT * FROM LIVRO WHERE COD_LIVRO = ?";
	private static final String DELETA_SQL = "DELETE FROM LIVRO WHERE COD_LIVRO = ?";
	private static final String UPDATE_SQL = "UPDATE LIVRO SET TITULO = ? WHERE COD_LIVRO = ?";
	private static final String INSERT = "INSERT INTO LIVRO(AUTOR, IMAGEM, PRECO, TITULO, DESCRICAO) VALUES (?, ?, ?, ?, ?)";
	
	
	public void inserir(Livro livro) {
		
		try (
				Connection conexao = FabricaConexao.getConexao(); 
				PreparedStatement inserir = conexao.prepareStatement(INSERT); ){
			
			inserir.setString(1, livro.getAutor());
			inserir.setString(2, livro.getImagem());
			inserir.setDouble(3, livro.getPreco());
			inserir.setString(4, livro.getTitulo());
			inserir.setString(5, livro.getDescricao());
			
			inserir.execute();
			System.out.println("Livro inserido");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Livro> consultar (String titulo){
		
		ArrayList<Livro> lista = new ArrayList<Livro>();
		
		try(
				Connection conexao = FabricaConexao.getConexao(); 
				PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL); ) {
			
			consulta.setString(1, "%" + titulo.toUpperCase() + "%");
			
			ResultSet resultado = consulta.executeQuery();
			
			while(resultado.next()) {
				Livro livro = new Livro();
				livro.setAutor(resultado.getString("AUTOR"));
				livro.setCodigo(resultado.getInt("COD_LIVRO"));
				livro.setImagem(resultado.getString("IMAGEM"));
				livro.setPreco(resultado.getDouble("PRECO"));
				livro.setTitulo(resultado.getString("TITULO"));
				livro.setDescricao(resultado.getString("DESCRICAO"));
				lista.add(livro);
			}
			
			resultado.close();			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public Livro consultaPorCodigo(int codigo) {
		Livro livro = new Livro();
		try (Connection conexao = FabricaConexao.getConexao(); 
				PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL_POR_ID); ){
					
				consulta.setInt(1, codigo);	
				ResultSet resultado = consulta.executeQuery();
				if(resultado.next()) {
					livro.setAutor(resultado.getString("AUTOR"));
					livro.setCodigo(resultado.getInt("COD_LIVRO"));
					livro.setImagem(resultado.getString("IMAGEM"));
					livro.setPreco(resultado.getDouble("PRECO"));
					livro.setTitulo(resultado.getString("TITULO"));
					livro.setDescricao(resultado.getString("DESCRICAO"));
				}
				resultado.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return livro;
	}
	
	public void update(Livro livro) {
		try (Connection conexao = FabricaConexao.getConexao(); 
				PreparedStatement update = conexao.prepareStatement(UPDATE_SQL); ){
			
			update.setString(1, livro.getTitulo());
			update.setInt(2, livro.getCodigo());
			
			update.execute();
			System.out.println("Titulo do livro alterado");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleta(int codigo) {
		try (Connection conexao = FabricaConexao.getConexao(); 
				PreparedStatement deleta = conexao.prepareStatement(DELETA_SQL); ){
			deleta.setInt(1, codigo);
			deleta.execute();
			System.out.println("Item deletado!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
