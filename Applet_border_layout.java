import java.applet.*;
import java.awt.*;

public class Applet_border_layout extends Applet {
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2;
    Button x1,x2,x3,x4;
    Panel p1,p2,p3,p4,p5;
    GridLayout gl;
    BorderLayout bb;
    Font ff;
    Choice c1,c2,c3;

    public void init()
    {

        p1=new Panel();
        p1.setBackground(Color.green);
        p2=new Panel();
        p2.setBackground(Color.red);
        p3=new Panel();
        p3.setBackground(Color.yellow);
        p4=new Panel();
        p4.setBackground(Color.gray);
        p5=new Panel();
        p5.setBackground(Color.pink);

        bb=new BorderLayout();
        setLayout(bb);

        gl=new GridLayout(6,2);
        p5.setLayout(gl);

        add(p1,BorderLayout.EAST);
        add(p2,BorderLayout.NORTH);
        add(p3,BorderLayout.WEST);
        add(p4,BorderLayout.SOUTH);
        add(p5,BorderLayout.CENTER);


        x1=new Button("x1");
        x2=new Button("x2");
        x3=new Button("x3");
        x4=new Button("x4");

        ff = new Font("Harlow Solid", Font.BOLD|Font.ITALIC,20);

        p1.add(x1);
        p2.add(x2);
        p3.add(x3);
        p4.add(x4);


        l1=new Label("Nme");
        l1.setBackground(Color.cyan);
        l1.setFont(ff);

        l2=new Label("Enrolment No.");
        l2.setBackground(Color.cyan);
        l2.setFont(ff);

        l3=new Label("Course");
        l3.setBackground(Color.cyan);
        l3.setFont(ff);

        l4=new Label("Branch");
        l4.setBackground(Color.cyan);
        l4.setFont(ff);

        l5=new Label("Semester");
        l5.setBackground(Color.cyan);
        l5.setFont(ff);

        t1=new TextField(20);
        t1.setBackground(Color.GREEN);
        t1.setFont(ff);

        t2=new TextField(20);
        t2.setBackground(Color.GREEN);
        t2.setFont(ff);

        t3=new TextField(20);
        t4=new TextField(20);
        t5=new TextField(20);

       c1=new Choice();
       c1.add("UG");
       c1.add("PG");
       c1.add("Ph. D.");
       c1.setFont(ff);

       c2=new Choice();
       c2.add("CSE");
       c2.add("IT");
       c2.setFont(ff);

       c3=new Choice();
       c3.add("I sem");
       c3.add("II sem");
       c3.add("III sem");
       c3.add("IV sem");
       c3.add("V sem");
       c3.add("VI sem");
       c3.add("VII sem");
       c3.add("VIII sem");
       c3.setFont(ff);

        b1=new Button("submit");
        b2=new Button("clear");

        p5.add(l1);
        p5.add(t1);
        p5.add(l2);
        p5.add(t2);
        p5.add(l3);
        p5.add(c1);
        p5.add(l4);
        p5.add(c2);
        p5.add(l5);
        p5.add(c3);
        p5.add(b1);
        p5.add(b2);
    }
}


