package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Nb extends AppCompatActivity {

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
        setContentView(R.layout.activity_v);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Columbium");
        arrayList1.add("2) English name : Niobium");
        arrayList1.add("3) Colour : NA");
        arrayList1.add("4) Discovered by : Georgiy Flerov ");
        arrayList1.add("5) Year discovered : 1964 ");
        arrayList1.add("6) Electron : 104");
        arrayList1.add("7) Proton : 104");
        arrayList1.add("8) Neutron : 157");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 2100.0 C = 2373.15 K");
        arrayList2.add("2) Boiling point : 5500 C = 5773.15 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : NA");
        arrayList2.add("5) Thermal Expansion : NA");
        arrayList2.add("6) Heat of Fusion : NA");
        arrayList2.add("7) Heat of vapourisation : NA");
        arrayList2.add("8) Young modulus : NA");
        arrayList2.add("9) Sheer modulus : NA ");
        arrayList2.add("10 Bulk modulus :  NA");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 104");
        arrayList3.add("2) Atomic mass : 261 amu");
        arrayList3.add("3) Atomic radius : 150 pm (estimated)");
        arrayList3.add("4) Van der  Waals Radius : NA");
        arrayList3.add("5) Covalent radius : 157 pm (estimated)");
        arrayList3.add("6) Oxidation State : +2,+3,+4");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : NA");
        arrayList4.add("2) Electron Affinity : NA");
        arrayList4.add("3) Ionistation Energy : 580 kJ/mol");
        arrayList4.add("4) Valence : 4");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : NA");
        arrayList5.add("2) Critical Pressure : NA");
        arrayList5.add("3) CAS number : CAS53850-36-5");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : NA");
        arrayList5.add("6) Magnetic Type : NA");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Hexagonal Closed Pack");
        arrayList6.add("2) Debye temperature : NA");
        arrayList6.add("3) Lattice Constants : NA");
        arrayList6.add("4) Space group number : NA");
        arrayList6.add("5) Lattice angles : NA)");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : 13.05555555556 h ");
        arrayList7.add("2) Lifetime : 18.88888888889 h");
        arrayList7.add("3) Decay mode : Alpha Emission ");
        arrayList7.add("4) Neutron mass absorption : NA");
        arrayList7.add("5) Neutron cross section : NA");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);

    }
}
