package com.mygdx.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Bill on 27/08/2016.
 */
public class SkinState extends State {
    private Texture skin;

    public SkinState(GameStateManager gsm){
        super(gsm);
        skin = new Texture("skin"+skin_num+".PNG");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(skin,0 ,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sb.end();
    }

    @Override
    public void dispose() {
        skin.dispose();
    }
}
