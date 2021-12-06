package Pacote.view;

import Pacote.Daily;
import Pacote.DailyDAO;

import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondView extends JFrame {
    private JPanel secondPanelRoot;
    private JTextField dataText;
    private JTextField afazerText;
    private JCheckBox feito;
    private DailyDAO dailyDAO;


    public SecondView() {
        dailyDAO = new DailyDAO();
        setTitle("Afazeres");
        setSize(350, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        setLocation(600, 250);
        buildLayout();
        enviarBanco();


    }

    private void buildLayout() {

        secondPanelRoot = new JPanel();
        secondPanelRoot.setBackground(Color.white);
        add(secondPanelRoot);


        JLabel label = new JLabel("Adicionar Afazer");
        label.setFont(new Font("Jokerman", Font.BOLD, 30));
        secondPanelRoot.add(label);

        dataText = new JTextField(10);
        afazerText = new JTextField(20);
        feito = new JCheckBox("Tarefa feita");
        feito.setSelected(false);


        JLabel afazerescrita = new JLabel("  A fazeres  ", SwingConstants.CENTER);
        secondPanelRoot.add(afazerescrita);
        secondPanelRoot.add(afazerText);


        JLabel dataescrita = new JLabel("     Data     ", SwingConstants.CENTER);
        secondPanelRoot.add(dataescrita);
        secondPanelRoot.add(dataText);

        secondPanelRoot.add(feito);
    }

    public void adicionarTarefa() {
        Daily daily = new Daily();
        daily.setAfazer(afazerText.getText());
        daily.setData(dataText.getText());
        if (feito.isSelected() == false) {
            daily.setFeito(0);
        } else {
            daily.setFeito(1);
        }
        dailyDAO.add(daily);

    }

    public void enviarBanco() {
        JButton button = new JButton("Adicionar");
        button.setBackground(Color.white);
        secondPanelRoot.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarTarefa();
                dispose();
            }
        });

    }

}