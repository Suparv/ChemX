package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


    }


//    public void tag (View view)
//    {
//
//        Switch aSwitch;
//        final CardView crd = findViewById(R.id.crd1);
//        final ConstraintLayout cn = findViewById(R.id.big);
//        final TextView txt = findViewById(R.id.textView6);
//        final Switch d= findViewById(R.id.dkmd);
//
//        aSwitch = findViewById(R.id.dkmd);
//        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
//            {
//                if (isChecked)
//                {
//                    txt.setTextColor(Color.WHITE);
//                    crd.setBackgroundColor(Color.GRAY);
//                    cn.setBackgroundColor(Color.BLACK);
//                    d.setBackgroundColor(Color.BLACK);
//                }
//                else
//                {
//
//
//                    txt.setTextColor(Color.BLACK);
//                    cn.setBackgroundColor(Color.WHITE);
//                    crd.setBackgroundColor(Color.WHITE);
//                    d.setBackgroundColor(Color.WHITE);
//                }
//            }
//        }
//        );
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

    public void Na (View view)
    {
        Intent intent = new Intent(MainActivity.this, Sodium.class);
        startActivity(intent);
    }

    public void K (View view)
    {
        Intent intent = new Intent(MainActivity.this, Pottasium.class);
        startActivity(intent);
    }

    public void Rb (View view)
    {
        Intent intent = new Intent(MainActivity.this, Rubidium.class);
        startActivity(intent);
    }


}
