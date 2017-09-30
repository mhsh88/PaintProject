package paintproject.Shaps;

import java.awt.Graphics;

public class Line extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(point.getX1(), point.getY1(), point.getX2(), point.getY2());
    }

}
