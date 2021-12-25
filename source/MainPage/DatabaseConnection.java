/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPage;

import java.sql.*;

/**
 *
 * @author asus
 */
public class DatabaseConnection {

    private Connection conn = null;
    private static String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;" + "databaseName=QLDonHang";
    private static String USERNAME = "sa";
    private static String PASSWORD = "dong*0909768334";

    public DatabaseConnection() {
        //initializeConnection();
    }

//    private void initializeConnection() {
//        try {
//            // connnect to database 'testdb'
//            this.conn = getConnection(DB_URL, USERNAME, PASSWORD);
//
//            if (conn != null) {
//                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//                System.out.println("Driver name: " + dm.getDriverName());
//                System.out.println("Driver version: " + dm.getDriverVersion());
//                System.out.println("Product name: " + dm.getDatabaseProductName());
//                System.out.println("Product version: " + dm.getDatabaseProductVersion());
//            }
//
//        } catch (Exception ex) {
//        }
//    }
    
    public Connection getAdminConnection(){
        return getConnection(DB_URL, USERNAME, PASSWORD);
    }
    
    public Connection getConnectionStatus(Connection conn) {
        return conn;
    }

    public Connection getDbConnection(String userName, String password) {
        return getConnection(DB_URL, userName, password);
    }

    public void closeConnection(Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    private Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            System.out.println("java.class.path=" + System.getProperty("java.class.path"));
            Class.forName(SQL_DRIVER);
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
    }
}
