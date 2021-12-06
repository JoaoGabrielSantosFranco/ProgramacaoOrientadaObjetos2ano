package Pacote.view;

public class NavegationView {

    public static void openApp(){
        HomeView view = new HomeView();
        view.setVisible(true);
    }

    public static void openSecond(){
        SecondView view = new SecondView();
        view.setVisible(true);
    }
}
