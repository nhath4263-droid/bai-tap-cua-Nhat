package baitap;

import java.awt.*;

public class Ball {
    public double x, y;
    public double vx, vy;
    public int radius = 15;
    public Color color;
    public int id;
    public boolean isFalling = false;

    public Ball(int id, double x, double y, Color color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
        this.vx = Math.random() * 4 - 2;
        this.vy = Math.random() * 4 - 2;
    }

    public void move() {
        if (isFalling) return;
        x += vx;
        y += vy;
    }

    public void draw(Graphics2D g) {
        if (isFalling) return;
        g.setColor(color);
        g.fillOval((int)(x - radius), (int)(y - radius), radius*2, radius*2);
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(id), (int)x-4, (int)y+4);
    }
}
