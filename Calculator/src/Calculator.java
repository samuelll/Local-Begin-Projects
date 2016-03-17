import java.awt.*;
import javax.swing.*;
import javax.swing.border.*; //linii border

public class Calculator {
	public static void main(String args[]) {
		Frame frm = new Frame("Calculator");
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(200, 270);
		frm.setResizable(false);
		frm.setLocationRelativeTo(null);
		
		frm.result.setPreferredSize(new Dimension(185, 65));
		frm.result.setBorder(LineBorder.createBlackLineBorder());
		frm.result.setBackground(new Color(181, 253, 255));
		frm.result.setVerticalTextPosition(JLabel.CENTER);
		frm.result.setHorizontalTextPosition(JLabel.CENTER);
		frm.result.setFont(new Font("Verdana", Font.PLAIN, 30));
		

	}
}