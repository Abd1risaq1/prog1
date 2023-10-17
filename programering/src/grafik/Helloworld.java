package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Helloworld extends JFrame {
	
  JLabel text= new JLabel("Hello world");
  JButton knapp= new JButton(" change text ");
	
	
	public Helloworld() {
		this.setVisible(true);
		this.setSize(new Dimension(500,500));
		this.setLayout(new FlowLayout());
		this.add(text);
		this.add(knapp);
		
		
		knapp.addActionListener(e->{
			
			text.setText("ny text");
			
		});
		
	}

	public static void main(String[] args) {
		
		new Helloworld();
		
		
		
		
	}

}
