package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whack_a_mole implements ActionListener {
	JButton mole;
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	Random ran = new Random();
	int points = 0;
	static void speak(String words) {
		
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }

	public void whack_a_mole(){
		frame.setVisible(true);
		frame.add(pan);
		int random = ran.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			pan.add(button);
			button.addActionListener(this);
			if(i == random) {
				mole = button;
				button.setText("Mole!");
			}
			
			
				
			
			frame.pack();
			
		}
	
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(mole)) {
			speak("You're right!");
			points += 1;
			frame.dispose();
		}
		else {
			speak("You're wrong");
			frame.dispose();		
		}
		frame.setVisible(true);
		int random = ran.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			pan.add(button);
			button.addActionListener(this);
			if(i == random) {
				mole = button;
				button.setText("Mole!");
			}
	}
}
}
