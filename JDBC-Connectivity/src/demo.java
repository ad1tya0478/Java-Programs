import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id:");
        int id = sc.nextInt();
        
        String sql = "select name from products where id=" + id;

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/emp", "root", 
                "Adi123");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String name = rs.getString(1);
            System.out.println(name);
            con.close();
           

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
