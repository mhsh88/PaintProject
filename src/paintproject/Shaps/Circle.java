/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintproject.Shaps;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author karim
 */
public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        int x = Math.abs(point.getX1()-point.getX2()); 
        int y = Math.abs(point.getY1()-point.getY2()); 
        g.setColor(color);
        
         g.fillOval(getX(), getY(), x, y);
    }

    public int getX() {
        return Math.min(point.getX1(), point.getX2());
    }

    public int getY() {
        return Math.min(point.getY1(), point.getY2());
    }

}
