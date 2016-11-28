package de.yellowphoenix18.securitytester.utils;

import java.io.File;

import de.yellowphoenix18.securitytester.frame.SecurityFrame;

public class SecurityTesterUtils {

    public static boolean delDirectory(File dir){
        if(dir.isDirectory()){
                String[] entries = dir.list();
                for (int x=0;x<entries.length;x++) {
                    File aktFile = new File(dir.getPath(),entries[x]);
                    SecurityFrame.info.setText("Lösche " + entries[x]);
                    delDirectory(aktFile);
                }
                if(dir.delete()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if(dir.delete()) {
                    return true;
                } else {
                    return false;
                }
           }
    }
	
}
