package de.yellowphoenix18.securitytester.threads;

import java.io.File;

import de.yellowphoenix18.securitytester.utils.SecurityTesterUtils;

public class DeleteThread extends Thread {
	
	File f = null;
	
	public DeleteThread(File file) {
		this.f = file;
	}
	
	public void run() {
		SecurityTesterUtils.delDirectory(this.f);
	}

}
