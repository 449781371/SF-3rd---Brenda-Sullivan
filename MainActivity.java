package statefarm.collegeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.gesture.Gesture;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

    private String TAG = MainActivity.class.getSimpleName();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GestureListener gestureDetector1 = new GestureListener();

        ;

    }


    }


}
