package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.ConnectionFactory;

public class ClienteDAO {
	
	public void create() {
		
		Connection con = ConnectionFactory.getConection();
		PreparedStatement stmt = null;
		
		try {
			
			stmt = con.prepareStatement("");
			
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}

}
