package app;
import app.entidade.Pessoa;
import app.repositorio.PessoaDAO;
import app.repositorio.Repositorio;

public class app{


    public static void main(String[] Args) {
        app APP = new app();
        APP.executar();
    }

    public void executar() {
        PessoaDAO eu = Repositorio.pessoas();
        Pessoa oi = new Pessoa();
        Pessoa oi2 = new Pessoa();
        Pessoa oi3 = new Pessoa();
        oi.setSobrenome("Franco");
        oi.setNome("João");

        oi2.setSobrenome("Ferreira");
        oi2.setNome("Gabriel");
        eu.adicionar(oi);
        eu.adicionar(oi2);

        System.out.println("OBTER PELO ID : "+eu.obterPeloID(1));
        System.out.println("OBTER TODOS : "+     eu.obterTodos());

        oi3.setSobrenome("ATUALIZADO");
        oi3.setNome("ATUALIZADO");
        oi3.setID(1);
        eu.atualizar(oi3);
        System.out.println("OBTER TODOS : "+     eu.obterTodos());


    }
    }

