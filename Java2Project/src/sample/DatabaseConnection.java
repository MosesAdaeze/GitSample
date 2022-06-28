package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaselink;

    public Connection getconnection() {
        String databaseName = "demo_db";
        String databaseUser = "demo";
        String databasePassword = "putyourpasswordhere";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink = DriverManager.getConnection(url, databaseUser, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return databaselink;
    }
}
