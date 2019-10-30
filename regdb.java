package spDB;

import java.sql.*;

public class regdb{

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spmc", "root", "root");
            try {
                String str = "create table admin1 (ename varchar(10),empuser  varchar(10),empp varchar(10),dob varchar(10),gender varchar(10),work varchar(10),sal varchar(10),addr varchar(10),tel varchar(10),mob varchar(10),email varchar(10)primary key,noy varchar(10),desc2 varchar(10))";
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
