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

public class Nasty_surprise implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel pan = new JPanel();
	JButton treat = new JButton();
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
		Nasty_surprise() {
		button.setText("Trick");
		treat.setText("Treat");
		pan.add(button);
		pan.add(treat);
		button.addActionListener(this);
		treat.addActionListener(this);
		frame.add(pan);
		frame.setVisible(true);
		frame.pack();
		
	}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) arg0.getSource();
			
			if(buttonPressed.equals(treat)) {
				showPictureFromTheInternet("https://cdn.vox-cdn.com/thumbor/w2P7h9AY3B_TL2RveD8l0WII8EE=/0x27:4415x3338/1200x800/filters:focal(0x27:4415x3338)/cdn.vox-cdn.com/uploads/chorus_image/image/43170476/ghosts.0.0.jpg");
			}
			if(buttonPressed.equals(button)) {
				showPictureFromTheInternet("https://image.freepik.com/free-vector/blank-banner-with-cute-unicorn-pastel-sky-background_1308-45955.jpg");
			}
		}
}
