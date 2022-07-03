package com.mygdx.dsu.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.I18NBundle;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Locale;

public class MainMenu extends Game {
    SpriteBatch batch;
    Texture img;
    String execute = "exécuté";

    @Override
    public void create () {

        //executé une fois
        //System.out.println("Création du menu Main Initialisation");
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");



    }

    @Override
    public void render () {
        //affichage et mise à jour ?
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(img, 100, 100);
        //System.out.println("render : " + execute);
        batch.end();
        //System.out.println("batch.end() = "+ execute);

    }

    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();

        //Fermeture de l'application :
        //Test : Configuration des Assets i18n
        FileHandle baseFileHandle = Gdx.files.internal("i18n/DungeonsBundle");
        Locale locale = new Locale("fr");
        I18NBundle myBundle = I18NBundle.createBundle(baseFileHandle, locale);
        String quit_success = myBundle.get("MESSAGE_application_quit_success");
        //Gdx.app.log("APPLICATION" , quit_success);
        //System.out.println(quit_success);
    }


}
