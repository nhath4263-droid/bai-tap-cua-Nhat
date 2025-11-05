package baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class BallPanel extends JPanel implements ActionListener {
    private List<Ball> balls = new ArrayList<>();
    private Map currentMap = MapFactory.createMap(1, 800, 600);
    private Timer timer;
    private int predictID = -1;

    public BallPanel() {
        setPreferredSize(new Dimension(currentMap.width, currentMap.height));
        timer = new Timer(10, this);
        timer.start();
    }

    public void createBalls(int n) {
        balls.clear();
        for (int i = 0; i < n; i++) {
            balls.add(new Ball(i+1, Math.random()*(currentMap.width-30)+15,
                    Math.random()*(currentMap.height-30)+15,
                    new Color((float)Math.random(), (float)Math.random(), (float)Math.random())));
        }
        repaint();
    }

    public void setMap(int id) {
        currentMap = MapFactory.createMap(id, 800, 600);
        repaint();
    }

    public void setPredictID(int id) {
        this.predictID = id;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        currentMap.draw(g2);
        for (Ball b : balls) {
            b.draw(g2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Ball b : balls) {
            b.move();
            // va chạm biên
            if (b.x - b.radius < 0 || b.x + b.radius > currentMap.width) b.vx *= -1;
            if (b.y - b.radius < 0 || b.y + b.radius > currentMap.height) b.vy *= -1;

            // kiểm tra lỗ
            double dist = Math.hypot(b.x - currentMap.holeX, b.y - currentMap.holeY);
            if (!b.isFalling && dist < currentMap.holeR) {
                b.isFalling = true;
                if (predictID == b.id) {
                    JOptionPane.showMessageDialog(this, "Chính xác! Bóng ID " + b.id + " đã rơi.");
                    predictID = -1;
                }
            }
        }
        repaint();
    }
}
