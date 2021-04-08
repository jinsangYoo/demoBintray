package jinsang.com.demobintray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jinsang.com.demobintraylib.DemoTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoTest dt = new DemoTest();
        dt.showToast(this, getResources());
    }
}
