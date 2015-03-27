package com.example.group.bubbleapplication;
import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Canvas;


public class Circle extends Activity
{
    private Point screen_position; //initial (x,y) coordinate position on the canvas
    private Paint circle; //circle object to be drawn to canvas
    private int radius; //radius of a circle object



    private int dx = 0; //change in x position
    private int dy = 0; //change in y position

    //Constructor (Passing in initial (x,y) position on screen, and radius)
    public Circle(int x_position, int y_position, int radius)
    {
        this.screen_position = new Point(x_position,y_position);
        this.radius = radius;
        circle = new Paint();
    }

    //Getters/Setters for Circle Objects
    public int getXPosition()
    {
        return screen_position.x; //x by default Point(x,y)
    }

    public void setXPosition(int x_position)
    {
        dx = x_position;
    }

    public int getYPosition()
    {
        return screen_position.y; //y by default Point(x,y)
    }

    public void setYPosition(int y_position)
    {
       dy = y_position;
    }

    public void setViewPosition(int x_position, int y_position)
    {
        screen_position.x = x_position;
        screen_position.y = y_position;
    }

    public int getRadius()
    {
        return radius;
    }

    public Paint getCircleColor()
    {
        return circle;
    }

    public void setCircleColor(int color)
    {
        circle.setColor(color);
    }

    public void moveCircle()
    {
        screen_position.x = screen_position.x + dx;
        screen_position.y = screen_position.y + dy;
    }

    public void screen_bounce(Canvas canvas)
    {
        moveCircle();
        if(screen_position.x > canvas.getWidth() || screen_position.x < 0) //Boundary of both sides of the canvas
           dx = dx *-1;
        if(screen_position.y > canvas.getWidth() || screen_position.y < 0)
            dy = dy *-1;

    }

}