package pack;

public class principal {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mausebluetooth mousebluetooth = new mausebluetooth();
        MauseGamer mousegamer = new MauseGamer();

        System.out.println("Mouse");
        mouse.Botoes();
        mouse.Leitor();
        mouse.entrada();

        System.out.println("");
        System.out.println("MouseBluetooth");
        mousebluetooth.Botoes();
        mousebluetooth.Leitor();
        mousebluetooth.entrada();

        System.out.println("");
        System.out.println("MouseGamer");
        mousegamer.Leitor();
        mousegamer.Botoes();
        mousegamer.entrada();
        mousegamer.sist();

    }
}