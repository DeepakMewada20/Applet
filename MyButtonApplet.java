import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonApplet extends Applet implements ActionListener {
     Button myButton;

    public void init() {
        myButton = new Button("Click me");
        myButton.addActionListener(this);
        add(myButton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            myButton.setBackground(Color.cyan);
        }
    }
}
