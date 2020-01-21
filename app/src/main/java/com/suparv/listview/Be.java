package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Be extends AppCompatActivity {

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
        setContentView(R.layout.activity_be);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Beryllium");
        arrayList1.add("2) English name : Beryllium");
        arrayList1.add("3) Colour : Slate Gray");
        arrayList1.add("4) Discovered by : Louis-Nicolas Vauquelin ");
        arrayList1.add("5) Year discovered : 1798 ");
        arrayList1.add("6) Electron : 4");
        arrayList1.add("7) Proton : 4");
        arrayList1.add("8) Neutron : 5");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 1287 C = 1560.15 K");
        arrayList2.add("2) Boiling point : 2970 C = 3243.5 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : 190 W/(m K)");
        arrayList2.add("5) Thermal Expansion : 0.0000113 /K");
        arrayList2.add("6) Heat of Fusion : 7.95 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 297 kJ/mol");
        arrayList2.add("8) Young modulus : 287 GPa");
        arrayList2.add("9) Sheer modulus : 132");
        arrayList2.add("10 Bulk modulus : 130 GPa");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 4");
        arrayList3.add("2) Atomic mass : 9.012 amu");
        arrayList3.add("3) Atomic radius : 112 pm");
        arrayList3.add("4) Van der  Waals Radius : NA pm");
        arrayList3.add("5) Covalent radius : 96 pm");
        arrayList3.add("6) Oxidation State : +1, +2");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 1.57 (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 0 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 899.5 kJ/mol");
        arrayList4.add("4) Valence : 2");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : NA");
        arrayList5.add("2) Critical Pressure : NA");
        arrayList5.add("3) CAS number : CAS7440-41-7");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : 13000 m/s");
        arrayList5.add("6) Magnetic Type : Diamagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Simple Hexagonal");
        arrayList6.add("2) Debye temperature : 1000 K");
        arrayList6.add("3) Lattice Constants : 228.58, 228.58, 358.43 pm");
        arrayList6.add("4) Space group number : 194");
        arrayList6.add("5) Lattice angles : 90,90,120 (degree)");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable");
        arrayList7.add("2) Lifetime : Stable");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : 0.00003 ");
        arrayList7.add("5) Neutron cross section : 0.0092");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);

    }

    }

