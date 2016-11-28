package de.yellowphoenix18.securitytester.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;

import de.yellowphoenix18.securitytester.SecurityTester;
import de.yellowphoenix18.securitytester.frame.DeleteFrame;
import de.yellowphoenix18.securitytester.frame.SecurityFrame;

public class MainFrameListener implements ActionListener {
	
	public static JFrame delete_frame;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == SecurityFrame.clear_programms_x86) {
			SecurityTester.delete = new File("C://", "Program Files (x86)");
			delete_frame = new DeleteFrame();
		} else if(e.getSource() == SecurityFrame.clear_programms) {
			SecurityTester.delete = new File("C://", "Program Files");
			delete_frame = new DeleteFrame();
		} else if(e.getSource() == SecurityFrame.windows) {
			SecurityTester.delete = new File("C://", "Windows");
			delete_frame = new DeleteFrame();
		} else if(e.getSource() == SecurityFrame.user_admin) {
			SecurityTester.delete = new File("C://Users/", "Administrator");
			delete_frame = new DeleteFrame();
		}
	}

}
