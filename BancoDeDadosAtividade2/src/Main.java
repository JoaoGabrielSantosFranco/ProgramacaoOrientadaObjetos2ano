import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Select();
    }
        public static void Adicionar () {
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db")) {
                String sql = "insert into Pessoas(nome, sobrenome, cidade) values(?,?,?)";
                try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                    prepstat.setString(1, "kiko");
                    prepstat.setString(2, "a");
                    prepstat.setString(3, "curitiba");

                    prepstat.execute();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        public static void Atualizar () {
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db")) {
                String sql = "update Pessoas set nome = ?, sobrenome = ?, cidade = ? where id_pessoas = ? ";
                try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                    prepstat.setString(1, "Joao");
                    prepstat.setString(2, "Franco");
                    prepstat.setString(3, "Guaratuba");
                    prepstat.setInt(4, 1);
                    prepstat.execute();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    public static void Delete () {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db")) {
            String sql = "Delete from Pessoas where id_pessoas = ?  ";
            try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                prepstat.setInt(1, 1);

                prepstat.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void Select () {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:meu_banco.db")) {
            String sql = "Select id_pessoas, nome, sobrenome, cidade from Pessoas  ";
            try (PreparedStatement prepstat = conn.prepareStatement(sql)) {

                ///prepstat.setInt(1, 1);
                ResultSet resultSet = prepstat.executeQuery();
                while (resultSet.next()){
                    System.out.println("____________");
                    int idPessoa = resultSet.getInt(1);
                    String nome = resultSet.getString(2);
                    String sobrenome = resultSet.getString(3);
                    String cidade = resultSet.getString(4);
                    System.out.println("idPessoa = "+ idPessoa);
                    System.out.println("nome = "+ nome);
                    System.out.println("sobrenome = "+ sobrenome);
                    System.out.println("cidade = "+ cidade);
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

