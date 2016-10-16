/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEAM_5_PENGELOLA_NILAI_AKADEMIK;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Irhamfauzan
 */
public class koneksi {
    private String dbUser="root", dbPass=null;
    private java.sql.Connection connection;
    private java.sql.Statement statement;
    private java.sql.ResultSet resultset;
    
    private void Connect () throws SQLException{
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/",dbUser,null);
        statement= connection.createStatement();
    }
    
    private ResultSet query(String query) throws SQLException{
        return statement.executeQuery(query);
    }
    
    public static void main(String[] args) throws SQLException {
        koneksi k= new koneksi();
        k.Connect();
    }
}
