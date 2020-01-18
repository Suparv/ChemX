package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//          this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

//
//    Switch dark = findViewById(R.id.dkmd);
//    dark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener)
//    {
//        @Override
//                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
//        {
//            if(isChecked == true)
//            {
//                View scr = findViewById(R.id.horizontalScrollView);
//                scr.set
//            }
//        }
//    }



    public void H (View view)
    {
        Intent intent = new Intent(MainActivity.this, H_Activity.class);
        startActivity(intent);

    }


    public void He (View view)
    {
        Intent intent = new Intent(MainActivity.this, Helium.class);
        startActivity(intent);

    }

    public void Li (View view)
    {
        Intent intent = new Intent(MainActivity.this, Lithium.class);
        startActivity(intent);

    }



}
