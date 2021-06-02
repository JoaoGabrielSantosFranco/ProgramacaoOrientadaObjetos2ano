package pacote;

public class principal {
    public static void main(String[] args) {
        Tempo Inicial = new Tempo(12, 0, 0 ,0);
        Tempo Variavel = new Tempo(6, 20, 0,0);
        Tempo Sub = Inicial.subtrair(Variavel);
        Tempo soma = Inicial.somar(Variavel);
        Tempo real = Inicial.inicialreal(Inicial) ;


        System.out.print("horario inicial :  " );
        real.imprimir();
        System.out.print("horario informado :  ");
        Variavel.imprimir();
        System.out.print("horario inicial menos horario informado :  ");
        Sub.imprimir();
        System.out.print("horario inicial mais horario informado :  " );
        soma.imprimir();



    }
}
