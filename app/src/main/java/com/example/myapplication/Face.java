package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;


public class Face extends SurfaceView {
    int skinColor; //define properties for the face
    int eyeColor;
    int hairColor;
    int hairStyle;
    int noseColor;


    public Face(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

    }

    public void onDraw(Canvas canvas) {
        drawSkin(canvas);
        drawEye(canvas);
        drawNose(canvas);
    }

    // methods to draw features of face
    public void drawSkin(Canvas canvas){
        Paint skinPaint = new Paint();
        skinPaint.setColor(Color.WHITE);
        skinPaint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(400.0f, 500.0f, 250.0f, skinPaint);
    }
    public void drawEye(Canvas canvas){
        Paint eyePaint = new Paint();
        eyePaint.setColor(Color.BLACK);
        canvas.drawCircle(300.0f, 450.0f, 30.0f, eyePaint);
        canvas.drawCircle(500.0f, 450.0f, 30.0f, eyePaint);
    }
    public void drawNose(Canvas canvas){
        Paint nosePaint = new Paint();
        nosePaint.setColor(Color.BLACK);
        canvas.drawCircle(400.0f, 540.0f, 20.0f, nosePaint);
    }
public void randomize(){ //randomize method (wasn't able to use it correctly)
    int red;
    int green;
    int blue;

    Random generator = new Random();

    red = generator.nextInt(256);
    green = generator.nextInt(256);
    blue = generator.nextInt(256);
    skinColor = Color.rgb(red,green,blue);
    eyeColor = Color.rgb(red,green,blue);
    hairColor = Color.rgb(red,green,blue);
}

}



