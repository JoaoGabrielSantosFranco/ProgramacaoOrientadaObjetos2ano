package Pacote.view;

import java.sql.*;

public class Banco {



    public static void Adicionar(String x,String y) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ListBox.db")) {
            String sql = "insert into To_Do_List(Info,Date) values(?,?)";
            try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                prepstat.setString(1, x);
                prepstat.setString(2, y);
                System.out.println("Printando INFO = " +x);
                System.out.println("printando Data = " +y);

                prepstat.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void Select() {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ListBox.db")) {
            String sql = "select info,Date from To_do_List";
            try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                ResultSet resultSet = prepstat.executeQuery();
                while (resultSet.next()) {
                    System.out.println("____________");
                    String info = resultSet.getString(1);
                    String date = resultSet.getString(2);
                    System.out.println("info = " + info);
                    System.out.println("Date = " + date);
                }
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
