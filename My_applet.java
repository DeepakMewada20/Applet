import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class My_applet extends Applet  {
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2;
    public void init(){
        l1=new Label("name");  
        t1=new TextField(20);

        l2=new Label("Roll No.");
        t2=new TextField(20);

        l3=new Label("Mobile No.");
        t3=new TextField(20);

        l4=new Label("Course");
        t4=new TextField(20);

        l5=new Label("Branch");
        t5=new TextField(20);

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