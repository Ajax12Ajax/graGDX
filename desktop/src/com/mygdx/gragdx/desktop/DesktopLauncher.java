package com.mygdx.gragdx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.gragdx.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "pixel legends";
		config.width = 680;
		config.height = 420;
		new LwjglApplication(new MyGdxGame(), config);
	}
}