package com.test.inputevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2018/10/29.
 */

public class MyView extends View {
    private static final String TAG = "MyView";
    public static final String PREFIX = "XXXXXXXXXXXXXXXXXXXX";

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, PREFIX + " dispatchTouchEvent() >>> [ " + ev.getAction() + " ]");
        boolean result = super.dispatchTouchEvent(ev);
//        Log.d(TAG, PREFIX + " dispatchTouchEvent() >>> result =  " + result);
        return result;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, PREFIX + " onTouchEvent() >>> [ " + event.getAction() + " ] x = " + event.getX() + ", y = " + event.getY());
//        boolean result = super.onTouchEvent(event);

        boolean result = true;
//        if(event.getAction() == MotionEvent.ACTION_DOWN){
//            result = true;
//        }else if(event.getAction() == MotionEvent.ACTION_MOVE){
//            result = false;
//        }else if(event.getAction() == MotionEvent.ACTION_UP){
//            result = false;
//        }
//        Log.d(TAG, PREFIX + " onTouchEvent() >>> result =  " + result);
        return result;
    }

    //***************************************************************

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        Log.d(TAG, PREFIX + " dispatchKeyEvent() >>> [ " + event.getKeyCode()
                + ", action = " + event.getAction() + " ]");
        boolean result = super.dispatchKeyEvent(event);
        //        Log.d(TAG, PREFIX + " dispatchKeyEvent() >>> result = " + result);
        return result;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, PREFIX + " onKeyDown() >>> [ " + keyCode + " ]");
        boolean result = super.onKeyDown(keyCode, event);
        Log.d(TAG, PREFIX + " onKeyDown() >>> result = " + result);
        return result;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.d(TAG, PREFIX + " onKeyUp() >>> [ " + keyCode + " ]");
        boolean result = super.onKeyUp(keyCode, event);
        Log.d(TAG, PREFIX + " onKeyUp() >>> result = " + result);
        return result;
    }

    //***************************************************************


}
