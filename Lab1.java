// Michael Seyl
// 1 Lab
// August 27, 2015
// ICT362
// Java Programming

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Lab1 extends JFrame implements ActionListener {
public String id = "800430930";
public String login = "maseyl@nmsu.edu";
public static void main(String[] n) {
    Lab1 o = new Lab1();
    }
    
public Lab1() {
    setSize(800,600);
    JButton b1 = new JButton("Quit");
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add (b1,BorderLayout.SOUTH);
    b1.addActionListener(this);
    setTitle("Lab One");
    
    add(p,BorderLayout.SOUTH);
    
    setVisible(true);
}

public void actionPerformed(ActionEvent e) {
    String t = e.getActionCommand();
    if (t.equals("Quit")) {
        System.exit(0);
    }
    
}

public String ME = "Michael Seyl";
public String theDate = "08/27/2015";
}

