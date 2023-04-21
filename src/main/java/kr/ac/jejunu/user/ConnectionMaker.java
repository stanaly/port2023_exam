package kr.ac.jejunu.user;

import java.sql.*;

public interface ConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException ;
}