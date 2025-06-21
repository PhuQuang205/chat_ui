package Components;

import models.ChatItem;

import javax.swing.*;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.time.LocalDateTime;

public class ComponentLeft extends Panel {
    private JPanel searchPanel;

    public ComponentLeft() {
       TopLeft();
        JPanel leftMain = new JPanel();
        leftMain.setLayout(new BorderLayout());

        JLabel pnTitle = new JLabel("Chat List");
        pnTitle.setForeground(Color.BLACK);
        pnTitle.setFont(new Font("Montserrat", Font.BOLD, 20));
        pnTitle.setOpaque(true);
        pnTitle.setBackground(Color.WHITE);
        pnTitle.setBorder(BorderFactory.createEmptyBorder(0,20,0,10));

        DefaultListModel<ChatItem> chatListModel = new DefaultListModel<>();
        ChatItem item1 = new ChatItem(1L, 101L, "Đinh Phú Quang", "Last message....", LocalDateTime.now().minusMinutes(5));
        item1.setAvatar("D:/chat_ui/images/Group 14.png");
        chatListModel.addElement(item1);

        ChatItem item2 = new ChatItem(2L, 102L, "Nguyễn Văn A", "Hello bạn", LocalDateTime.now().minusMinutes(10));
        item2.setAvatar("D:/chat_ui/images/Group 14.png");
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);
        chatListModel.addElement(item2);

        JList<ChatItem> chatList = new JList<>(chatListModel);
        chatList.setCellRenderer((ListCellRenderer<? super ChatItem>) new ChatCellRenderer());
        chatList.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JScrollPane chatScrollPane = new JScrollPane(chatList);
        chatScrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        chatScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        chatScrollPane.setBorder(BorderFactory.createEmptyBorder());

        JPanel pnBottom = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 16));
        pnBottom.setPreferredSize(new Dimension(400, 80));
        pnBottom.setBackground(Color.WHITE);

        JButton addButton = new JButton();
        addButton.setIcon(new ImageIcon("D:/chat_ui/images/ADD_FRIEND.png"));
        addButton.setPreferredSize(new Dimension(48, 48));
        addButton.setBorder(BorderFactory.createEmptyBorder());
        addButton.setContentAreaFilled(false);
        addButton.setFocusPainted(false);
        addButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pnBottom.add(addButton);

        leftMain.add(pnTitle, BorderLayout.NORTH);
        leftMain.add(chatScrollPane, BorderLayout.CENTER);
        leftMain.add(pnBottom, BorderLayout.SOUTH);

        add(searchPanel, BorderLayout.NORTH);
        add(leftMain, BorderLayout.CENTER);

        setVisible(true);
    }

    private void TopLeft() {
        setPreferredSize(new Dimension(400, 800));
        setLayout(new BorderLayout());

        searchPanel = new JPanel(new GridBagLayout());
        searchPanel.setPreferredSize(new Dimension(400, 100));
        searchPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;

        JPanel pn1 = new JPanel(new BorderLayout());
        pn1.setBackground(Color.WHITE);

        JTextField searchField = new RoundedTextField(20);
        searchField.setPreferredSize(new Dimension(250, 40));

        JButton searchButton = new JButton();
        searchButton.setIcon(new ImageIcon("D:/chat_ui/images/SEARCH.png"));
        searchButton.setPreferredSize(new Dimension(48, 48));
        searchButton.setBorder(BorderFactory.createEmptyBorder());
        searchButton.setContentAreaFilled(false);
        searchButton.setFocusPainted(false);
        searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        pn1.setBorder(new EmptyBorder(0,0,0,0));
        pn1.add(searchField, BorderLayout.CENTER);
        pn1.add(searchButton, BorderLayout.EAST);
        searchPanel.add(pn1, gbc);
    }
}
