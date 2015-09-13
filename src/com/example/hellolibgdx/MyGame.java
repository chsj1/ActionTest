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
	TextureRegion bgRegion;//����ͼƬ
	Image bgImage;
	
	@Override
	public void create() {
		atlas1 = new TextureAtlas(Gdx.files.internal("data/loading.atlas"));
		bgRegion = atlas1.findRegion("bg");
		bgImage = new Image(bgRegion);
		
		stage = new Stage(480, 800, false);//��ʼ��һ��stage����
		atlas = new TextureAtlas(Gdx.files.internal("data/tween.atlas"));//��ʼ��TextureAtlas����
		yidongRegion = atlas.findRegion("yidong");//��TextureAtlas���ҵ�һ����Ϊyidong��region,���丳��yidongRegion
		yidongImage = new Image(yidongRegion);//��ʼһ��Image����
		yidongImage.setPosition(100, 700);//����λ��
		//��һ��Image��Ӷ���
		yidongImage.addAction(Actions.sequence(Actions.moveTo(300, 700, 1), Actions.moveTo(100, 700, 1)));
		rotateRegion = atlas.findRegion("xuanzhuan");
		rotateImage = new Image(rotateRegion);
		rotateImage.setPosition(160, 240);
		rotateImage.setOrigin(rotateImage.getWidth()/2, rotateImage.getHeight()/2);//����ê��Ϊ��ͼƬ������
		rotateImage.addAction(Actions.forever(Actions.rotateBy(-360, 0.5f)));
		scaleRegion = atlas.findRegion("dianji");
		scaleImage = new Image(scaleRegion);
		scaleImage.setPosition(100, 100);
		scaleImage.setOrigin(scaleImage.getWidth()/2, scaleImage.getHeight()/2);
		scaleImage.addAction(Actions.forever(Actions.sequence(Actions.parallel(Actions.scaleTo(0.5f, 0.5f, 0.5f), Actions.alpha(0.2f, 0.5f)), Actions.parallel(Actions.scaleTo(1f, 1f, 0.5f), Actions.alpha(1f, 0.5f)))));
		stage.addActor(bgImage);
		stage.addActor(yidongImage);//����Ա��ӵ���̨
		stage.addActor(rotateImage);
		stage.addActor(scaleImage);
		Gdx.input.setInputProcessor(stage);//��stage�������¼�
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
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
