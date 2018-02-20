import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	
	void go()
	{
		frame=new JFrame("可八家");
		JButton button=new JButton("should I do?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
		frame.setSize(666, 666);
	}
	
	public static void main(String[] args) {
		SwingObserverExample a=new SwingObserverExample();
		a.go();
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("===");
		}
		
	}
	class DevilListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("+++");
		}
		
	}

}
