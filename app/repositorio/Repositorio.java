package app.repositorio;

import app.entidade.Pessoa;


public class Repositorio {

    private static Repositorio instancia ;
    private static  PessoaDAOImpl PessoaDAO;
    private Repositorio() {
    }
    public synchronized static Repositorio obterInstancia() {
        if (instancia == null)
            instancia = new Repositorio();
        return instancia;
    }
    public static PessoaDAO pessoas() {
        PessoaDAO = new PessoaDAOImpl();
        return PessoaDAO;
    }
}