package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	double x;
	double y;
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField textx = new JTextField(10);
	JTextField texty = new JTextField(10);
	JPanel pan = new JPanel();
	public double add() {
		JOptionPane.showMessageDialog(null, x + y);
		return x + y;
	}
	public double subtract() {
		JOptionPane.showMessageDialog(null, x - y);
		return x - y;
	}
	public double multiply() {
		JOptionPane.showMessageDialog(null, x * y);
		return x * y;
	}
	public double divide() {
		JOptionPane.showMessageDialog(null, x / y);
		return x / y;
	}
	calculator(){
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		frame.setVisible(true);
		add.setText("add");
		subtract.setText("sub");
		multiply.setText("mult");
		divide.setText("div");
		pan.add(add);
		pan.add(divide);
		pan.add(multiply);
		pan.add(subtract);
		pan.add(textx);
		pan.add(texty);
		frame.add(pan);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		x = Double.parseDouble(textx.getText());
		y = Double.parseDouble(texty.getText());
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(add)) {
			add();
		}
		if(buttonPressed.equals(divide)) {
			divide();
		}
		if(buttonPressed.equals(multiply)) {
			multiply();
		}
		if(buttonPressed.equals(subtract)) {
			subtract();
		}
	}
}
