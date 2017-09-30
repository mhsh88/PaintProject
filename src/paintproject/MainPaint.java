package paintproject;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import paintproject.DB.ShapeHandler;
import paintproject.Shaps.Circle;
import paintproject.Shaps.Line;
import paintproject.Shaps.Point;
import paintproject.Shaps.Rectangle;
import paintproject.Shaps.Shape;
import paintproject.Shaps.ShapeLists;

public class MainPaint extends javax.swing.JFrame {

    private int x1 = 0, y1 = 0;
    private int x2 = 0, y2 = 0;
    ShapeLists currentShape;
    Shape shape;
    ArrayList<Shape> shapes;
    public int id;
    Graphics graphis;

    private void groupButton() {
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(radioBlack);
        bg1.add(radioRed);
        bg1.add(radioGreen);
        bg1.add(radioBlue);

    }

    public Color getColor() {
        if (radioBlack.isSelected()) {
            return Color.BLACK;
        }
        if (radioRed.isSelected()) {
            return Color.RED;
        }
        if (radioGreen.isSelected()) {
            return Color.GREEN;
        }
        if (radioBlue.isSelected()) {
            return Color.BLUE;
        }
        return null;
    }

    public MainPaint(int id) {
        this.id = id;
        initComponents();
        groupButton();
        currentShape = ShapeLists.Line;
        this.shapes = ShapeHandler.getShapefromDB(id);
        this.graphis = panelPaint.getGraphics();

        printShapes(this.graphis);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPaint = new javax.swing.JPanel();
        btnLine = new javax.swing.JButton();
        btnRectengle = new javax.swing.JButton();
        btnCircle = new javax.swing.JButton();
        radioBlack = new javax.swing.JRadioButton();
        radioRed = new javax.swing.JRadioButton();
        radioGreen = new javax.swing.JRadioButton();
        radioBlue = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPaint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelPaintMouseDragged(evt);
            }
        });
        panelPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelPaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelPaintMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPaintMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPaintLayout = new javax.swing.GroupLayout(panelPaint);
        panelPaint.setLayout(panelPaintLayout);
        panelPaintLayout.setHorizontalGroup(
            panelPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );
        panelPaintLayout.setVerticalGroup(
            panelPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        btnLine.setText("خط");
        btnLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });

        btnRectengle.setText("مستطیل");
        btnRectengle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectengleActionPerformed(evt);
            }
        });

        btnCircle.setText("دایره");
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        radioBlack.setSelected(true);
        radioBlack.setText("مشکی");
        radioBlack.setRolloverEnabled(true);
        radioBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBlackActionPerformed(evt);
            }
        });

        radioRed.setText("قرمز");
        radioRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRedActionPerformed(evt);
            }
        });

        radioGreen.setText("سبز");
        radioGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGreenActionPerformed(evt);
            }
        });

        radioBlue.setText("آبی");
        radioBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBlueActionPerformed(evt);
            }
        });

        jLabel1.setText("انتخاب رنگ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRectengle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(radioBlack)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioRed)
                            .addComponent(radioGreen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBlue, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel1)
                    .addComponent(btnCircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCircle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRectengle)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBlack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioRed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioGreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBlue))
                    .addComponent(panelPaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineActionPerformed
        currentShape = ShapeLists.Line;

    }//GEN-LAST:event_btnLineActionPerformed

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        currentShape = ShapeLists.Circle;

    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnRectengleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectengleActionPerformed
        currentShape = ShapeLists.Rectangle;    }//GEN-LAST:event_btnRectengleActionPerformed

    private void radioBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBlackActionPerformed

    private void radioRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioRedActionPerformed

    private void radioGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioGreenActionPerformed

    private void radioBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBlueActionPerformed

    private void panelPaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPaintMouseClicked

    }//GEN-LAST:event_panelPaintMouseClicked

    private void panelPaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPaintMousePressed
        switch (currentShape) {
            case Line: {
                shape = new Line();
                break;
            }
            case Circle: {
                shape = new Circle();
                break;
            }
            case Rectangle: {
                shape = new Rectangle();
                break;
            }
        }
        shape.setColor(getColor());
        this.x1 = evt.getX();
        this.y1 = evt.getY();
    }//GEN-LAST:event_panelPaintMousePressed

    private void panelPaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPaintMouseReleased

        x2 = evt.getX();
        y2 = evt.getY();
        this.shapes.add(shape);
        Point point = new Point(x1, y1, x2, y2);
        ShapeHandler.addShape(currentShape, point, getColor(), id);

        shape.setPoint(point);

        printShapes(this.graphis);

    }//GEN-LAST:event_panelPaintMouseReleased

    private void printShapes(Graphics g) {
        for (Shape sh : shapes) {
            sh.draw(g);
        }
    }


    private void panelPaintMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPaintMouseDragged
        
        this.graphis.clearRect(0, 0, 10000, 10000);
        printShapes(this.graphis);
        x2 = evt.getX();
        y2 = evt.getY();

        Point point = new Point(x1, y1, x2, y2);
        shape.setPoint(point);
        shape.draw(this.graphis);


    }//GEN-LAST:event_panelPaintMouseDragged

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPaint().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnLine;
    private javax.swing.JButton btnRectengle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelPaint;
    private javax.swing.JRadioButton radioBlack;
    private javax.swing.JRadioButton radioBlue;
    private javax.swing.JRadioButton radioGreen;
    private javax.swing.JRadioButton radioRed;
    // End of variables declaration//GEN-END:variables
}
