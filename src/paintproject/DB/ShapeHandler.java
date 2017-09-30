package paintproject.DB;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import paintproject.Shaps.Circle;
import paintproject.Shaps.Line;
import paintproject.Shaps.Point;
import paintproject.Shaps.Rectangle;
import paintproject.Shaps.Shape;
import paintproject.Shaps.ShapeLists;

public class ShapeHandler {

    public static void addShape(ShapeLists shapetype, Point point, Color color, int userid) {

        String query = "insert into shapes (shape_type , x1,x2,y1,y2,color,user_id) values('" + shapetype.toString() + "'," + point.getX1() + ","
                + point.getX2() + "," + point.getY1() + "," + point.getY2() + ",'" + getColorName(color) + "'," + userid + ");";
        Connector.updateQuery(query);

    }

    private static String getColorName(Color color) {
        String colorname = "black";
        if (color.equals(Color.RED)) {
            colorname = "red";
        }
        if (color.equals(Color.GREEN)) {
            colorname = "green";
        }
        if (color.equals(Color.BLUE)) {
            colorname = "blue";
        }
        return colorname;
    }

    public static ArrayList<Shape> getShapefromDB(int id) {
        ArrayList<Shape> lists = new ArrayList<>();
        try {

            String query = "select * from shapes where user_id=" + id;

            ResultSet rs = Connector.getFromDB(query);
            while (rs.next()) {
                String shapeType = rs.getString("shape_type");
                int x1 = rs.getInt("x1");
                int x2 = rs.getInt("x2");
                int y1 = rs.getInt("y1");
                int y2 = rs.getInt("y2");
                System.out.println(shapeType);
                Point p = new Point(x1, y1, x2, y2);
                String color = rs.getString("color");
                Shape shape = getShapeType(shapeType);
                shape.setColor(getColor(color));
                shape.setPoint(p);
                lists.add(shape);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ShapeHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
    }

    private static Shape getShapeType(String type) {
        switch (type) {

            case ("Rectangle"): {
                return new Rectangle();
            }
            case ("Circle"): {
                return new Circle();
            }
            default: {
                return new Line();
            }

        }
    }

    private static Color getColor(String color) {
        switch (color) {
            case ("red"): {
                return Color.RED;
            }
            case ("green"): {
                return Color.GREEN;
            }
            case ("blue"): {
                return Color.BLUE;
            }

            default: {
                return Color.BLACK;
            }
        }

    }
}
