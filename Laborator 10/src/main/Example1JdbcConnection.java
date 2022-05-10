package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    JDBC = Java Database Connectivity

    JDBC defineste:
                    Driver object care ne ajuta sa obtinem o conexiunee la baza de date (modul prin care comunicam cu baza de date)
                    Connection
                    Statement obiectul cu ajutorul caruia putem defini query-uri
                    ResultSet obiectul cu ajutorul caruia iau un rezultat dintr-un select

    Vom folosi mysql driver = connector care ne ofera implementari pentru toate interfetele de mai sus


Ce trebuie instalat:
1. Mysql Workbench : https://dev.mysql.com/downloads/workbench/
2. In cazul in care nu va merge conexiunea o sa fie nevoie de xampp https://www.apachefriends.org/ro/index.html
3. O sa avem nevoie de driver: https://dev.mysql.com/downloads/connector/j/
        se alege platform independent si se descarca varianta zip si se dezarhiveaza


*******In cazul in care versiunea de workbench si porneste si serverul de mysql, o sa fie nevoie sa il porniti folosind xampp



********Nu  se foloseste in practica in felul acesta

Pentru a pune jar-ul de connector in intellij:
        1. File
        2. Project Structure -> Modules -> Dependencies -> Se apasa pe + Apoi pe Jar or Directories si se importa folderul rezultat in urma dezarhivarii zip-ului de mai devreme. Scope-ul trebuie sa fie de compile

 */
public class Example1JdbcConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/laboatorpao2022";
                    //protocolul = jdbc
                    //numele vendorului
                    //urlul nostru pentru schema din workbench

        String username = "root";
        String password = ""; //ori e goala ori este tot root

        try {
            //Statement ma constrange foarte tare si trebuie sa fiu foarte atent cum scriu query-ul
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "insert into produse values(null, 'tastatura', 50)";
            statement.executeUpdate(query);


            //se inchid in ordine inversa deschiderii
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
