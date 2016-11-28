package de.yellowphoenix18.securitytester.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.yellowphoenix18.securitytester.SecurityTester;
import de.yellowphoenix18.securitytester.frame.DeleteFrame;
import de.yellowphoenix18.securitytester.utils.SecurityTesterUtils;

public class DeleteFrameListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == DeleteFrame.delete) {
			if(SecurityTester.delete != null) {
				SecurityTesterUtils.delDirectory(SecurityTester.delete);
			}
			MainFrameListener.delete_frame.setVisible(false);
			MainFrameListener.delete_frame.dispose();
		} else if(e.getSource() == DeleteFrame.deny) {
			SecurityTester.delete = null;
			MainFrameListener.delete_frame.setVisible(false);
			MainFrameListener.delete_frame.dispose();
		}
	}

}
