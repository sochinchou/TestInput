package com.test.inputevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2018/10/29.
 */

public class MyViewGroup extends LinearLayout {
    private static final String TAG = "MyViewGroup";
    public static final String PREFIX = "|||||||||||||||||||||||";

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, PREFIX + " onInterceptTouchEvent() >>> [ " + ev.getAction() + " ]");
        boolean result = super.onInterceptTouchEvent(ev);
//        boolean result = ev.getAction() == 2;
//        Log.d(TAG, PREFIX + " onInterceptTouchEvent() >>> result =  " + result);
        return result;
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
        Log.d(TAG, PREFIX + PREFIX + " onTouchEvent() >>> [ " + event.getAction() + " ]");
        boolean result = super.onTouchEvent(event);
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
//        Log.d(TAG, PREFIX + " onKeyDown() >>> result = " + result);
        return result;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.d(TAG, PREFIX + " onKeyUp() >>> [ " + keyCode + " ]");
        boolean result = super.onKeyUp(keyCode, event);
//        Log.d(TAG, PREFIX + " onKeyUp() >>> result = " + result);
        return result;
    }

    //***************************************************************


}
