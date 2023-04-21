package kr.ac.jejunu.user;

import java.sql.*;

public class DeleteStatementStrategy implements StatementStrategy {

    private Long id;

    public DeleteStatementStrategy(Long id) {
        this.id = id;
    }

    @Override
    public PreparedStatement makeStatement(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement
                ("delete from userinfo where id = ?");
        preparedStatement.setLong(1,  id);
        return preparedStatement;
    }
}