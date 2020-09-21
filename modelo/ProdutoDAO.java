package modelo;

import java.sql.PreparedStatement;

/**
 *
 * @author guest
 */
public class ProdutoDAO extends DataBaseDAO{

        public void inserir (Produto p) throws Exception{
        String sql = "INSERT INTO produto (codigo,nome,descricao,valor) VALUES(?,?,?,?)";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, p.getCodigo());
        pstm.setString(2, p.getNome());
        pstm.setString(3, p.getDescricao());
        pstm.setFloat(4, p.getValor());     
        pstm.execute();
        this.desconectar();
    }
    
    
    
    
}
