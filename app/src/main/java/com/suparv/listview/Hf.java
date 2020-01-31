package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Hf extends AppCompatActivity {

    ListView listView1;
    ListView listView2;
    ListView listView3;
    ListView listView4;
    ListView listView5;
    ListView listView6;
    ListView listView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hf);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Hafnium");
        arrayList1.add("2) English name : Hafnium");
        arrayList1.add("3) Colour : Silver");
        arrayList1.add("4) Discovered by : Coster and Hevesy");
        arrayList1.add("5) Year discovered : 1923 ");
        arrayList1.add("6) Electron : 72");
        arrayList1.add("7) Proton : 72");
        arrayList1.add("8) Neutron : 106");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 2233.0 C = 2506.15 K");
        arrayList2.add("2) Boiling point : 4602 C = 4875.15 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : 23 W/(m K)");
        arrayList2.add("5) Thermal Expansion : 0.000059 /K");
        arrayList2.add("6) Heat of Fusion : 25.5 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 630 kJ/mol");
        arrayList2.add("8) Young modulus : 78 GPa ");
        arrayList2.add("9) Sheer modulus : 30 GPa ");
        arrayList2.add("10 Bulk modulus :  110 GPa");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 72");
        arrayList3.add("2) Atomic mass : 178.49 amu");
        arrayList3.add("3) Atomic radius : 167 pm");
        arrayList3.add("4) Van der  Waals Radius : NA");
        arrayList3.add("5) Covalent radius : 150 pm");
        arrayList3.add("6) Oxidation State : +2,+3,+4");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 1.3 (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 0 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 658.5 kJ/mol");
        arrayList4.add("4) Valence : 4");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : NA");
        arrayList5.add("2) Critical Pressure : NA");
        arrayList5.add("3) CAS number : CAS7440-58-6");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : 3010 m/s");
        arrayList5.add("6) Magnetic Type : Paramagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Hexagonal Closed Pack");
        arrayList6.add("2) Debye temperature : NA");
        arrayList6.add("3) Lattice Constants : 319.64, 319.64, 505.11 pm");
        arrayList6.add("4) Space group number : 194 ");
        arrayList6.add("5) Lattice angles : 90,90,120 (degree)");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable ");
        arrayList7.add("2) Lifetime : Stable ");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : 0.02");
        arrayList7.add("5) Neutron cross section : 104");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);

    }
}
