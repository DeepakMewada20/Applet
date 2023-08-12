
import java.applet.*;
import java.awt.*;

public class Applet_choice_and_checkbox extends Applet
{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4,t5;
	Button b1,b2;
	Button X1,X2,X3,X4,X5,X6,X7,X8;
	Panel p1,p2,p3,p4,p5;
	BorderLayout bb;
	GridLayout gl;
	Font ff,f1;
	
	//Radiobutton r1,r2;
	Checkbox c1,c2,c3;
	Choice cc;

	public void init()
	{
	
	p1 = new Panel();
	p1.setBackground(Color.white);
	p2 = new Panel();
	p2.setBackground(Color.white);
	p3 = new Panel();
	p3.setBackground(Color.green);
	p4 = new Panel();
	p4.setBackground(Color.yellow);
	p5 = new Panel();
	p5.setBackground(Color.white);

	bb = new BorderLayout();
	setLayout(bb);

	gl = new GridLayout(6,2);
	p5.setLayout(gl);

	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.SOUTH);
	add(p3, BorderLayout.EAST);
	add(p4, BorderLayout.WEST);
	add(p5, BorderLayout.CENTER);

	//r1 = new Radiobutton("Male");
	//r2 = new Radiobutton("Female");
	f1=new Font("Harlow Solid",Font.ITALIC,20);
	
	c1 = new Checkbox("UG",false);
	c1.setFont(f1);
	c2 = new Checkbox("PG",false);
	c2.setFont(f1);
	c3 = new Checkbox("Ph.D.",true);
	c3.setFont(f1);

	cc = new Choice();
	cc.add("C");
	cc.add("C++");
	cc.add("Java");
	cc.add("C#.Net");
	cc.add("Python");
	cc.setFont(f1);

	X5 = new Button("X5");
	X6 = new Button("X6");
	X7 = new Button("X7");
	X8 = new Button("X8");

	p1.add(cc);

	p2.add(c1);
    p2.add(c2);
	p2.add(c3);

	p3.add(X5);
	p3.add(X6);
	p4.add(X7);
	p4.add(X8);

	ff = new Font("Harlow Solid", Font.BOLD|Font.ITALIC,20);
	
	l1 = new Label("Name: ");
	l1.setBackground(Color.red);
	l1.setFont(ff);

	l2 = new Label("Course: ");
	l2.setBackground(Color.red);
	l2.setFont(ff);

	l3 = new Label("Branch: ");
	l3.setBackground(Color.red);
	l3.setFont(ff);

	l4 = new Label("Semester: ");
	l4.setBackground(Color.red);
	l4.setFont(ff);

	l5 = new Label("Enrollment: ");
	l5.setBackground(Color.red);
	l5.setFont(ff);

	t1 = new TextField(20);
	t1.setBackground(Color.yellow);
	t1.setFont(ff);

	t2 = new TextField(20);
	t2.setBackground(Color.yellow);
	t2.setFont(ff);

	t3 = new TextField(20);
	t3.setBackground(Color.yellow);
	t3.setFont(ff);

	t4 = new TextField(20);
	t4.setBackground(Color.yellow);
	t4.setFont(ff);

	t5 = new TextField(20);
	t5.setBackground(Color.yellow);
	t5.setFont(ff);
	
	b1 = new Button("Submit");
	b1.setBackground(Color.blue);
	b1.setForeground(Color.white);
	b1.setFont(ff);

	b2 = new Button("Clear");
	b2.setBackground(Color.blue);
	b2.setForeground(Color.white);
	b2.setFont(ff);
	
	p5.add(l5);
	p5.add(t1);
	p5.add(l1);
	p5.add(t2);
	p5.add(l2);
	p5.add(t3);
	p5.add(l3);
	p5.add(t4);
	p5.add(l4);
	p5.add(t5);
	p5.add(b1);
	p5.add(b2);

	}
}
