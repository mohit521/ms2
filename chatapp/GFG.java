
// importing the my sql package
import java.sql.*;

public class GFG {

    public static void main(String[] args) {
        // Database name
        String databaseName = "lpa_1";

        // Database URL
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        // Database credentials
        String userName = "root";
        String password = "mohit@007M@#$";

        Connection con = null;
        Statement st = null;
        ResultSet res = null;
        String query = "";

        try {

            // Register the jdbc driver
            Class.forName("com.mysql.jdbc.Driver");

            // open a connection to database
            con = DriverManager.getConnection(url, userName,
                    password);

            // set auto commit false
            con.setAutoCommit(false);

            // creating statement
            st = con.createStatement();

            // first let us try to understand , how DB works
            // without commit statement
            query = "INSERT INTO Student values ( 11 , 'Ram' , 'banglore' )";

            // executing query 1 -> adding the above
            // information into the table
            st.executeUpdate(query);
            System.out.println(
                    "Inserted row 1 FIRST TIME in the table....");

            query = "INSERT INTO Student values ( 22 , 'Shyam' , 'Chennai' )";
            st.executeUpdate(query);
            System.out.println(
                    "Inserted row 2 FIRST TIME in the table....");

            // lets , print what we have updated in the table
            query = "Select * from Student ; ";
            res = st.executeQuery(query);

            System.out.println(
                    "printing data (without Rollback && without Commit )....");

            while (res.next())
                System.out.print(res.getString("name")
                        + " ");
            System.out.println();

            // lets try to rollback (undo the things ,till now we did)
            // see what difference it will make in the Database
            con.rollback();

            // lets checkout our DB again
            query = "Select * from Student";
            res = st.executeQuery(query);

            System.out.println(
                    "printing data (with Rollback && without Commit )....");
            boolean empty = true;

            while (res.next()) {
                empty = false;
                System.out.print(res.getString("name")
                        + " ");
            }
            if (empty) {
                System.out.println("Empty table\n\n");
            }

            // Since we haven't committed our transaction ,
            // when we did rollback, everything is gone
            // Now lets ,try with the Commit Statement from
            // beginning
            query = "INSERT INTO Student values ( 11 , 'Ram' , 'banglore' )";
            st.executeUpdate(query);
            System.out.println(
                    "Inserted row 1 SECOND TIME in the table....");

            query = "INSERT INTO Student values ( 22 , 'Shyam' , 'Chennai' )";
            st.executeUpdate(query);
            System.out.println(
                    "Inserted row 2 SECOND TIME in the table....");

            // now we have committed our transaction
            con.commit();
            System.out.println(
                    "committed the transaction successfully....");

            // lets rollback and like previous lets check
            // what will be left in our database
            con.rollback();
            System.out.println("Done Rollback....");

            query = "Select * from lpa_1";
            res = st.executeQuery(query);

            System.out.println(
                    "printing data ( with Commit and then Rollback)....");

            while (res.next())
                System.out.print(res.getString("name")
                        + " ");

            System.out.println("\n");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Error");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            // Clean-up environment
            if (con != null)
                con.close();
            if (st != null)
                con.close();
            if (res != null)
                res.close();
        } catch (Exception e) {

            // Handle errors for JDBC
            System.out.println(e.getMessage());
        } finally {

            System.out.println("Thank you .........");
        }
    }
}
