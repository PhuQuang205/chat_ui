package Views;

import Components.ComponentLeft;
import Components.ComponentRight;

import javax.swing.*;
import java.awt.*;

public class ChatUI extends JFrame {

    public ChatUI() {
        super("Chat Main");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Components();
        setResizable(false);
        setVisible(true);
    }

    private void Components() {
        ComponentLeft componentLeft = new ComponentLeft();
        ComponentRight componentRight = new ComponentRight();
        add(componentLeft, BorderLayout.WEST);
        add(componentRight, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatUI::new);
    }
}
