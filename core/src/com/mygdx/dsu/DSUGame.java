package com.mygdx.dsu;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.utils.LongMap;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.dsu.screens.MainMenu;

public class DSUGame extends Game
{

    public SpriteBatch batch;
    public BitmapFont personnageOnScreen;
    int personnagePositionX;
    int personnagePositionY;
    String personnage;

    @Override
    public void create() {
        batch = new SpriteBatch();
        personnageOnScreen = new BitmapFont();
        //Initialisation du personnage
        personnageOnScreen.setColor(1, 0, 0, 10);
        personnage = "X";
        personnagePositionX = 100;
        personnagePositionY = 150;
    }
    @Override
    public void render(){
        ScreenUtils.clear(0, 0, 0, 1);
        //super.render();
        //Draw
        batch.begin();
        personnageOnScreen.draw(batch, personnage, personnagePositionX, personnagePositionY);
        batch.end();
        //Update
        deplacementPersonnage();

    }
    @Override
    public void dispose() {
        batch.dispose();
        personnageOnScreen.dispose();
    }

    /**
     * Déplacement du personnage au clavier
     * Utilisation des touches UP, DOWN, RIGHT, LEFT
     */
    private void deplacementPersonnage(){
        //Axe  : x
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            personnagePositionX += 1;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            personnagePositionX += -1;
        }
        //Axe : y
        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            personnagePositionY += 1;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            personnagePositionY += -1;
        }
    }
}
