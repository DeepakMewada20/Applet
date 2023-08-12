import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Mouse_Listener extends Applet implements MouseListener{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    Font ff;
    int i;
    GridLayout gl;
    public void init(){
        gl=new GridLayout(4,2);
        setLayout(gl);
        l1=new Label("Nmae");
        l2=new Label("course");
        l3=new Label("Branch");

        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);

        b1 =new Button("submit");
        b2=new Button("clear");

        ff=new Font("Harlow Solid", Font.BOLD|Font.ITALIC,20);
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);
        add(b2);

        b1.addMouseListener(this);
        b2.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        if (e.getSource()==b1){
            b1.setBackground(Color.green);
        }
        if(e.getSource()==b2){
            b2.setBackground(Color.green);
        }
    }
    public void mouseEntered(MouseEvent e){
        if(e.getSource()==b1){
            t1.setBackground(Color.gray);
            t1.setFont(ff);
        }
    }
    public void mouseExited(MouseEvent e){
        if(e.getSource()==b2){
            l1.setFont(ff);
            l2.setFont(ff);
            l3.setFont(ff);
        }
    }
    public void mousePressed(MouseEvent e){
        if(e.getSource()==b2){
            t1.setBackground(Color.gray);
        
        }
    }
    public void mouseReleased(MouseEvent e){
        if (e.getSource()==b1){
            l2.setBackground(Color.pink);
        }
    }
}
