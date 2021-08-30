package app.repositorio;

import app.entidade.Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PessoaDAOImpl implements PessoaDAO {
    private Map<Integer, Pessoa> dados = new HashMap<>();
    private int identificador = 0;

    @Override
    public int adicionar(Pessoa p) {
        dados.put(p.getID(), p);
        System.out.println(p + "     -ADICIONADO- "  );
        return identificador;
    }

    @Override
    public void atualizar(Pessoa p) {
    }

    @Override
    public void deletarPeloID(int id) {
        dados.remove(id);
        System.out.println("deletado pelo id :"+dados.remove(id)); ////ou id
    }

    @Override
    public Pessoa obterPeloID(int id) {
        Pessoa i = dados.get(id);
        return i;
    }

    @Override
    public List<Pessoa> obterTodos() {
        ArrayList<Pessoa> lista = new ArrayList<>(dados.values());
        return lista;
    }

}

