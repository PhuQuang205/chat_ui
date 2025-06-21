package Components;

import models.MessageType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ComponentRight extends JPanel {

    private JPanel chatArea;
    private JPanel headerPanel, centerPanel;
    private JTextField sendMessage;
    private JLabel userLabel;
    private JPanel footerPanel;
    private JButton sendImage, sendBtn, sendEmoji;

    public ComponentRight() {
        setPreferredSize(new Dimension(600, 800));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        TopRight();
        CenterRight();
        FooterRight();

        add(headerPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
    }

    private void FooterRight() {
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5,11));
        footerPanel.setBackground(Color.WHITE);

        sendEmoji = new JButton();
        sendEmoji.setIcon(new ImageIcon("D:/chat_ui/images/EMOJI.png"));
        sendEmoji.setPreferredSize(new Dimension(48, 48));
        sendEmoji.setBorder(BorderFactory.createEmptyBorder());
        sendEmoji.setContentAreaFilled(false);
        sendEmoji.setFocusPainted(false);
        sendEmoji.setCursor(new Cursor(Cursor.HAND_CURSOR));

        sendImage = new JButton();
        sendImage.setIcon(new ImageIcon("D:/chat_ui/images/SEND_IAMGE.png"));
        sendImage.setPreferredSize(new Dimension(48, 48));
        sendImage.setBorder(BorderFactory.createEmptyBorder());
        sendImage.setContentAreaFilled(false);
        sendImage.setFocusPainted(false);
        sendImage.setCursor(new Cursor(Cursor.HAND_CURSOR));

        sendBtn = new JButton();
        sendBtn.setIcon(new ImageIcon("D:/chat_ui/images/SEND.png"));
        sendBtn.setPreferredSize(new Dimension(48, 48));
        sendBtn.setBorder(BorderFactory.createEmptyBorder());
        sendBtn.setContentAreaFilled(false);
        sendBtn.setFocusPainted(false);
        sendBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        sendMessage = new RoundedTextField(20);
        sendMessage.setPreferredSize(new Dimension(250, 48));

        footerPanel.add(sendEmoji);
        footerPanel.add(sendImage);
        footerPanel.add(sendMessage);
        footerPanel.add(sendBtn);

    }

    private void CenterRight() {
        centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(600, 500));
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setBorder(new EmptyBorder(0, 10, 0, 10));
        centerPanel.setLayout(new BorderLayout());

        JPanel mainChatPanel = new RoundedPanel(20, Color.WHITE, Color.decode("#E9E9E9"), 2);
        mainChatPanel.setBorder(new EmptyBorder(20, 0, 20, 0));


        JPanel avatarAndFeaturePanel = new JPanel(new GridLayout(1,2));
        avatarAndFeaturePanel.setPreferredSize(new Dimension(500, 70));
        avatarAndFeaturePanel.setBackground(Color.WHITE);
        JPanel avatarOtherPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 11));
        avatarOtherPanel.setBackground(Color.WHITE);
        JLabel avatarOtherLabel = new JLabel();
        avatarOtherLabel.setPreferredSize(new Dimension(48, 48));
        avatarOtherLabel.setIcon(new ImageIcon("D:/chat_ui/images/Group 14.png"));
        JLabel userOtherName = new JLabel("Đinh Phú Quang");
        userOtherName.setFont(new Font("Montserrat", Font.PLAIN, 14));

        avatarOtherPanel.add(avatarOtherLabel);
        avatarOtherPanel.add(userOtherName);

        JPanel featurePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5,11));
        featurePanel.setBackground(Color.WHITE);
        JButton callVideoButton = new JButton();
        callVideoButton.setIcon(new ImageIcon("D:/chat_ui/images/CALL_VIDEO.png"));
        callVideoButton.setPreferredSize(new Dimension(48, 48));
        callVideoButton.setBorder(BorderFactory.createEmptyBorder());
        callVideoButton.setContentAreaFilled(false);
        callVideoButton.setFocusPainted(false);
        callVideoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton callPhoneButton = new JButton();
        callPhoneButton.setIcon(new ImageIcon("D:/chat_ui/images/CALL_PHONE.png"));
        callPhoneButton.setPreferredSize(new Dimension(48, 48));
        callPhoneButton.setBorder(BorderFactory.createEmptyBorder());
        callPhoneButton.setContentAreaFilled(false);
        callPhoneButton.setFocusPainted(false);
        callPhoneButton.setCursor(new Cursor(Cursor.HAND_CURSOR));


        featurePanel.add(callVideoButton);
        featurePanel.add(callPhoneButton);

        avatarAndFeaturePanel.add(avatarOtherPanel);
        avatarAndFeaturePanel.add(featurePanel);

        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setPreferredSize(new Dimension(500, 470));

        content.setBackground(Color.WHITE);

        content.add(createMessageBubble("Xin chào!", true, "10:30", MessageType.TEXT));
        content.add(Box.createVerticalStrut(8)); // spacing giữa tin nhắn
        content.add(createMessageBubble("Chào bạn!", false, "10:31", MessageType.TEXT));
        content.add(Box.createVerticalGlue()); // Đẩy tin nhắn lên trên cùng

        JScrollPane scrollPane = new JScrollPane(content);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        mainChatPanel.add(avatarAndFeaturePanel, BorderLayout.NORTH);
        mainChatPanel.add(scrollPane, BorderLayout.CENTER);

        centerPanel.add(mainChatPanel, BorderLayout.CENTER);


    }


    private void TopRight() {
        headerPanel = new JPanel(new BorderLayout());
        headerPanel.setPreferredSize(new Dimension(600, 100));
        headerPanel.setBackground(Color.WHITE);
        headerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel pn2 = new JPanel(new BorderLayout());
        pn2.setBackground(Color.WHITE);


        userLabel = new JLabel("Nguyễn Thị Tâm");
        userLabel.setFont(new Font("Montserrat", Font.BOLD, 14));
        userLabel.setForeground(Color.BLACK);
        userLabel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel avatarLabel = new JLabel();
        avatarLabel.setPreferredSize(new Dimension(40, 40));
        avatarLabel.setIcon(new ImageIcon("D:/chat_ui/images/Group 17.png"));
        avatarLabel.setHorizontalAlignment(SwingConstants.CENTER);

        pn2.add(userLabel, BorderLayout.CENTER);
        pn2.add(avatarLabel, BorderLayout.EAST);

        headerPanel.add(pn2, BorderLayout.EAST);

    }

