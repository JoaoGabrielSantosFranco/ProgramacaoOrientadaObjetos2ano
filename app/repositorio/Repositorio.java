package app.repositorio;

import app.entidade.Pessoa;


public class Repositorio {

    private static Repositorio instancia = null;

    private Repositorio() {
    }
    public synchronized static Repositorio obterInstancia() {
        if (instancia == null)
            instancia = new Repositorio();
        return instancia;
    }
    public PessoaDAO pessoas() {
        PessoaDAO eu = new PessoaDAOImpl();
        return eu;
    }

}