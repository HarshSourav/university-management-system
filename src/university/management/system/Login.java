package university.management.system;


import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Login Page");

        JLabel label = new JLabel("Login Screen Loaded Successfully!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        add(label);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
