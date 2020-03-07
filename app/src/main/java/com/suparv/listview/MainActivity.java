package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {


    private static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        Handler handler = new Handler();

        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Table.class);
                startActivity(intent);
                finish();
            }
        }, 4000);


        
        
        

    }



    public void H(View view) {
        Intent intent = new Intent(MainActivity.this, H_Activity.class);
        startActivity(intent);
    }


    public void He(View view) {
        Intent intent = new Intent(MainActivity.this, Helium.class);
        startActivity(intent);
    }

    public void Li(View view) {
        Intent intent = new Intent(MainActivity.this, Lithium.class);
        startActivity(intent);
    }

    public void Na(View view) {
        Intent intent = new Intent(MainActivity.this, Sodium.class);
        startActivity(intent);
    }

    public void K(View view) {
        Intent intent = new Intent(MainActivity.this, Pottasium.class);
        startActivity(intent);
    }

    public void Rb(View view) {
        Intent intent = new Intent(MainActivity.this, Rubidium.class);
        startActivity(intent);
    }

    public void Fr(View view) {
        Intent intent = new Intent(MainActivity.this, Fr.class);
        startActivity(intent);
    }

    public void Be(View view) {
        Intent intent = new Intent(MainActivity.this, Be.class);
        startActivity(intent);
    }

    public void Mg (View view) {
        Intent intent = new Intent(MainActivity.this, Mg.class);
        startActivity(intent);
    }

    public void Ca (View view) {
        Intent intent = new Intent(MainActivity.this, Ca.class);
        startActivity(intent);
    }

    public void Sr (View view) {
        Intent intent = new Intent(MainActivity.this, Sr.class);
        startActivity(intent);
    }

    public void Ba (View view) {
        Intent intent = new Intent(MainActivity.this, Ba.class);
        startActivity(intent);
    }

    public void Ra (View view) {
        Intent intent = new Intent(MainActivity.this, Ra.class);
        startActivity(intent);
    }

    public void Sc (View view) {
        Intent intent = new Intent(MainActivity.this, Sc.class);
        startActivity(intent);
    }

    public void Y (View view) {
        Intent intent = new Intent(MainActivity.this, Y.class);
        startActivity(intent);
    }

    public void Ti (View view) {
        Intent intent = new Intent(MainActivity.this, Ti.class);
        startActivity(intent);
    }

    public void Zr (View view) {
        Intent intent = new Intent(MainActivity.this, Ti.class);
        startActivity(intent);
    }

    public void Hf (View view) {
        Intent intent = new Intent(MainActivity.this, Hf.class);
        startActivity(intent);
    }

    public void Rf (View view) {
        Intent intent = new Intent(MainActivity.this, Rf.class);
        startActivity(intent);
    }

    public void V (View view) {
        Intent intent = new Intent(MainActivity.this, V.class);
        startActivity(intent);
    }
    public void Nb (View view) {
        Intent intent = new Intent(MainActivity.this, Nb.class);
        startActivity(intent);
    }
    public void Ta (View view) {
        Intent intent = new Intent(MainActivity.this, Ta.class);
        startActivity(intent);
    }

}
