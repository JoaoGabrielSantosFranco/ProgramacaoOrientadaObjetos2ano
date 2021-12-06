package Pacote.view;

import Pacote.Daily;
import Pacote.DailyDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class HomeView extends JFrame {
    private JPanel panelRoot;


    public HomeView() {

        setTitle("Home");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildLayout();
        setLocation(600, 150);


    }

    private void buildLayout() {
        panelRoot = new JPanel();
        panelRoot.setBackground(Color.WHITE);
        add(panelRoot);

        JLabel label = new JLabel("Afazeres");
        label.setFont(new Font("Jokerman", Font.BOLD, 35));
        label.setForeground(Color.RED);


        panelRoot.add(label);
        panelRoot.add(new JSeparator());


        JButton button = new JButton("Adicionar afazer");
        button.setBackground(Color.white);
        button.setFont(new Font("Jokerman", Font.ITALIC, 25));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NavegationView.openSecond();
                DailyDAO.Select();
            }
        });
        panelRoot.add(button);




        for(int i = 0 ; i < 1; i++){
            ArrayList itens [] = {DailyDAO.Select()};
            JList<ArrayList> list = new JList<ArrayList>(itens);

            list.setSelectedIndices(new int[]{1,1});

            panelRoot.add(list);
        }

    }

}



