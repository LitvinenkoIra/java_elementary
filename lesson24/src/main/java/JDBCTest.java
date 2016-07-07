import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {

    public static void main(String[] args) throws SQLException, IOException {

        JDBCTest jdbcTest = new JDBCTest();
        Properties properties = jdbcTest.loadProperties();

        Connection connection = DriverManager
                .getConnection(properties.getProperty("url"),
                        properties.getProperty("username"),
                        properties.getProperty("password"));

        System.out.println("connection established");

        //jdbcTest.addStudent(connection);
        //jdbcTest.printStudents(connection);

        jdbcTest.batchingExample(connection);
    }

    private Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        InputStream stream = getClass().getResourceAsStream("db.properties");
        properties.load(stream);
        return properties;
    }

    public void printStudents(Connection connection) throws SQLException {
        String sql = "select * from students";

        Statement statement = connection.createStatement();
        statement.execute(sql);

        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            String str = "";
            str += resultSet.getString("id") + ", ";
            str += resultSet.getString("lastname") + ", ";
            str += resultSet.getString("firstname") + ", ";
            str += resultSet.getString("age") + ", ";
            System.out.println(str);
        }
    }

    public void addStudent(Connection connection) throws SQLException {
        String sql = "insert into students(lastname, firstname, age) values(?, ?, ?)";


        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Smith");
        preparedStatement.setString(2, "John");
        preparedStatement.setInt(3, 45);

        preparedStatement.execute();
    }

    public void trasactionExample(Connection connection) throws SQLException {
        String sql1 = "insert into students(lastname, firstname, age) values('Ivanov', 'Ivan', 35)";
        String sql2 = "insert into students(lastname, firstname, age) values('Doe', 'John', 36)";

        connection.setAutoCommit(false);

        Statement statement = connection.createStatement();

        try {
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public void batchingExample(Connection connection) throws SQLException {
        String sql = "insert into students(lastname, firstname, age) values(?, ?, ?)";

        connection.setAutoCommit(false);

        PreparedStatement statement = connection.prepareStatement(sql);

        for (int i = 0; i < 9; i++) {
            statement.setString(1, "Lastname " + i);
            statement.setString(2, "Firstname " + i);
            statement.setInt(3, 25 + i);
            statement.addBatch();
        }

        statement.executeBatch();

        connection.setAutoCommit(true);
    }
}
