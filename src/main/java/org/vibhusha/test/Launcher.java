package org.vibhusha.test;

import org.lwjgl.Version;
import org.vibhusha.core.WindowManager;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(Version.getVersion());

        WindowManager windowManager = new WindowManager("Game Engine",1600,900,false);
        while(!windowManager.windowShouldClose()){
            windowManager.init();
        }
    }
}
