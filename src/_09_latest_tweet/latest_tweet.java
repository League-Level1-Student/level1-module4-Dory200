package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class latest_tweet implements ActionListener {
	JFrame frame = new JFrame();
	JButton twitter = new JButton();
	JTextField textx = new JTextField(10);
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	latest_tweet(){
		twitter.setText("Search the twitterverse");
		panel.add(twitter);
		panel.add(textx);
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
		twitter.addActionListener(this);
		
	}
	private String getLatestTweet(String searchingFor) {
		
		try {
			Twitter twitter = new TwitterFactory().getInstance();

		    AccessToken accessToken = new AccessToken(
		        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
		        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
		        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		    twitter.setOAuthAccessToken(accessToken);
		    Query query = new Query(searchingFor);
		    try {
		        QueryResult result = twitter.search(query);
		        return result.getTweets().get(0).getText();
		    } catch (Exception e) {
		        System.err.print(e.getMessage());
		        return "What the heck is that?";
		    }
		}
		catch(Exception e){
			return "did not work";
		}
	    

	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Tweet, Tweet");
		String x = textx.getText();
		String tweet = getLatestTweet(x);
		label.setText(tweet);
		frame.pack();
		
	}
}
