package jdbc_pstmt;
import java.sql.*;
/**
 *
 * @author Nabeel Ahmed Siddiqi - https://github.com/nabeelsiddiquidev97
 */
public class Jdbc_pstmt {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees_detail?useSSL=false", "root", "_________");
            PreparedStatement pstmt = conn.prepareStatement("Select * from Employee");
            ResultSet rs = pstmt.executeQuery();
            System.out.println("***Employee table after update***");
            while (rs.next()) { // Move the cursor to the next row
                System.out.println(rs.getInt("emp_id") + ", " +
                    rs.getString("emp_name"));
            }
            conn.close();
        } catch (Exception e) {}
    }
}