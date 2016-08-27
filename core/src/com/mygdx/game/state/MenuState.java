package com.mygdx.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.state.GameStateManager;
import com.mygdx.game.state.State;
import com.sun.javafx.scene.paint.GradientUtils;

/**
 * Created by Bill on 27/08/2016.
 */
public class MenuState extends State {
    private Texture background;
    private static int SKIN_WIDTH = 170;
    private static int SKIN_HEIGHT = 170;
    private static int SET_WIDTH = 140;
    private static int SET_HEIGHT = 140;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("desktop.PNG");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched())
        {
            System.out.println(Gdx.input.getX() + ": "+Gdx.input.getY());
            if(Gdx.input.getX() <= (SKIN_WIDTH *  Gdx.graphics.getWidth() /background.getWidth())
                    && Gdx.input.getY() >= ((Gdx.graphics.getHeight() - SET_HEIGHT) *  Gdx.graphics.getHeight() / background.getHeight()))
            {
                gsm.set(new SkinState(gsm));
            }
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0 ,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
    }
}
