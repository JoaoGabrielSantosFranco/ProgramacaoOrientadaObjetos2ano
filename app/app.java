package app;
import app.entidade.Pessoa;
import app.repositorio.Repositorio;

public class app{

    public static void main(String[] Args) {
        app APP = new app();
        APP.executar();
    }

    public void executar() {
        Repositorio Executar = Repositorio.obterInstancia();
        Executar.pessoas();

        Pessoa oi = new Pessoa();
        Pessoa oi2 = new Pessoa();

        oi.setSobrenome("Franco");
        oi.setNome("João");
        oi.setID(1);

        oi2.setSobrenome("Ferreira");
        oi2.setNome("Gabriel");
        oi2.setID(2);


        Executar.pessoas().adicionar(oi);
        Executar.pessoas().adicionar(oi2);

        System.out.println("OBTER PELO ID : "+Executar.pessoas().obterPeloID(2));

        System.out.println("OBTER TODOS : "+Executar.pessoas().obterTodos());


    }
    }

