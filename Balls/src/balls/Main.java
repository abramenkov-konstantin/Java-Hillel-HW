package balls;

import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("New Balls");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BallWorld(800, 480));
		frame.pack();
		frame.setVisible(true);
	}
}