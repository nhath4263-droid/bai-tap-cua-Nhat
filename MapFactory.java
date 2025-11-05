package baitap;

import java.awt.*;

public class MapFactory {
    public static Map createMap(int id, int w, int h) {
        Map m;
        switch(id) {
            case 1: m = new Map(w,h,new Color(0,90,70)); break;
            case 2: m = new Map(w,h,new Color(50,50,120)); break;
            case 3: m = new Map(w,h,new Color(120,40,0)); break;
            default: m = new Map(w,h,Color.GRAY);
        }
        m.holeX = w/2;
        m.holeY = h/2;
        return m;
    }
}
