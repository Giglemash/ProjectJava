package Lesson_6.Server;

import java.sql.SQLException;
import java.sql.*;
import Lesson_6.Client.Controller;
import Lesson_6.Client.Main;

public class StartServer {
    public static void main(String[] args) throws SQLException {
        new MainServer();
    }
}
