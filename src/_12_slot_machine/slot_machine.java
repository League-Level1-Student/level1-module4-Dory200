package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slot_machine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel lab = new JLabel();
	JLabel label = new JLabel();
	JLabel l = new JLabel();
	JButton button = new JButton();
	Random ran = new Random();
	private Icon createIcon(String fileName){
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return null;
	}
	Icon icon = new ImageIcon(imageURL);
	return icon;
}

	slot_machine(){
		frame.setVisible(true);
		button.setText("spin");
		button.addActionListener(this);
		panel.add(l);
		panel.add(lab);
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		int one = ran.nextInt(3);
		int two = ran.nextInt(3);
		int three = ran.nextInt(3);
		
		lab.setIcon(createIcon("slot orange.png"));
		label.setIcon(createIcon("slot 7.png"));
		l.setIcon(createIcon("cherry slot.png"));
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button)) {
			
		
		int one = ran.nextInt(3);
		int two = ran.nextInt(3);
		int three = ran.nextInt(3);
		if(one == 0) {
			lab.setIcon(createIcon("slot orange.png"));
		}
		else if(one == 1) {
			lab.setIcon(createIcon("slot 7.png"));
		}
		else {
			lab.setIcon(createIcon("cherry slot.png"));
		}
		if(two == 0) {
			label.setIcon(createIcon("slot orange.png"));
		}
		else if(two == 1) {
			label.setIcon(createIcon("slot 7.png"));
		}
		else {
			label.setIcon(createIcon("cherry slot.png"));
		}
		if(three == 0) {
			l.setIcon(createIcon("slot orange.png"));
		}
		else if(three == 1) {
			l.setIcon(createIcon("slot 7.png"));
		}
		else {
			l.setIcon(createIcon("cherry slot.png"));
		}
		if(one == two&&two == three) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
	}
	}
}
