package paintproject.Shaps;

import java.awt.Color;

public abstract class Shape implements IDrawble {

    protected Point point;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

}
