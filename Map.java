package baitap;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Map {
    public int width, height;
    public int holeX, holeY, holeR = 20;
    public Color backgroundColor;
    public List<Obstacle> obstacles = new ArrayList<>();

    public Map(int w, int h, Color bg) {
        width = w;
        height = h;
        backgroundColor = bg;
    }

    public void draw(Graphics2D g) {
        // nền
        g.setColor(backgroundColor);
        g.fillRect(0, 0, width, height);
        // lỗ
        g.setColor(Color.BLACK);
        g.fillOval(holeX - holeR, holeY - holeR, holeR*2, holeR*2);
        // chướng ngại
        for (Obstacle o : obstacles) {
            o.draw(g);
        }
    }
}
