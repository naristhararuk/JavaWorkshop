/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Student Lab
 */
public class ConnectionBuilder2 {
    private static org.apache.derby.jdbc.ClientDataSource ds = null; 

    public static Connection getConnection() { 
        Connection conn = null; 
        try { 
            if (ds == null) { 
                Properties props = new Properties(); 
                FileInputStream fis = null; 

                fis = new FileInputStream("db.properties"); 
                props.load(fis); 

                ds = new org.apache.derby.jdbc.ClientDataSource(); 

                ds.setServerName(props.getProperty("DERBY_SERVER_NAME")); 
                ds.setPortNumber(Integer.parseInt(props.getProperty("DERBY_SERVER_PORT"))); 
                ds.setDatabaseName(props.getProperty("DERBY_DB_NAME")); 
                ds.setUser(props.getProperty("DERBY_DB_USERNAME")); 
                ds.setPassword(props.getProperty("DERBY_DB_PASSWORD")); 

            } 
            conn = ds.getConnection(); 
        } catch (FileNotFoundException ex) { 
        } catch (SQLException ex) { 
        } catch (IOException ex) { 
        } 
        return conn; 
    }
}
