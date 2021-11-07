package ru.gb.meshch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppLesson8 extends JFrame {

  public AppLesson8()  {
    setTitle("Hello world!");
    setBounds(300, 300, 400, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(null);
    JButton jButton = new JButton("Button 1");
    jButton.setBounds(10, 10, 150, 50);
    JButton jButton2 = new JButton("Button 2");
    jButton2.setBounds(10, 100, 150, 50);

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.out.println("Окно закрывается");
      }
    });


    ActionListener actionListener = new ActionListener() {  // анонимный класс
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        System.out.println("Нажата кнопка " + source.getText());
      }
    };
    jButton.addActionListener(actionListener);
    jButton2.addActionListener(actionListener);
    add(jButton);
    add(jButton2);
    setVisible(true);

  }

  public static void main(String[] args) {
    new App();
  }

}