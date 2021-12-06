package Pacote;
import java.sql.Connection;
import java.sql.DriverManager;


public class FabicaDeConexoes {

    private static FabicaDeConexoes instance;
    private FabicaDeConexoes(){}

    public static FabicaDeConexoes getInstance(){
        if(instance == null){
            instance = new FabicaDeConexoes();
        }
        return instance;
    }

    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:ListBox.db");
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }return connection;
    }
}
