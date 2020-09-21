/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author guest
 */
public class DataBaseDAO {
    
     Connection conn;
    
    public void conectar() throws Exception{
        String url="jdbc:mysql://localhost/prova";//aqui alterar
        String user="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
    }    
    public void desconectar() throws Exception{
        if(!conn.isClosed()){
            conn.close();
        }
    }
    
}
