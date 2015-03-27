package com.example.group.bubbleapplication;

import android.view.View;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Color;


public class Draw extends View
{
    Circle circle; //Circle object

    public Draw(Context context)
    {
        super(context);
        circle = new Circle(50,50,100);
        circle.setXPosition(10);
        circle.setYPosition(10);
        circle.setCircleColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawCircle(circle.getXPosition(),circle.getYPosition(), circle.getRadius(), circle.getCircleColor());
        circle.moveCircle();
        circle.screen_bounce(canvas);
        invalidate();
    }
}


