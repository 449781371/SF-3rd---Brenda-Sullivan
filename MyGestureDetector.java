package statefarm.collegeapp;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import android.support.v4.view.GestureDetectorCompat;

class GestureListener implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private String TAG =  GestureListener.class.getSimpleName();

    private GestureDetectorCompat GestureDetect;

    public boolean onDown (MotionEvent e){
        Log.d(TAG, "Gesture placed down.");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    public boolean onSingleTapConfirmed (MotionEvent e) {
        Log.d(TAG, "Single tap performed.");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }
}
