package com.company;
import java.sql.*;

public class database_demo {
    public static void main(String[] args) throws Exception {
        String url = "";
        String uname = "";
        String pass = "";
        String query = "Select username from student where userid = 3";

        Class.forName("com.mysql.jdbc.Driver"); //class forname
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("username");

     }
}
