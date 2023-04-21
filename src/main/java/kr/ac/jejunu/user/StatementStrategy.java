package kr.ac.jejunu.user;

import java.sql.*;

public interface StatementStrategy {

    PreparedStatement makeStatement(Connection connection) throws SQLException;
}
