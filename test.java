package spDB;

import java.sql.*;

public class test {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spmc", "root", "root");
            try {
                String str = "create table tester (pname varchar(10) ,bcat varchar(10),bdug varchar(10),bexd varchar(10),bacd varchar(10),bend varchar(10))";
                PreparedStatement ps = con.prepareStatement(str);
                ps.executeUpdate(str);
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
