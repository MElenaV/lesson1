package ru.gb.meshch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

  private int value = 0;

  public static void main(String[] args) {
    new Counter();
  }

  public Counter() {
    setTitle("Hello world!");
    setBounds(300, 300, 300, 100);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Font font = new Font("Arial", Font.BOLD, 32);
    JLabel counterValueView = new JLabel(String.valueOf(value));
    counterValueView.setFont(font);
    counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
    add(counterValueView, BorderLayout.CENTER);

    JButton decrementButton = new JButton("-");
    JButton incrementButton = new JButton("+");
    decrementButton.setFont(font);
    incrementButton.setFont(font);

    add(decrementButton, BorderLayout.WEST);
    add(incrementButton, BorderLayout.EAST);

    ActionListener actionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if ("+".equals(source.getText())) {
          value++;
        } else {
          value--;
        }
        counterValueView.setText(String.valueOf(value));
      }
    };
    decrementButton.addActionListener(actionListener);
    incrementButton.addActionListener(actionListener);

    setVisible(true);

  }
}
