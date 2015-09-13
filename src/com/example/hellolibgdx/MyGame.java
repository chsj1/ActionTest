package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.AlphaAction;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleByAction;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {
	Stage stage;
	TextureAtlas atlas;
	TextureRegion rotateRegion;
	TextureRegion scaleRegion;
	TextureRegion yidongRegion;
	Image rotateImage;
	Image scaleImage;
	Image yidongImage;
	
	TextureAtlas atlas1;
	TextureRegion bgRegion;//背景图片
	Image bgImage;
	
	@Override
	public void create() {
		atlas1 = new TextureAtlas(Gdx.files.internal("data/loading.atlas"));
		bgRegion = atlas1.findRegion("bg");
		bgImage = new Image(bgRegion);
		
		stage = new Stage(480, 800, false);//初始化一个stage对象
		atlas = new TextureAtlas(Gdx.files.internal("data/tween.atlas"));//初始化TextureAtlas对象
		yidongRegion = atlas.findRegion("yidong");//在TextureAtlas中找到一个名为yidong的region,将其赋给yidongRegion
		yidongImage = new Image(yidongRegion);//初始一个Image对象
		yidongImage.setPosition(100, 700);//设置位置
		//给一个Image添加动画
		yidongImage.addAction(Actions.sequence(Actions.moveTo(300, 700, 1), Actions.moveTo(100, 700, 1)));
		rotateRegion = atlas.findRegion("xuanzhuan");
		rotateImage = new Image(rotateRegion);
		rotateImage.setPosition(160, 240);
		rotateImage.setOrigin(rotateImage.getWidth()/2, rotateImage.getHeight()/2);//设置锚点为该图片的中心
		rotateImage.addAction(Actions.forever(Actions.rotateBy(-360, 0.5f)));
		scaleRegion = atlas.findRegion("dianji");
		scaleImage = new Image(scaleRegion);
		scaleImage.setPosition(100, 100);
		scaleImage.setOrigin(scaleImage.getWidth()/2, scaleImage.getHeight()/2);
		scaleImage.addAction(Actions.forever(Actions.sequence(Actions.parallel(Actions.scaleTo(0.5f, 0.5f, 0.5f), Actions.alpha(0.2f, 0.5f)), Actions.parallel(Actions.scaleTo(1f, 1f, 0.5f), Actions.alpha(1f, 0.5f)))));
		stage.addActor(bgImage);
		stage.addActor(yidongImage);//将演员添加到舞台
		stage.addActor(rotateImage);
		stage.addActor(scaleImage);
		Gdx.input.setInputProcessor(stage);//用stage来处理事件
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		stage.act();
		stage.draw();
	}
	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}
}
