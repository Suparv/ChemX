package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class H_Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_h_);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Hydrogenium");
        arrayList1.add("2) English name : Hydrogen");
        arrayList1.add("3) Colour : Colourless");
        arrayList1.add("4) Discovered by : Henry Cavendish");
        arrayList1.add("5) Year discovered : 1766 ");
        arrayList1.add("6) Electron : 1");
        arrayList1.add("7) Proton : 1");
        arrayList1.add("8) Neutron : NA ");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : -259.14 C = 14.01 K");
        arrayList2.add("2) Boiling point : -252.87 C = 20.28 K");
        arrayList2.add("3) Phase at STP : Gas");
        arrayList2.add("4) Thermal conductivity : 0.1805 W/(m K)");
        arrayList2.add("5) Thermal Expansion : N/A");
        arrayList2.add("6) Heat of Fusion : 0.558 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 0.452 kJ/mol");
        arrayList2.add("8) Young modulus : NA");
        arrayList2.add("9) Sheer modulus : NA");
        arrayList2.add("10 Bulk modulus : NA");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 1");
        arrayList3.add("2) Atomic mass : 1.008 amu");
        arrayList3.add("3) Atomic radius : 53 pm");
        arrayList3.add("4) Van der  Waals Radius : 120 pm");
        arrayList3.add("5) Covalent radius : 31 pm");
        arrayList3.add("6) Ionisation Potential : 13.53 eV");
        arrayList3.add("7) Oxidation State : +1, -1");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 2.2 (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 72.8 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 1312 kJ/mol");
        arrayList4.add("4) Valence : 1");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : 32.97 K");
        arrayList5.add("2) Critical Pressure : 1.293 MPa");
        arrayList5.add("3) CAS number : CAS1333-74-0");
        arrayList5.add("4) Refractive Index : 1.000132");
        arrayList5.add("5) Speed of Sound : 1270 m/s");
        arrayList5.add("6) Magnetic Type : Diamagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Hexagonal");
        arrayList6.add("2) Grid Parameters : a=3.780 A, c=6.167 A");
        arrayList6.add("3) Debye temperature : -163.15 C = 110K");
        arrayList6.add("4) Lattice Constants : 470, 470, 340 pm");
        arrayList6.add("5) Space group number : 194");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable");
        arrayList7.add("2) Lifetime : Stable");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : 0.011 ");
        arrayList7.add("5) Neutron cross section : 0.332");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);




    }





}
