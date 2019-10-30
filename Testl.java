package spDB;

import java.sql.*;
public class Testl
{

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spmc", "root", "root");
            try {
                String str = "create table testl (tcname varchar(10) ,pagename varchar(10),tcdesc varchar(10))";
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
