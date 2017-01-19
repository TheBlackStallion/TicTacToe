import java.awt.*;
public class BlackStallion {
   public static final int RECTS = 66;

public static void main (String[] args) {

DrawingPanel panel = new DrawingPanel(7000, 7000);
panel.setBackground(Color.MAGENTA);
    Graphics g = panel.getGraphics();

    for (int i = 0; i < RECTS; i++) {
        int shift = i * 665 / RECTS;
        g.setColor(new Color(shift, shift, shift));


        g.fillRect(shift, shift, 70, 20);
        g.setColor(Color.RED);
        g.fillOval(150, 100, 200, 250);
        g.setColor(Color.RED);
        g.fillRect(200, 300, 100, 550);
 g.setColor(Color.BLACK);
    g.fillOval(280,150, 20, 20);
    g.setColor(Color.BLACK);
    g.fillOval(200,150, 20, 20);
        panel.sleep(500);
        g.setColor(Color.RED);
        g.fillRect(238, 070, 20, 200);
        g.setColor(Color.RED);
        int[] xPoints = {243,238,248};
        int[] yPoints = {45,55,55};
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(Color.RED);
        int[] xDog = {253, 248, 258};
        int[] yDog = {45, 55, 55};
        g.fillPolygon(xDog, yDog, 3);



        g.setColor(Color.BLACK);
        g.fillRect( 200, 350, 100, 50);
        g.fillRect( 200, 500, 100, 50);
        g.fillRect( 200, 650, 100, 50);


     g.setFont( new Font ( "Serif", Font.ITALIC, 45));
      g.drawString("THE WINKING SNAKE!", 400, 500);
        g.fillRect( 234 , 234 , 384 , 3492);




    }
}
}