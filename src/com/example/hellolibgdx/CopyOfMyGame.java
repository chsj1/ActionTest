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
//		moveToAction.setPosition(x, y);//�����ƶ����յ�
//		moveToAction.setDuration(duration);//���ó���ʱ��
//		//��durationʱ�����ƶ���(x,y)
//		MoveToAction moveToAction = Actions.moveTo(x, y, duration);
//		
//		//��durationʱ���ڣ���һ��actor��λ�÷�ʢ(amountX,amountY)��ƫ��
//		MoveByAction moveByAction = Actions.moveBy(amountX, amountY, duration);
//		moveByAction.setAmount(x, y);//����x���y���ϵ�ƫ����
//		moveByAction.setDuration(duration);//���ó���ʱ��
//		
//		//��durationʱ���ڵ���
//		AlphaAction alphaAction = Actions.fadeIn(duration);
//		//��durationʱ���ڵ���
//		AlphaAction alphaAction2 = Actions.fadeOut(duration);
//		alphaAction.setAlpha(alpha);//����Ŀ��alphaֵ
//		alphaAction.setDuration(duration);//���ö����ĳ���ʱ��
//		
//		//��duration��actor�Ŀ�ȷŴ�amountX��,�߶ȷŴ�amountY��.
//		ScaleByAction scaleByAction = Actions.scaleBy(amountX, amountY, duration);
//		scaleByAction.setAmount(x, y);//����x���y��ı仯��
//		scaleByAction.setDuration(duration);//���ó���ʱ��
//		
//		//��duration��actor�Ŀ�ȷŴ�amountX��,�߶ȷŴ�amountY��.
//		ScaleToAction scaleToAction = Actions.scaleTo(x, y, duration);
//		scaleToAction.setScale(x, y);//����Ŀ��Ŵ���
//		scaleToAction.setDuration(duration);//���ó���ʱ��
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		
		
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
