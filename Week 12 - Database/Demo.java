import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
      //write single record in to DB
 Employee E1 = new Employee(1, "Dave", "Husk", 200000);

      String query = " INSERT INTO employee (id, fname, lname, salary) " + "Values (?,?,?,?)";

        try (Connection con = DatabaseConnection.getcon();
             PreparedStatement statement = con.prepareStatement(query)) {
            statement.setInt(1,E1.getID());
            statement.setString(2,E1.getFirstName());
            statement.setString(3,E1.getLastName());
            statement.setDouble(4,E1.getSalary());
            int updateRow = statement.executeUpdate();
            System.out.println(updateRow);
        } catch (SQLException e) {
            e.printStackTrace();
        }


}
}


