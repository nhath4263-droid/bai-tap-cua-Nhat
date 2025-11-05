package baitap;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Bài toán Bi-a");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            BallPanel panel = new BallPanel();

            JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,5));

            JButton btnStart = new JButton("Bắt đầu");
            JButton btnMap1 = new JButton("Map 1");
            JButton btnMap2 = new JButton("Map 2");
            JButton btnMap3 = new JButton("Map 3");

            JTextField txtNumBalls = new JTextField("8",5);
            JButton btnCreateBalls = new JButton("Tạo bóng");

            JTextField txtPredict = new JTextField(5);
            JButton btnPredict = new JButton("Dự đoán");

            controlPanel.add(btnStart);
            controlPanel.add(new JLabel("Số bóng (1-200):"));
            controlPanel.add(txtNumBalls);
            controlPanel.add(btnCreateBalls);
            controlPanel.add(btnMap1);
            controlPanel.add(btnMap2);
            controlPanel.add(btnMap3);
            controlPanel.add(new JLabel("Dự đoán bóng ID:"));
            controlPanel.add(txtPredict);
            controlPanel.add(btnPredict);

            btnStart.addActionListener(e -> panel.createBalls(8));

            btnCreateBalls.addActionListener(e -> {
                try {
                    int n = Integer.parseInt(txtNumBalls.getText().trim());
                    if (n < 1 || n > 200) {
                        JOptionPane.showMessageDialog(frame, "Vui lòng nhập số bóng từ 1 đến 200");
                    } else {
                        panel.createBalls(n);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!");
                }
            });

            btnMap1.addActionListener(e -> panel.setMap(1));
            btnMap2.addActionListener(e -> panel.setMap(2));
            btnMap3.addActionListener(e -> panel.setMap(3));

            btnPredict.addActionListener(e -> {
                try {
                    int id = Integer.parseInt(txtPredict.getText().trim());
                    panel.setPredictID(id);
                    JOptionPane.showMessageDialog(frame, "Đã dự đoán bóng ID " + id);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!");
                }
            });

            frame.add(controlPanel, BorderLayout.NORTH);
            frame.add(panel, BorderLayout.CENTER);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
