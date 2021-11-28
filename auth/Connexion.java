/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zeine
 */ 
public class Connexion {
    String urlpilote="com.mysql.jdbc.Driver";
    String urlbase="jdbc:mysql://localhost:3306/scolarite?zeroDateTimeBehavior=convertToNull";
    Connection conn;
    
    public Connexion(){
        try{
            Class.forName(urlpilote);
        } 
        catch (ClassNotFoundException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            conn=DriverManager.getConnection(urlbase,"root","");
        }
        catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);    
        }
    }
    
    public Connection getConnection(){
        return conn;
    }

    Object obtenirconnexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PreparedStatement prepareStatement(String insert_into_note_idet_idmat_nte_values_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
