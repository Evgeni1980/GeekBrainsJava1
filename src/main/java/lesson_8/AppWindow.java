package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow extends JFrame {
    private int randomNumber;
    private JTextField textField;

    public AppWindow(){
        randomNumber = (int)(Math.random() * 10) + 1;

        setTitle("Guess the number"); // Название окна.
        setBounds(600, 300, 600, 140); //Отступ от края и размер окна.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Закрытие окна.
        setResizable(false); //Запрет на изменение размера окна.

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10.");
        textField.setEditable(false); // Запрет на ручной ввод текста
        textField.setHorizontalAlignment(SwingConstants.CENTER); // Центрирование текста.

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

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

        setVisible(true);
    }

    public void tryToAnswer(int answer){
        if(answer == randomNumber){
            textField.setText("Вы победили! Ответ: " + randomNumber);
        } else if(answer > randomNumber){
            textField.setText("Не угадали! Загаданное число меньше.");
        } else {
            textField.setText("Не угадали! Загаданное число больше.");
        }
    }
}
