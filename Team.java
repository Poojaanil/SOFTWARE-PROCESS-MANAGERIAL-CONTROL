package spDB;

import java.sql.*;

public class Team {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spmc", "root", "root");
            try {
                String str = "create table team1 (mname varchar(10) primary key,mdesc varchar(10),developer varchar(10),massign varchar(10),pdesc varchar(10))";
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
