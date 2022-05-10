package main;

import java.sql.*;

/*
        TEMA: Creati pe baza codului din laboratorul 10 operatii de tip CRUD (Create, Read, Update, Delete) pentru tabela de produse
        Hint: Pentru read = select o sa aveti nevoie de un ResultSet si RowMapper
 */
public class Example2JdbcConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/laboatorpao2022";
        String username = "root";
        String password = ""; //ori e goala ori este tot root

        //try (resursa) {} catch(Exception  e); pentru a folosi try with resources, avem nevoie de o resursa
        // resursa = trebuie sa implementeze interfata AutoCloseable
        // nu mai este nevoie sa inchidem resursa in cazul lui try with resources

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

//            creazaProdusFolosindStatement(connection, "mouse", 20.0);
            creazaProdusFolosindPreparedStatement(connection, "casti", 7.0);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static void creazaProdusFolosindStatement(Connection connection, String nume, Double pret) throws SQLException {

        String query = "insert into produse values(null," + "'" + nume + "'," + pret + ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }

    private static void creazaProdusFolosindPreparedStatement(Connection connection, String nume, Double pret) throws SQLException {

        String query = "insert into produse values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1, 10);
        preparedStatement.setString(2,nume);
        preparedStatement.setDouble(3, pret);

        preparedStatement.executeUpdate();

    }
}
