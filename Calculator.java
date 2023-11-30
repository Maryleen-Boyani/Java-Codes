import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
    JFrame jframe;
    JTextField num1, num2;
    JLabel answer;
    JButton add;

    Calculator() {
        JFrame jframe = new JFrame();
        ImageIcon logo = new ImageIcon("/C:\\Users\\Pc\\Desktop\\Java Codes\\Default.jpg");
        jframe.setIconImage(logo.getImage());
        jframe.setTitle("My Calculator");
        jframe.setSize(400, 400);

        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);// ctrl + space bar will give you options

        jframe.setLayout(null);

        num1 = new JTextField();
        num1.setBounds(50, 100, 300, 50);
        jframe.add(num1);

        num2 = new JTextField();
        num2.setBounds(50, 200, 300, 50);
        jframe.add(num2);

        answer = new JLabel();
        answer.setBounds(50, 250, 100, 50);

        add = new JButton();
        add.setBounds(150, 300, 100, 50);
        add.setText("Sum");

        add.addActionListener(this);

        jframe.add(add);

        answer.setText("Answer here");
        jframe.add(answer);

        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            if (num1.getText().length() < 1) {
                System.out.println("Inout");
            } else {
                try {
                    int a = Integer.parseInt(num1.getText());
                    int b = Integer.parseInt(num2.getText());
                    int sum = a + b;
                    answer.setText("Sum: " + sum);
                } catch (NumberFormatException err) {
                    System.out.println("Please use number format");
                } catch (NullPointerException err) {
                    System.out.println("Supply a value");
                } catch (Exception exception) {
                    System.out.println("Error occurred");
                } finally {
                    System.out.println("We captured all errors");
                }
            }

        }
    }
}
