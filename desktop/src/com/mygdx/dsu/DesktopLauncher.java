package com.mygdx.dsu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.I18NBundle;
import com.mygdx.dsu.DSUGame;

import java.util.Locale;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Dungeons Stories Universe");
		System.out.println(" ici ");

		new Lwjgl3Application(new DSUGame(), config);

		//Test : Configuration des Assets i18n
		FileHandle baseFileHandle = Gdx.files.internal("i18n/DungeonsBundle");
		Locale locale = new Locale("fr");
		I18NBundle myBundle = I18NBundle.createBundle(baseFileHandle, locale);
		String test = myBundle.get("MESSAGE_application_quit_success");
		Gdx.app.log("APPLICATION" , test);


	}
}
