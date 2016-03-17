import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, punct, plus, minus, mult, imp, egal, cleanin;
	JLabel result;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t0;
	int a, b, c, d, e, f, g, h, i, j, k, l, m, n ;
	String s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20;	
	Listener listen = new Listener();
	String operation = "+";
public Frame(String s)
 {	
	super(s);
	setLayout(new FlowLayout());
	num1 = new JButton("1");
	num2 = new JButton("2");
	num3 = new JButton("3");
	num4 = new JButton("4");
	num5 = new JButton("5");
	num6 = new JButton("6");
	num7 = new JButton("7");
	num8 = new JButton("8");
	num9 = new JButton("9");
	num0 = new JButton("0");
	punct = new JButton(".");
	plus = new JButton("+");
	minus = new JButton("-");
	mult = new JButton("*");
	imp = new JButton("/");
	egal = new JButton("=");
	cleanin = new JButton("C");
	result = new JLabel("");
	t0 = new JTextField("");
	t1 = new JTextField("");
	t2 = new JTextField("");
	t3 = new JTextField("");
	t4 = new JTextField("");
	t5 = new JTextField("");
	t6 = new JTextField("");
	t7 = new JTextField("");
	t8 = new JTextField("");
	t9 = new JTextField("");
	add(result);
	add(num1);
	add(num2);
	add(num3);
	add(plus);
	add(num4);
	add(num5);
	add(num6);
	add(minus);
	add(num7);
	add(num8);
	add(num9);
	add(mult);
	add(num0);
	add(egal);
	add(punct);
	add(imp);
	add(cleanin);
	num1.addActionListener(listen);
	num2.addActionListener(listen);
	num3.addActionListener(listen);
	num4.addActionListener(listen);
	num5.addActionListener(listen);
	num6.addActionListener(listen);
	num7.addActionListener(listen);
	num8.addActionListener(listen);
	num9.addActionListener(listen);
	num0.addActionListener(listen);
	cleanin.addActionListener(listen);

	}	

public class Listener implements ActionListener {
	public void actionPerformed(ActionEvent actiune) {
	
		if(actiune.getSource()==num1){
			result.setText(result.getText()+"1");
		}
		
		if(actiune.getSource()==num2){
			result.setText(result.getText()+"2");
		}
		
		if(actiune.getSource()==num3){
			result.setText(result.getText()+"3");
		}
		
		if(actiune.getSource()==num4){
			result.setText(result.getText()+"4");
		}
		
		if(actiune.getSource()==num5){
			result.setText(result.getText()+"5");
		}
		
		if(actiune.getSource()==num6){
			result.setText(result.getText()+"6");
		}
		
		if(actiune.getSource()==num7){
			result.setText(result.getText()+"7");
		}
		
		if(actiune.getSource()==num8){
			result.setText(result.getText()+"8");
		}
		
		if(actiune.getSource()==num9){
			result.setText(result.getText()+"9");
		}
		
		if(actiune.getSource()==num0){
			result.setText(result.getText()+"0");
		}
		
		if(actiune.getSource()==cleanin) {
			result.setText(null);
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
			t7.setText(null);
			t8.setText(null);
			t9.setText(null);
			t0.setText(null);
		}
	}	
}	
}
