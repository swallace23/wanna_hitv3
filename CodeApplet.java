import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CodeApplet extends Applet{
    public void init() {
        JFrame jf = new JFrame("Page One");
        JLabel label = new JLabel("Wanna Smash?");
        label.setBounds(132, 50, 200, 40);
        jf.add(label);
        final JLabel tf = new JLabel();
        tf.setBounds(140, 150, 150, 20);
        JButton b = new JButton("Yes");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("tight");
            }});
        JButton c = new JButton("No");
        c.setBounds(200, 100, 95, 30);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("fuck u lol");
            }});
        jf.add(b);
        jf.add(c);
        jf.add(tf);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }

}

/*
<applet code="CodeApplet.class" width="300" height="300">
</applet>
*/