//    public void addMessage(String message, boolean isSent) {
//        chatArea.add(createMessageBubble(message, isSent));
//        chatArea.revalidate();
//        chatArea.repaint();
//    }

    public JPanel createMessageBubble(String content, boolean isSentByMe, String time, MessageType messageType) {
        JPanel messageWrapper = new JPanel(new FlowLayout(isSentByMe ? FlowLayout.RIGHT : FlowLayout.LEFT, 0, 0));
//        messageWrapper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        messageWrapper.setBackground(Color.WHITE);

        JPanel messagePanel = new RoundedPanel(15, isSentByMe ? Color.BLACK : Color.WHITE, Color.decode("#E9E9E9"), 2);
        messagePanel.setLayout(new BoxLayout(messagePanel, BoxLayout.Y_AXIS));
        messagePanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        messagePanel.setMaximumSize(new Dimension(300, Integer.MAX_VALUE));

        JLabel messageLabel = new JLabel(content);
        messageLabel.setForeground(isSentByMe ?  Color.WHITE  : Color.BLACK);
        messageLabel.setFont(new Font("Montserrat", Font.BOLD, 14));

        JLabel timeLabel = new JLabel(time);
        timeLabel.setForeground(isSentByMe ?  Color.WHITE  : Color.BLACK);
        timeLabel.setFont(new Font("Montserrat", Font.BOLD, 10));
        timeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        messagePanel.add(messageLabel);
        messagePanel.add(Box.createRigidArea(new Dimension(0, 3)));
        messagePanel.add(timeLabel);

        messageWrapper.add(messagePanel);
        return messageWrapper;
    }


}
