package app.repositorio;
import app.entidade.Pessoa;

import java.util.ArrayList;
import java.util.List;

public interface PessoaDAO{


    public default int adicionar(Pessoa p) {
        return 0;
    }
    public default void atualizar(Pessoa p) {
    }

    public default void deletarPeloID(int id) {
    }

    public default Pessoa obterPeloID(int id) {
        return null;
    }

    public default List<Pessoa> obterTodos() {
        System.out.println("pessoadao");
        ArrayList<Pessoa> lista = new ArrayList<>();
        return lista;
    }

}
///fazer as manipulçõexs aquii
