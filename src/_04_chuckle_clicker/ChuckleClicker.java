package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	static JButton button = new JButton();
	static JButton joke = new JButton();
	static JPanel panel = new JPanel();
	
	public void makeButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		button.setText("punchline");
		joke.setText("joke");
		joke.addActionListener(this);
		button.addActionListener(this);
		panel.add(button);
		panel.add(joke);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(joke)) {
			JOptionPane.showMessageDialog(null, "Your mom GOTTEM");
		}
		if(buttonPressed.equals(button)) {
			JOptionPane.showMessageDialog(null, "Who's fat??");
		}
	}
}
