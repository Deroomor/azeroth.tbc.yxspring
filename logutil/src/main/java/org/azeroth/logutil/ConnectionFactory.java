package org.azeroth.logutil;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws Throwable {
        String cnnstr="jdbc:sqlserver://127.0.0.1\\sqlexpress:1433;DatabaseName=hw";
        var cnn= java.sql.DriverManager.getConnection(cnnstr,"sa","123456");
        return cnn;
    }
}
