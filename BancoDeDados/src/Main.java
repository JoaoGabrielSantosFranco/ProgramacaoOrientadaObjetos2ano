import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

    public static void main(String[] args) {
        Adicionar();
    }


    public static void Adicionar() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db");
            Statement stat = conn.createStatement();

            String sql = "insert into teste(descricao) values('Olá banco de dados')";

            stat.execute(sql);

            stat.close();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Atualizar() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db");
            Statement stat = conn.createStatement();

            String sql = "UPDATE teste SET descricao = ('Ola') where descricao = 'Olá banco de dados'";

            stat.execute(sql);

            stat.close();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        public static void Deletar() {
            try {
                Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db");
                Statement stat = conn.createStatement();

                String sql = "DELETE FROM teste WHERE descricao = 'Ola' ;";

                stat.execute(sql);

                stat.close();

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
}