import javax.swing.*;
import java.awt.*;

public class Garden extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("House and Tree");
        Canvas canvas = new Garden();
        canvas.setSize(600, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.drawLine(25,175,125, 75);
        g.drawLine(125, 75, 225, 175);
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawLine(150, 75, 150, 100);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);

        g.drawArc(275, 50, 150, 200, -80,340);
        g.drawLine(337, 250, 337, 300);
        g.drawLine(363, 250, 363, 300);
    }
}
