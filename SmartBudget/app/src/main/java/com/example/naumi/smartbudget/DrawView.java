package com.example.naumi.smartbudget;

import android.content.Context;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DrawView extends View {
    private Bitmap gradientBmp;
    RectF login, nextBut;
    public DrawView(Context context)  {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        login = new RectF(.20f*getWidth(),.40f*getHeight(),.80f*getWidth(),.60f*getHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint myPaint = new Paint();
        //Typeface programFont = getResources().getFont(R.font.dense);
        //TextView textView = new TextView(getContext());
        //textView.setTypeface(programFont);
        
        // set background as Technica gradient
        gradientBmp = BitmapFactory.decodeResource(getResources(),R.drawable.gradient);
        Rect bg=new Rect (0,0,getWidth(),getHeight());
        canvas.drawBitmap(gradientBmp,null,bg,null);

        // draw login box
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeWidth(5);
        myPaint.setColor(Color.WHITE);
        canvas.drawRect(login, myPaint);

        // login text
        //myPaint.setFo
        myPaint.setStyle(Paint.Style.FILL);
        myPaint.setTextSize(60);
        myPaint.setTextAlign(Paint.Align.CENTER);
        int xPos = (canvas.getWidth() / 2);
        int yPos = (int)((canvas.getHeight() / 2) - ((myPaint.descent() + myPaint.ascent()) / 2));
        canvas.drawText("Common Cents", xPos,yPos,myPaint);
    }
    }

