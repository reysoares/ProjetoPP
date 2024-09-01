package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entity.Produto;

public class ProdutoDAO {

	public void adicionarProduto(Produto produto) {
		
		String sql = "INSERT INTO PRODUTOS (NOME, TIPO, PREÇO) VALUES (?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.getConexao().prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getTipo());
			ps.setDouble(3, produto.getPreco());
	
			ps.execute();
			ps.close();

		}catch (SQLException e){
			e.printStackTrace();
			
		}
		
	}
}
