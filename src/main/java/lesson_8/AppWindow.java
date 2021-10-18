package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow extends JFrame {
    private int randomNumber;
    private JTextField textField;

    public AppWindow(){

        setRandomNumber();

        setTitle("Guess the number");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10.");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JButton resetButton = new JButton("Рестарт игры");
        add(resetButton, BorderLayout.SOUTH);
        resetButton.setFont(font);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 10));
        add(buttonPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGames();
            }
        });

        setVisible(true);
    }

            // Метод проверки совпадений загаданного и введённого игроком...
    public void tryToAnswer(int answer){
        if(answer == randomNumber){
            textField.setText("Вы победили! Ответ: " + randomNumber);
        } else if(answer > randomNumber){
            textField.setText("Не угадали! Загаданное число меньше.");
        } else {
            textField.setText("Не угадали! Загаданное число больше.");
        }
    }

            // Метод рестарта игры.
    public void restartGames(){
        textField.setText("Игра началась");
        setRandomNumber();
    }

            // Метод рандом...
    public void setRandomNumber(){
        randomNumber = (int)(Math.random() * 10) + 1;
    }
}
