import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Mouse_MotionListener extends Applet implements MouseMotionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    int i;
    public void init(){
        l1=new Label("Nmae");
        l2=new Label("course");
        l3=new Label("Branch");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);

        b1 =new Button("submit");
        b2=new Button("clear");
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);
        add(b2);

        b1.addMouseMotionListener(this);
        t2.addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e){
        if(e.getSource()==t1){
            l1.setBackground(Color.cyan);
        }
    }
    public void mouseMoved(MouseEvent e){
        if(e.getSource()==b1){
            i=e.getClickCount();
            t1.setText(Integer.toString(i));
            b1.setBackground(Color.cyan);
            l1.setForeground(Color.red);
            l2.setForeground(Color.red);
            l3.setForeground(Color.red);
            
        }
    }
}
