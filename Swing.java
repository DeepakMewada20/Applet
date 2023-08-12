import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Swing extends JApplet implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    JPasswordField pf;
    Font ff;
    Container con;
    GridLayout gl;
    public void init(){
        con=getContentPane();
        gl=new GridLayout(4,2);
        con.setLayout(gl);

        l1=new JLabel("Nmae");
        l2=new JLabel("course");
        l3=new JLabel("Branch");

        t1=new JTextField(20);
        t2=new JTextField(20);
        pf=new JPasswordField(20);

        b1=new JButton("submit");
        b2=new JButton("clear");

        ff=new Font("Harlow Solid", Font.BOLD|Font.ITALIC,20);
        con.add(l1);
        con.add(t1);

        con.add(l2);
        con.add(t2);

        con.add(l3);
        con.add(pf);

        con.add(b1);
        con.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            b1.setBackground(Color.red);
            b2.setBackground(Color.green);
        }
    }
}
