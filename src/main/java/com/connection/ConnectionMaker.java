package com.connection;

import com.sun.jdi.connect.spi.Connection;

import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws SQLException, SQLException;
}
