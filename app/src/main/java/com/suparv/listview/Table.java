package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void H(View view) {
        Intent intent = new Intent(Table.this, H_Activity.class);
        startActivity(intent);
    }


    public void He(View view) {
        Intent intent = new Intent(Table.this, Helium.class);
        startActivity(intent);
    }

    public void Li(View view) {
        Intent intent = new Intent(Table.this, Lithium.class);
        startActivity(intent);
    }

    public void Na(View view) {
        Intent intent = new Intent(Table.this, Sodium.class);
        startActivity(intent);
    }

    public void K(View view) {
        Intent intent = new Intent(Table.this, Pottasium.class);
        startActivity(intent);
    }

    public void Rb(View view) {
        Intent intent = new Intent(Table.this, Rubidium.class);
        startActivity(intent);
    }

    public void Fr(View view) {
        Intent intent = new Intent(Table.this, Fr.class);
        startActivity(intent);
    }

    public void Be(View view) {
        Intent intent = new Intent(Table.this, Be.class);
        startActivity(intent);
    }

    public void Mg (View view) {
        Intent intent = new Intent(Table.this, Mg.class);
        startActivity(intent);
    }

    public void Ca (View view) {
        Intent intent = new Intent(Table.this, Ca.class);
        startActivity(intent);
    }

    public void Sr (View view) {
        Intent intent = new Intent(Table.this, Sr.class);
        startActivity(intent);
    }

    public void Ba (View view) {
        Intent intent = new Intent(Table.this, Ba.class);
        startActivity(intent);
    }

    public void Ra (View view) {
        Intent intent = new Intent(Table.this, Ra.class);
        startActivity(intent);
    }

    public void Sc (View view) {
        Intent intent = new Intent(Table.this, Sc.class);
        startActivity(intent);
    }

    public void Y (View view) {
        Intent intent = new Intent(Table.this, Y.class);
        startActivity(intent);
    }

    public void Ti (View view) {
        Intent intent = new Intent(Table.this, Ti.class);
        startActivity(intent);
    }

    public void Zr (View view) {
        Intent intent = new Intent(Table.this, Zr.class);
        startActivity(intent);
    }

    public void Hf (View view) {
        Intent intent = new Intent(Table.this, Hf.class);
        startActivity(intent);
    }

    public void Rf (View view) {
        Intent intent = new Intent(Table.this, Rf.class);
        startActivity(intent);
    }



}
