package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
	JFrame f = new JFrame();
	public static void main(String[] args) {
		
		chuckleClicker c = new chuckleClicker();
		c.makeButtons();
		
	}
	
	public void makeButtons() {
		
		
		f.setVisible(true);
		JPanel p = new JPanel();
		p.setVisible(true);
		f.add(p);
		p.add(joke);
		p.add(punchline);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		f.setSize(500, 500);
		joke.setSize(100, 70);
		joke.setText("Joke");
		punchline.setSize(100, 70);
		punchline.setText("Punchline");
		f.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == joke) {
			
			JOptionPane.showMessageDialog(null, "Hi!");
			JOptionPane.showMessageDialog(null, "Did you here about the restaurant on the moon?");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Great food, no atmooshpere");
			
		}
		
	}
	
}
