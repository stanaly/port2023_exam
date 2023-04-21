package kr.ac.jejunu.user;

import java.sql.*;
public class JejuUserDao extends UserDao {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection
                ("jdbc:mysql://localhost/jeju", "jeju", "jejupw");
    }
}