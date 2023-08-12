import java.applet.*;
import java.awt.*;

public class Applet_set_color extends Applet {
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2;
    GridLayout gl;
    Font ff;
    public void init(){
        gl=new GridLayout(6,2);
        setLayout(gl);
        ff=new Font("Lohit Devanagari",Font.BOLD,20);

        l1=new Label("name");
        l1.setBackground(Color.green);
        l1.setFont(ff);

        l2=new Label("Roll No.");
        l2.setBackground(Color.red);
        l2.setFont(ff);

        l3=new Label("Mobile No.");
        l3.setBackground(Color.red);
        l3.setFont(ff);

        l4=new Label("Course");
        l4.setBackground(Color.red);
        l4.setFont(ff);

        l5=new Label("Branch");
        l5.setBackground(Color.red);
        l5.setFont(ff);

        t1=new TextField(20);
        t1.setBackground(Color.magenta);
        t1.setFont(ff);
        t2=new TextField(20);
        t2.setBackground(Color.magenta);
        t2.setFont(ff);
        t3=new TextField(20);
        t3.setBackground(Color.magenta);
        t3.setFont(ff);
        t4=new TextField(20);
        t4.setBackground(Color.magenta);
        t4.setFont(ff);
        t5=new TextField(20);
        t5.setBackground(Color.magenta);
        t5.setFont(ff);

        b1=new Button("submit");
        b2=new Button("clear");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b1);
        add(b2);
    }
}
