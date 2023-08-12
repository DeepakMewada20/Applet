import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouseApplet_Dragged extends Applet implements MouseMotionListener {

    public void init() {
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse dragged at x: " + x + ", y: " + y);
    }

    public void mouseMoved(MouseEvent e) {
        // Handle mouse movement if needed
    }
}
