import java.sql.*;
import java.util.Scanner;

public class More_Operations_in_JDBC {

    static final String DB_URL = "jdbc:mysql://localhost:3306/emp";
    static final String DB_user = "root";
    static final String DB_pass = "Adi123";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose option: 1-Insert 2-Update 3-Delete 4-Select");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                insertInDB(sc);
                break;
            case 2:
                updateInDB(sc);
                break;
            case 3:
                deleteInDB(sc);
                break;
            case 4:
                selectInDB(sc);
                break;
        
            default:
                System.out.println("Invalid Input Bitch.");
                break;
        }
        sc.close();
    }

    static void insertInDB(Scanner sc){
        System.out.println("Enter Product id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter product Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Product Price: ");
        double price = sc.nextDouble();

        String sql = "INSERT INTO products (id, name, price) VALUES (?, ?, ?)";

        try(
            Connection con = DriverManager.getConnection(DB_URL, DB_user, DB_pass);

            PreparedStatement pst = con.prepareStatement(sql)) {

                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setDouble(3, price);

                int rows = pst.executeUpdate();
                System.out.println(rows + " rows(s) inserted.");
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        static void updateInDB(Scanner sc){
            System.out.println("Enter Product id to update: ");
            int id = sc.nextInt();
            System.out.println("Enter new Price");
            double price = sc.nextDouble();

            String sql = "UPDATE products SET price=? WHERE id=?";

            try(Connection con = DriverManager.getConnection(DB_URL, DB_user, DB_pass);
            
            PreparedStatement pst = con.prepareStatement(sql)){
                pst.setDouble(1, price);
                pst.setInt(2, id);

                int rows = pst.executeUpdate();
                System.out.println(rows + "Row(s) Updated.");
            } catch (SQLException e){
                e.printStackTrace();
            }

        }
        static void deleteInDB(Scanner sc){
            System.out.println("Enter product id to delete: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM products WHERE id=?";

            try(Connection con = DriverManager.getConnection(DB_URL, DB_user, DB_pass);
        PreparedStatement pst = con.prepareStatement(sql)){
            pst.setInt(1, id);
            int rows = pst.executeUpdate();
            System.out.println(rows + "Row(s) deleted.");
        } catch(SQLException e) {
            e.printStackTrace();
        }
        }
        static void selectInDB(Scanner sc){
            System.out.println("Enter product id to view: ");
            int id = sc.nextInt();

            String sql = "SELECT name, price FROM products WHERE id=?";

            try (Connection con = DriverManager.getConnection(DB_URL, DB_user, DB_pass); 
            PreparedStatement pst = con.prepareStatement(sql)){
                
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();

                if(rs.next()){
                    String name = rs.getString("name");
                    double price = rs.getDouble("price");
                    System.out.println("Product: " + name + ", Price: " + price);
                } else {
                    System.out.println("No product found with id" + id);
                }

            } catch (SQLException e){
                e.printStackTrace();
            }
        }


}
