
import java.awt.BorderLayout;

import javax.swing.*;

public class frameANDbuttone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   JFrame ahmad = new JFrame();
   ahmad.getContentPane().setLayout(new BorderLayout());  
   JButton start = new JButton("salam");
   JTextField say = new JTextField();
   ahmad.setSize(300, 500);
   ahmad.getContentPane().add((start),BorderLayout.SOUTH);
   ahmad.getContentPane().add(say);
   ahmad.setTitle("frame");
   ahmad.setVisible(true);
   ahmad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
//This was a good progect
