package com.example.group.bubble;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

/*
TODO
    --START PAGE--(onCreate initial view when app is opened)
        :Background
            &color -> (light blue?)
            &animation -> (animated background?)
        :Button
            &shape -> (oval?)
            &animation -> (float up and down a pixel or two?)
            &button background -> (button has a back image?)
    --BUBBLE GAME--(Switch to Game page)
        :Background
            &
            &
        :Bubble Movement
            &
            &
        :Bubble Animation
            &animation -> (bounce?)
        :Random Events
            &
        :Timed Events
            &

    %SEQUENCE OF EVENTS%
        :User open app and the start page loads
        :User clicks the button and the splash page loads
        :The splash page is dismissed and the game window opens
 */

public class StartPageActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void switch_to_Splash(View view)
    {
        setContentView(R.layout.game_page);
    }
}
