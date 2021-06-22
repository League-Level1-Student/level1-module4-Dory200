package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pig_latin implements ActionListener {
	JTextField textx = new JTextField(10);
	JLabel label = new JLabel();
	JButton button = new JButton();
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	PigLatinTranslator piglatin = new PigLatinTranslator();
	pig_latin(){
		button.setText("translate");
		pan.add(textx);
		pan.add(button);
		pan.add(label);
		frame.add(pan);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
