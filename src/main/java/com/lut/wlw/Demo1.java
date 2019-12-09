package com.lut.wlw;

import java.sql.*;

/**
 * @Classname Demo1
 * @Description TODO
 * @Author mwj
 * @Version V1.0.0
 * @Date 2019/12/5 15:04
 */
public class Demo1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/demo?useSSL=false&serverTimezone=GMT%2B8","root","root");
        PreparedStatement pstm = conn.prepareStatement("select  * from account");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        rs.close();
        pstm.close();
        conn.close();
    }
}
