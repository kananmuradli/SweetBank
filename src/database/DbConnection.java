package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME = "sweetbank?useTimezone=true&serverTimezone=UTC";
    private final String USER = "root";
    private final String PASSWORD = "root";

    
    protected Connection connection = null;
    protected Statement statement = null;

    public DbConnection() {
        String url = "jdbc:mysql:" + this.HOST + ":" + this.PORT + "/" + this.DATABASE_NAME;
        System.out.println(url);
        
        String url1="jdbc:mysql:localhost:3306/sweetbank?useTimezone=true&serverTimezone=UTC";
        System.out.println(url1);
        try {
            Class.forName("com.mysqlcj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.connection = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("ok");
        } catch (SQLException ex) {
            System.out.println("is not ok");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
