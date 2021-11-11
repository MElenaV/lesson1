package ru.gb.meshch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

  private JLabel display;
  private JLabel displayMain;
  private Double leftOperand;
  private Double rightOperand;
  private String operation;


  public static void main(String[] args) {
    new Calculator();
  }

  public Calculator() {
    setTitle("Калькулятор");
    setBounds(150, 150, 500, 700);
    setResizable(false);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    ActionListener numberActionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String text = source.getText();
        String displayMainText = displayMain.getText();
        String displayText = display.getText();

        if (".".equals(text) && displayMainText.contains(".")) {
          return;
        }
        if (".".equals(text) && "0".equals(displayMainText)) {
          displayMainText = "0.";
          displayMain.setText(displayMainText);
          return;
        }
        if ("0".equals(displayMainText) || displayText.contains("=")) {
          displayMainText = "";
          display.setText("");
          }

        if ("+/-".equals(text) && !"0".equals(displayMainText)) {
          text = "-";
          display.setText(text + displayMainText);
          displayMain.setText(text + displayMainText);
          return;
        }

        displayMainText += text;
        displayMain.setText(displayMainText);
      }
    };

    ActionListener actionListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String text = source.getText();
        if ("=".equals(text)) {
          rightOperand = Double.parseDouble(displayMain.getText());
          if (leftOperand != null) {
            switch (operation) {
              case "+":
                display.setText(String.valueOf(leftOperand) + String.valueOf(operation) + String.valueOf(rightOperand) + " = ");
                displayMain.setText(String.valueOf(leftOperand + rightOperand));
                break;
              case "-":
                display.setText(String.valueOf(leftOperand) + String.valueOf(operation) + String.valueOf(rightOperand) + " = " );
                displayMain.setText(String.valueOf(leftOperand - rightOperand));
                break;
              case "*":
                display.setText(String.valueOf(leftOperand) + String.valueOf(operation) + String.valueOf(rightOperand) + " = " );
                displayMain.setText(String.valueOf(leftOperand * rightOperand));
                break;
              case "/":
                display.setText(String.valueOf(leftOperand) + String.valueOf(operation) + String.valueOf(rightOperand) + " = " );
                if (rightOperand != 0) {
                  displayMain.setText(String.valueOf(leftOperand / rightOperand));
                  break;
                }
                display.setText("Деление на ноль невозможно");
                break;
            }
            leftOperand = Double.parseDouble(displayMain.getText());
            rightOperand = null;
            operation = null;
          }
          return;
        }
        leftOperand = Double.parseDouble(displayMain.getText());
        displayMain.setText("0");
        display.setText("0");
        operation = text;
      }
    };

    JPanel numberPanel = new JPanel();
    GridLayout numberLayout = new GridLayout(6, 3, 8, 8);
    numberPanel.setLayout(numberLayout);

    for (int i = 0; i < 10; i++) {
      JButton button = new JButton(String.valueOf(i));
      button.setFont(new Font("Arial", Font.BOLD, 20));
      button.addActionListener(numberActionListener);
      numberPanel.add(button);
    }

    JButton pointButton = new JButton(".");
    JButton plusMinusButton = new JButton("+/-");
    pointButton.setFont(new Font("Arial", Font.BOLD, 20));
    plusMinusButton.setFont(new Font("Arial", Font.BOLD, 20));
    numberPanel.add(pointButton);
    numberPanel.add(plusMinusButton);

    pointButton.addActionListener(numberActionListener);
    plusMinusButton.addActionListener(numberActionListener);

    JPanel buttonPanel = new JPanel();
    GridLayout buttonLayout = new GridLayout(2, 3, 10, 10);
    buttonPanel.setLayout(buttonLayout);

    for (char c : "C+-*/=".toCharArray()) {
      JButton button = new JButton(String.valueOf(c));
      button.addActionListener(actionListener);
      button.setFont(new Font("Arial", Font.BOLD, 20));
      numberPanel.add(button);
    }

    display = new JLabel("0");
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    display.setFont(new Font("Arial", Font.BOLD, 20));

    displayMain = new JLabel("0");
    displayMain.setHorizontalAlignment(SwingConstants.RIGHT);
    displayMain.setFont(new Font("Arial", Font.BOLD, 45));

    JPanel displayPanel = new JPanel();
    GridLayout displayLayout = new GridLayout(2, 0, 10,10);
    displayPanel.setLayout(displayLayout);
    displayPanel.add(display, BorderLayout.NORTH);
    displayPanel.add(displayMain, BorderLayout.SOUTH);
    add(displayPanel, BorderLayout.NORTH);
    add(numberPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);

    setVisible(true);

  }

}
