import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Calc extends JFrame {
	JTextArea display = new JTextArea();
	JPanel panoubutoane = new JPanel(new GridLayout(5, 3));
	JButton num0 = new JButton("0");
	JButton num1 = new JButton("1");
	JButton num2 = new JButton("2");
	JButton num3 = new JButton("3");
	JButton num4 = new JButton("4");
	JButton num5 = new JButton("5");
	JButton num6 = new JButton("6");
	JButton num7 = new JButton("7");
	JButton num8 = new JButton("8");
	JButton num9 = new JButton("9");
	JButton suma = new JButton("+");
	JButton difer = new JButton("-");
	JButton mult = new JButton("*")	;
	JButton imp = new JButton("/");
	JButton sterge = new JButton("Bck");
	JButton egal = new JButton("=");
	JButton curatire = new JButton("C");
	
	int firstValue = 0;
	String operation = "+";
	
	Calc() {
		setBounds(500, 300, 500, 300);
try {		
		num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
		
		num1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actiune) {
				display.setText(display.getText()+"1");
			}
		});
		
		num2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune) {
				display.setText(display.getText()+"2");
			}
		});
		
		num3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"3");
			}
		});
		
		num4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"4");
			}
		});
		
		num5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"5");
			}
		});
		
		num6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"6");
			}
		});
		
		num7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"7");
			}
		});
		
		num8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"8");
			}
		});
		
		num9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(display.getText()+"9");
			}
		});
		
		sterge.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				String sterge = display.getText();
				display.setText(sterge.substring(0, sterge.length()-1));
			}
		});
		
		suma.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "+";
			}
		});
		
		difer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "-";
			}
		});
		
		mult.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "*";
			}
		});
		
		imp.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				firstValue = Integer.valueOf(display.getText());
				display.setText("");
				operation = "/";
			}
		});
		
		egal.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent actiune){
			double rezultat = Double.valueOf(display.getText());
			
			if ("+".equals(operation)){
				display.setText((firstValue + rezultat)+"");
			}
			if ("-".equals(operation)){
				display.setText((firstValue - rezultat)+"");
			}
			if ("*".equals(operation)){
				display.setText((firstValue * rezultat)+"");
			}
			if ("/".equals(operation)){
				display.setText((firstValue / rezultat)+"");
			}
			
			//firstValue = 0;
			//operation = "+";
			}
		});
		
		curatire.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent actiune){
				display.setText(null);
			}
		});
		
}catch(Exception Ex) {JOptionPane.showMessageDialog(null, "Put Numbers!");}	

		setLayout(new BorderLayout());
		add(display, BorderLayout.NORTH);
		display.setPreferredSize(new Dimension(280, 70));
		display.setFont(new Font("Verdana", Font.PLAIN, 45));
		display.setBackground(new Color(181, 253, 255));	
		display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		add(panoubutoane, BorderLayout.CENTER);
		add(egal, BorderLayout.SOUTH);
		add(sterge, BorderLayout.SOUTH);
		add(curatire, BorderLayout.SOUTH);
		panoubutoane.add(num1);
		panoubutoane.add(num2);
		panoubutoane.add(suma);
		panoubutoane.add(num3);
		panoubutoane.add(num4);
		panoubutoane.add(difer);
		panoubutoane.add(num5);
		panoubutoane.add(num6);
		panoubutoane.add(mult);
		panoubutoane.add(num7);
		panoubutoane.add(num8);
		panoubutoane.add(imp);
		panoubutoane.add(num9);
		panoubutoane.add(num0);
		panoubutoane.add(egal);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
	
	public static void main(String args[]){
		new Calc();
	}
	
}
