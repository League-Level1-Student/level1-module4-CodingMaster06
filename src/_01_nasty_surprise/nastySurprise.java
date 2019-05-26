package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	  JButton treat = new JButton();
	JButton trick = new JButton();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	void setup() {
		treat.setText("treat");
		treat.addActionListener(this);
		trick.setText("trick");
		trick.addActionListener(this);
		p.add(treat);
		p.add(trick);
		f.add(p);
		p.isVisible();
		f.setVisible(true);
		f.pack();
	}
public static void main(String[] args) {
	nastySurprise ns = new nastySurprise();
	ns.setup();
}
@Override
public void actionPerformed(ActionEvent e) {
	showPictureFromTheInternet("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwihq9Dc-LniAhUETd8KHRleDhAQjRx6BAgBEAU&url=https%3A%2F%2Fknowyourmeme.com%2Fmemes%2Fface-swap&psig=AOvVaw1xZUBmZW2dumgjuZRLyn9A&ust=1558985623761193");
	
}
}
