package com.test.inputevent;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final String PREFIX = "====================";

    private Button btn1;
    private MyViewGroup viewGroup;
    private MyView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
//        btn1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, PREFIX + " onClick() >>>");
//                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });

        btn1.setOnClickListener(
                (v) -> {Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();}
        );

        viewGroup = (MyViewGroup) findViewById(R.id.viewGroup);
        view = (MyView) findViewById(R.id.view);

//        viewGroup.setFocusableInTouchMode(true);
        view.setFocusableInTouchMode(true);
    }

    //**************************************************************
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        Log.d(TAG, PREFIX + " dispatchTouchEvent() >>> [ " + ev.getAction() + " ]" + (action == 0 ? "-------------------------" : ""));
        boolean result = super.dispatchTouchEvent(ev);
//        Log.d(TAG, PREFIX + " dispatchTouchEvent() >>> result = " + result);
        return result;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, PREFIX + " onTouchEvent() >>> [ " + event.getAction() + " ]");
        boolean result = super.onTouchEvent(event);
//        Log.d(TAG, PREFIX + " onTouchEvent() >>> result = " + result);
        return result;
    }

    //***************************************************************


    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        Log.d(TAG, PREFIX + " dispatchKeyEvent() >>> [ " + event.getKeyCode()
                + ", action = " + event.getAction() + ", repeat = " + event.getRepeatCount() + " ]");
        Log.d(TAG, PREFIX + " dispatchKeyEvent() >>> isLongPress = " + event.isLongPress());
        Log.d(TAG, PREFIX + " dispatchKeyEvent() >>> downTime = " + event.getDownTime() + " eventTime = " + event.getEventTime());
        boolean result = super.dispatchKeyEvent(event);
//                Log.d(TAG, PREFIX + " dispatchKeyEvent() >>> result = " + result);
        return result;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, PREFIX + " onKeyDown() >>> [ " + keyCode + " ]");
//        boolean result = super.onKeyDown(keyCode, event);
        boolean result = true;
        event.startTracking();
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

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(TAG, PREFIX + " onKeyLongPress() >>> [ " + keyCode + " ]");
        boolean result = super.onKeyLongPress(keyCode, event);
//        Log.d(TAG, PREFIX + " onKeyLongPress() >>> result = " + result);
        return result;
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        Log.d(TAG, PREFIX + " onKeyMultiple() >>> [ " + keyCode + ", repeat = " + repeatCount +  " ]");
        boolean result = super.onKeyMultiple(keyCode, repeatCount, event);
//        Log.d(TAG, PREFIX + " onKeyMultiple() >>> result = " + result);
        return result;
    }


    //***************************************************************
    private int a;
    private Handler mHandler = new Handler(new Handler.Callback(){
        @Override
        public boolean handleMessage(Message msg) {
            int b = a;
            return false;
        }
    });

    static class MyHandler extends Handler{

        private WeakReference<MainActivity> ref;

        public MyHandler(MainActivity activity){
            ref = new WeakReference<MainActivity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            MainActivity act = ref.get();
            if(act != null){

            }
            super.handleMessage(msg);
        }
    }

}
