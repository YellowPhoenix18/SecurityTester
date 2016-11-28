package de.yellowphoenix18.securitytester.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import de.yellowphoenix18.securitytester.listener.MainFrameListener;

public class SecurityFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public static JButton clear_programms_x86;
	public static JButton clear_programms;
	public static JButton user_admin;
	public static JButton windows;
	
	public static JLabel info;

	public SecurityFrame() {
		setVisible(true);
		setSize(630, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("C-Cleaner");
		setResizable(false);
		setLayout(null);
		
		clear_programms_x86 = new JButton("Clean Programms x86");
		clear_programms_x86.setBounds(50, 100, 240, 40);
		clear_programms_x86.addActionListener(new MainFrameListener());
		add(clear_programms_x86);
		
		clear_programms = new JButton("Clean Programms");
		clear_programms.setBounds(50, 160, 240, 40);
		clear_programms.addActionListener(new MainFrameListener());
		add(clear_programms);
		
		user_admin = new JButton("Clean Users/Administrator");
		user_admin.setBounds(340, 100, 240, 40);
		user_admin.addActionListener(new MainFrameListener());
		add(user_admin);
		
		windows = new JButton("Clean Windows");
		windows.setBounds(340, 160, 240, 40);
		windows.addActionListener(new MainFrameListener());
		add(windows);	
		
		info = new JLabel("...");
		info.setBounds(10, 5, 500, 25);
		add(info);	
		
		repaint();
	}

}
