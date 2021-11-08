import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame();

        frame.setTitle("Tela De Login");

        frame.setSize(300,300);
        frame.setLocation(600,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ///Escrita Login
        JLabel label = new JLabel("Login");
        label.setFont(new Font("Serif", Font.ITALIC, 18));

        ///borda e cor de fundo
        JPanel bordaComTitulo = new JPanel();
        bordaComTitulo.setBackground(Color.white);
        bordaComTitulo.setPreferredSize(new Dimension(280,500));
        bordaComTitulo.setBorder(BorderFactory.createLineBorder(Color.blue,5));

        ///texto de Email
        JTextField text = new JTextField(25);
        text.setToolTipText("Digite Seu Email De Login");
        text.setText("Email");

        text.setEnabled(true);


        ///texto de senha
        JPasswordField text5 = new JPasswordField(25);
        text5.setText("sou uma senha");
        text5.setToolTipText("Senha");
        text5.setEchoChar('*');

        ///botão de login
        JButton button = new JButton();
        button.setText("Entrar");
        button.setBorder(BorderFactory.createLineBorder(Color.blue,1));


        bordaComTitulo.add(label);
        bordaComTitulo.add(text);
        bordaComTitulo.add(text5);
        bordaComTitulo.add(button);
        frame.add(bordaComTitulo);
        frame.setVisible(true);


    }
}
