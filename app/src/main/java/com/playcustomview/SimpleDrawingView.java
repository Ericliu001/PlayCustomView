package com.playcustomview;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class SimpleDrawingView extends View {

	private int paintColor = Color.BLACK;
	private Paint drawPaint;
	// private ArrayList<Point> circlePoints;
	private Path drawPath = new Path();

	public SimpleDrawingView(Context context) {
		super(context, null);
	}

	public SimpleDrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setFocusable(true);
		setFocusableInTouchMode(true);
		setupPaint();
		// circlePoints = new ArrayList<Point>();
	}

	private void setupPaint() {
		drawPaint = new Paint();
		drawPaint.setColor(paintColor);
		drawPaint.setAntiAlias(true);
		drawPaint.setStrokeWidth(15);
		drawPaint.setStyle(Paint.Style.STROKE);
		drawPaint.setStrokeJoin(Paint.Join.ROUND);
		drawPaint.setStrokeCap(Paint.Cap.ROUND);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		
		
		

//		canvas.drawRect(0, 0, 500, 500, drawPaint);
//		drawPaint.setColor(Color.GREEN);
//		canvas.drawRect(510, 0, 1000, 500, drawPaint);

//		for (Point p : circlePoints) {
//			drawPaint.setColor(Color.RED);
//			canvas.drawCircle(p.x, p.y, 20, drawPaint);
//		}
		drawPaint.setColor(Color.RED);
		canvas.drawPath(drawPath, drawPaint);
		
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		float touchX = event.getX();
		float touchY = event.getY();

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			drawPath.moveTo(touchX, touchY);
			
			break;

		case MotionEvent.ACTION_MOVE:
			drawPath.lineTo(touchX, touchY);
			break;

		default:
			break;
		}

		postInvalidate();
		return true;
	}

}
