package com.playcustomview;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

public class CustomButton extends Button {
	private Paint paint;
	private float stroke = 15;
	
	public CustomButton(Context context) {
		super( context, null);
	}

	public CustomButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint();
//		paint.setStrokeWidth(stroke);
		paint.setStyle(Paint.Style.FILL);
//		paint.setStrokeJoin(Paint.Join.ROUND);
//		paint.setStrokeCap(Paint.Cap.ROUND);
		paint.setColor(Color.YELLOW);
	}
	
	
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		Log.d("eric", "canvas width:" + canvas.getWidth() + " , " + "canvas height:" + canvas.getHeight() );
		
		float cx = canvas.getWidth()/2;
		float cy = canvas.getHeight()/2;
//		float radius = (cx > cy ? cy : cx) - stroke/2 ;
		float radius = (cx > cy ? cy : cx) ;
		canvas.drawCircle(cx, cy, radius, paint);
	}

}
