package com.diworksdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    // JDBCドライバーの名前
    private static String driverName = "com.mysql.jdbc.Driver";
    // データベース接続URL
    private static String url = "jdbc:mysql://localhost/testdb";
    // データベース接続ユーザー名
    private static String user = "root";
    // データベース接続パスワード
    private static String password = "";

    // データベース接続を取得するメソッド
    public Connection getConnection() {
        Connection con = null;
        try {
            // JDBCドライバーをロード
            Class.forName(driverName);
            // データベース接続を確立
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
