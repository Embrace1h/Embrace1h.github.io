package com.util;

import java.sql.*;
/*
自定义工具类
其中的方法均为静态方法，方法有连接到数据库，关闭资源
可省略很多步骤，避免代码一直重复，提高代码复用性
 */
public class JdbcUtil {
    public static void main(String[] args) {
        try {
            getConnection();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        private static final String CONNECTIONURL = "jdbc:mysql://localhost:3306/system";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "123456";
        //获取数据库连接
        public static Connection getConnection() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                System.out.println("驱动成功！");
                return DriverManager.getConnection(CONNECTIONURL, USERNAME, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        //关闭数据库连接
        public static void close(ResultSet rs, Statement statement, Connection connection){
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
