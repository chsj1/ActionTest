package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
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

public class CopyOfMyGame implements ApplicationListener {

	
	
	
	@Override
	public void create() {
//		MoveToAction moveToAction = new MoveToAction();
//		moveToAction.setPosition(x, y);//设置移动的终点
//		moveToAction.setDuration(duration);//设置持续时间
//		//在duration时间内移动到(x,y)
//		MoveToAction moveToAction = Actions.moveTo(x, y, duration);
//		
//		//在duration时间内，将一个actor的位置繁盛(amountX,amountY)的偏移
//		MoveByAction moveByAction = Actions.moveBy(amountX, amountY, duration);
//		moveByAction.setAmount(x, y);//设置x轴和y轴上的偏移量
//		moveByAction.setDuration(duration);//设置持续时间
//		
//		//在duration时间内淡出
//		AlphaAction alphaAction = Actions.fadeIn(duration);
//		//在duration时间内淡入
//		AlphaAction alphaAction2 = Actions.fadeOut(duration);
//		alphaAction.setAlpha(alpha);//设置目标alpha值
//		alphaAction.setDuration(duration);//设置动画的持续时间
//		
//		//在duration将actor的宽度放大amountX倍,高度放大amountY倍.
//		ScaleByAction scaleByAction = Actions.scaleBy(amountX, amountY, duration);
//		scaleByAction.setAmount(x, y);//设置x轴和y轴的变化量
//		scaleByAction.setDuration(duration);//设置持续时间
//		
//		//在duration将actor的宽度放大到amountX倍,高度放大到amountY倍.
//		ScaleToAction scaleToAction = Actions.scaleTo(x, y, duration);
//		scaleToAction.setScale(x, y);//设置目标放大倍数
//		scaleToAction.setDuration(duration);//设置持续时间
//		
//		ParallelAction parallelAction = Actions.parallel(action1, action2, action3);
//		SequenceAction sequenceAction = Actions.sequence(action1, action2, action3);
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
