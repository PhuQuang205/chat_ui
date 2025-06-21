package Views;

import Components.RoundedButton;
import Components.RoundedPasswordField;
import Components.RoundedTextField;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RegisterUI extends JFrame {

    public RegisterUI() {
        setTitle("Đăng ký");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.insets = new Insets(4, 0, 4, 0);
        gbc.gridwidth = 1;

        JLabel usernameLabel = new JLabel("Tên người dùng");
        usernameLabel.setFont(new Font("Montserrat", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPanel.add(usernameLabel, gbc);

        JTextField usernameField = new RoundedTextField(20);
        usernameField.setPreferredSize(new Dimension(200, 40));
        usernameField.setFont(new Font("Montserrat", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        contentPanel.add(usernameField, gbc);

        JLabel phoneLabel = new JLabel("Số điện thoại");
        phoneLabel.setFont(new Font("Montserrat", Font.PLAIN, 13));
        gbc.gridx = 0;
        gbc.gridy = 3;
        contentPanel.add(phoneLabel, gbc);

        JTextField phoneField = new RoundedTextField(20);
        phoneField.setPreferredSize(new Dimension(200, 40));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        contentPanel.add(phoneField, gbc);

        JLabel passwordLabel = new JLabel("Mật khẩu");
        passwordLabel.setFont(new Font("Montserrat", Font.PLAIN, 13));
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        contentPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new RoundedPasswordField(20);
        passwordField.setPreferredSize(new Dimension(200, 40));
        passwordField.setFont(new Font("Montserrat", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        contentPanel.add(passwordField, gbc);

        JLabel confirmPasswordLabel = new JLabel("Nhập lại mật khẩu");
        confirmPasswordLabel.setFont(new Font("Montserrat", Font.PLAIN, 13));
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        contentPanel.add(confirmPasswordLabel, gbc);

        JPasswordField confirmPasswordField = new RoundedPasswordField(20);
        confirmPasswordField.setPreferredSize(new Dimension(200, 40));
        confirmPasswordField.setFont(new Font("Montserrat", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        contentPanel.add(confirmPasswordField, gbc);

        JPanel buttonsPanel = new JPanel(new BorderLayout());
        buttonsPanel.setBackground(Color.WHITE);

        JButton cancelButton = new RoundedButton("Hủy");
        JButton registerButton = new RoundedButton("Đăng ký");

        buttonsPanel.add(cancelButton, BorderLayout.WEST);
        buttonsPanel.add(registerButton, BorderLayout.EAST);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(8, 0, 0, 0);
        contentPanel.add(buttonsPanel, gbc);

        mainPanel.add(contentPanel, BorderLayout.CENTER);
        add(mainPanel);

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegisterUI::new);
    }
}
