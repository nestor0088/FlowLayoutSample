package FlowLayoutSample;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutSample {
    static JFrame fr;
    static JPanel p1;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    public static void main(String[] args) {
        fr=new JFrame();
        fr.setTitle("GUI ");
        p1=new JPanel(new FlowLayout());
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        fr.add(p1);
        fr.setSize(350, 200);
        fr.setLocation(400,400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
