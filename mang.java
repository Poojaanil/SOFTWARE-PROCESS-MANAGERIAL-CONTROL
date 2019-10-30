package regdb;

import java.sql.*;

public class mang {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SPMC", "root", "root");
            try {
                String str;
                str = "create table proj (PROJECTNAME varchar(10) ,PROJECTCLIENTNAME  varchar(10),PRODESC varchar(10),PROMAN varchar(10),PROASSIGN varchar(10),PROEND varchar(10),TEAM varchar(10))";
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
