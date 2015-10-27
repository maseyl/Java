// Michael Seyl
// 3 Homework
// September 20, 2015
// ICT362
// Java Programming

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class hw3_MAS extends JFrame implements ActionListener {

public String id = "800430930";
public String login = "maseyl@nmsu.edu";


JTextField arg1 = new JTextField(10);
JTextField arg2 = new JTextField(10);
JTextField arg3 = new JTextField(10);
JLabel lError = new JLabel("Use only numbers!");
JLabel lAdd = new JLabel("+");
JLabel lSub = new JLabel("-");
JLabel lMul = new JLabel("X");
JLabel lDiv = new JLabel("/");

public static void main(String[] n) {
	hw3_MAS o = new hw3_MAS();
	}


public hw3_MAS() {
	setTitle("Program Homework Three");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setSize(600,200);
	
	JLabel lTitle = new JLabel("Seyl's Quick Calculator");
	JLabel lEqu = new JLabel("=");
	Font f1 = new Font("Chalkboard", Font.BOLD, 22);
	lTitle.setForeground(Color.white);
	lTitle.setFont(f1);

	arg1.setText("0");
	arg2.setText("0");
	arg3.setEditable(false);

	JButton bPlus = new JButton("+");
	JButton bMinus = new JButton("-");
	JButton bTimes = new JButton("X");
	JButton bDivide = new JButton("/");
	JButton bQuit = new JButton("Quit");

	bPlus.addActionListener(this);
	bMinus.addActionListener(this);
	bTimes.addActionListener(this);
	bDivide.addActionListener(this);
	bQuit.addActionListener(this);

	JPanel pTop = new JPanel();
	pTop.setPreferredSize(new Dimension(600,50));
	pTop.setBackground(new Color(220, 20, 60));
	JPanel pMid = new JPanel();
	pMid.setBackground(Color.white);
	JPanel pBtm = new JPanel();
	pBtm.setBackground(new Color(220, 20, 60));

	pBtm.add(bPlus);
	pBtm.add(bMinus);
	pBtm.add(bTimes);
	pBtm.add(bDivide);
	pBtm.add(bQuit);
	
	pMid.add(arg1);
	pMid.add(lAdd).setVisible(false);
	pMid.add(lSub).setVisible(false);
	pMid.add(lMul).setVisible(false);
	pMid.add(lDiv).setVisible(false);
	pMid.add(arg2);
	pMid.add(lEqu);
	pMid.add(arg3);
	pMid.add(lError).setVisible(false);
	
	lTitle.setHorizontalAlignment(JLabel.CENTER);
	lTitle.setVerticalAlignment(JLabel.CENTER);
	pTop.add(lTitle);

	add(pTop,BorderLayout.NORTH);
	add(pBtm,BorderLayout.SOUTH);	
	add(pMid,BorderLayout.CENTER);

	setLocationRelativeTo(null);
	setVisible(true);
}

public void actionPerformed(ActionEvent e) {
	String bp = e.getActionCommand();

	lError.setVisible(false);
	lAdd.setVisible(false);
	lSub.setVisible(false);
	lMul.setVisible(false);
	lDiv.setVisible(false);
	String a = arg1.getText();
	String b = arg2.getText();
	Double y=0.0;
	Double z=0.0;
	Double ans=0.0;
	try {
		y = Double.parseDouble(a);
		z = Double.parseDouble(b);
		}
	catch (NumberFormatException d) {
		lError.setVisible(true);
		return;
		}
		
	if (bp.equals("Quit")) {
		System.exit(0);
		}
	if (bp.equals("+")) {
		ans = y + z;
		arg3.setText(ans.toString());
		lAdd.setVisible(true);
		}
	if (bp.equals("-")) {
		ans = y - z;
		arg3.setText(ans.toString());
		lSub.setVisible(true);
		}
	if (bp.equals("X")) {
		ans = y * z;
		arg3.setText(ans.toString());
		lMul.setVisible(true);
		}
	if (bp.equals("/")) {
		ans = y / z;
		arg3.setText(ans.toString());
		lDiv.setVisible(true);
		}
}

public String ME = "Michael Seyl";
public String theDate = "09/20/2015";
}
