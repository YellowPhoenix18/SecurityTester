package de.yellowphoenix18.securitytester.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

import de.yellowphoenix18.securitytester.listener.DeleteFrameListener;

public class DeleteFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static JButton delete;
	public static JButton deny;

	public DeleteFrame() {
		setVisible(true);
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Delete File");
		setResizable(false);
		setLayout(null);
		
		delete = new JButton("Delete");
		delete.setBounds(10, 30, 110, 25);
		delete.addActionListener(new DeleteFrameListener());
		add(delete);
		
		deny = new JButton("Deny");
		deny.setBounds(130, 30, 110, 25);
		deny.addActionListener(new DeleteFrameListener());
		add(deny);
		
		repaint();
	}

}
