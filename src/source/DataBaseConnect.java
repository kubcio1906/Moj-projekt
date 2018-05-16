package source;

import java.sql.*;

public class DataBaseConnect {


        static Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        public static void connect() {
            // This will load the MySQL driver, each DB has its own driver
            try {
                Class.forName("com.mysql.jdbc.Driver");
                DataBaseConnect.connect = DriverManager
                        .getConnection("jdbc:mysql://localhost/magazyn?"
                                + "user=root&password=");
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        }

        static public void insertPu(String name, int dimension, int reservation) {
            try {
                String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
                PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, dimension);
                preparedStatement.setInt(3, reservation);

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    static public void insertNbr(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       static public void insertFpm(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static public void insertPom(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static public void insertPa(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static public void insertPtfe(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static public void insertPtfeTb(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static public void insertPtfeCr(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static public void insertPtfeGl(String name, int dimension, int reservation) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, dimensions, reservation) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, dimension);
            preparedStatement.setInt(3, reservation);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}


