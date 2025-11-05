package baitap;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Obstacle {
    private int x, y, width, height;
    private Color color;

    public Obstacle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = Color.DARK_GRAY; // mặc định màu chướng ngại
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    // Nếu cần, trả về bounds để kiểm tra va chạm
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
