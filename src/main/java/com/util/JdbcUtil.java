package com.util;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <p>操作数据源</p>
 * Created by wangkecheng on 2018/8/16.
 */
@Slf4j
public class JdbcUtil {

    //172.31.40.25
    //47.104.192.49
    public static Connection getConnect() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://172.31.40.25:3306/mock?useUnicode=true&characterEncoding=UTF-8&useSSL=false";//综测环境
        String username = "root";
        String password = "XSW@cde3";

        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage(),e);
        } catch (SQLException e) {
            log.error(e.getMessage(), e);
        }
        return conn;
    }

    public static String getValue(String sql) {
        Connection conn = getConnect();
        PreparedStatement pstmt;
        try {
            log.info("请求sql，sql:{}",sql);
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String body_one = rs.getString("body_one");
                String body_two = rs.getString("body_two");
                String body_three = rs.getString("body_three");
                log.info("你查询的数据为,msg:{}",body_one+body_two+body_three);
                return body_one+body_two+body_three;
            }

        } catch (SQLException e) {
            log.error(e.getMessage(),e);
        }
        return null;
    }

    public static void main(String[] args) {
        String twoMonthAgo = LocalDate.now().minusMonths(2L)
                .format(DateTimeFormatter.BASIC_ISO_DATE);
        String today = LocalDate.now()
                .format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(twoMonthAgo);
        System.out.println(today);
    }
}
