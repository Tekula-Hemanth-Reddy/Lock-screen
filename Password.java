package Lock;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Password implements WindowListener, ActionListener
{
	JFrame frame;
	JButton submit;
	JLabel label;
	JTextField tfield;
	Password()
	{
		frame=new JFrame();
		frame.setBounds(0, 0, 1950, 1300);
		frame.setLayout(null);
		frame.setBackground(Color.orange);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		label=new JLabel("Enter Password");
		label.setBounds(100, 100, 200, 30);
		frame.add(label);
		tfield=new JTextField();
		tfield.setBounds(300, 100, 100, 30);
		frame.add(tfield);
		submit=new JButton("Submit");
		submit.setBounds(400,200,100,30);
		submit.addActionListener(this);
		frame.add(submit);
		frame.setVisible(true);
        frame.addWindowListener(this);
	}
	public void windowActivated(WindowEvent arg0) {
		
	}
	public void windowClosed(WindowEvent arg0) {
		JOptionPane.showMessageDialog(frame, "can't exit");
		
	}
	@Override
	public void windowClosing(WindowEvent we) {
		JOptionPane.showMessageDialog(frame, "can't exit");	
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}
	public void windowDeiconified(WindowEvent arg0) {
		
	}
	public void windowIconified(WindowEvent arg0) {
		frame.setState(JFrame.NORMAL);
        JOptionPane.showMessageDialog(frame, "Cant Minimize");
		
	}
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(tfield.getText().equalsIgnoreCase("hemanth") ||tfield.getText().equalsIgnoreCase("chuchu") ||tfield.getText().equalsIgnoreCase("chomu"))
		{
			frame.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "enter correct Password");
		}
	}
}