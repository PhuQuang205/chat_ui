package Views;

import Components.RoundedButton;
import Components.RoundedPasswordField;
import Components.RoundedTextField;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginUI extends JFrame {

    public LoginUI() {
        setTitle("Đăng nhập");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(8, 0, 0, 0);


        JLabel titleLabel = new JLabel("<html><b>Nhập user name và password để<br>đăng nhập</b></html>");
        titleLabel.setFont(new Font("Montserrat", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 20, 0);
        contentPanel.add(titleLabel, gbc);

        gbc.insets = new Insets(4, 0, 4, 0);
        gbc.gridwidth = 1;

        JLabel usernameLabel = new JLabel("Tên người dùng");
        usernameLabel.setFont(new Font("Montserrat", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        contentPanel.add(usernameLabel, gbc);

        JTextField usernameField = new RoundedTextField(20);
        usernameField.setPreferredSize(new Dimension(200, 40));
        usernameField.setFont(new Font("Montserrat", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        contentPanel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Mật khẩu");
        passwordLabel.setFont(new Font("Montserrat", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        contentPanel.add(passwordLabel, gbc);


        JPasswordField passwordField = new RoundedPasswordField(20);
        passwordField.setPreferredSize(new Dimension(200, 40));
        passwordField.setFont(new Font("Montserrat", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        contentPanel.add(passwordField, gbc);


        JPanel buttonsPanel = new JPanel(new BorderLayout());
        buttonsPanel.setBackground(Color.WHITE);

        JButton loginButton = new RoundedButton("Đăng nhập");
        loginButton.setFont(new Font("Montserrat", Font.BOLD, 13));
        loginButton.setPreferredSize(new Dimension(150, 44));
        loginButton.addActionListener(e -> {
            System.out.println("loginButton");
        });
        JButton createAccountButton = new RoundedButton("Tạo tài khoản");
        createAccountButton.setFont(new Font("Montserrat", Font.BOLD, 13));
        createAccountButton.setPreferredSize(new Dimension(150, 44));

        buttonsPanel.add(loginButton, BorderLayout.WEST);
        buttonsPanel.add(createAccountButton, BorderLayout.EAST);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 0, 0, 0);
        contentPanel.add(buttonsPanel, gbc);

        mainPanel.add(contentPanel, BorderLayout.CENTER);
        add(mainPanel);

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginUI::new);
    }
}
