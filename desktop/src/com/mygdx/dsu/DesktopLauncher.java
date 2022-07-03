package com.mygdx.dsu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.I18NBundle;
import com.mygdx.dsu.DSUGame;
import com.mygdx.dsu.screens.MainMenu;

import java.util.Locale;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		int _WIDTH = 1600;
		int _HEIGHT = 960;
		config.setWindowedMode(_WIDTH, _HEIGHT);
		config.useVsync(true);
		config.setForegroundFPS(160);
		config.setTitle("Dungeons Stories Universe");
		new Lwjgl3Application(new DSUGame(), config);

	}
}
