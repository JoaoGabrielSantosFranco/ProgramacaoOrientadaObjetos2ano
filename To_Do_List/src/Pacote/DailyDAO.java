package Pacote;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class DailyDAO {


    public void add(Daily daily) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ListBox.db")) {
            String sql = "insert into To_Do_List(Info,Date,CheckBox) values(?,?,?)";
            try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                prepstat.setString(1, daily.getAfazer());
                prepstat.setString(2, daily.getData());
                prepstat.setInt(3, daily.getFeito());

                System.out.println("Afazer "+daily.getAfazer());
                System.out.println("Data "+ daily.getData());
                System.out.println("FEITO " +daily.getFeito());
                System.out.println("________________________");

                prepstat.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static ArrayList Select() {

        Daily daily = new Daily();
        ArrayList<Daily> lista = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ListBox.db")) {
            String sql = "Select Info,Date,Pk from To_do_list  ";
            try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                ResultSet resultSet = prepstat.executeQuery();
                while (resultSet.next()) {
                    System.out.println("____________");
                    String Info = resultSet.getString(1);
                    String Data = resultSet.getString(2);
                    String Pk = resultSet.getString(3);

                    daily.setData(Data);
                    daily.setAfazer(Info);
                    lista.add(daily);

                    System.out.println("daily"+daily);
                    System.out.println("Data = " + Data);
                    System.out.println("Info = " + Info);
                    System.out.println("Pk "+Pk);
                }
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;


    }
}
