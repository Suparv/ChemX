package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Helium extends AppCompatActivity {



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
     setContentView(R.layout.activity_helium);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Helium");
        arrayList1.add("2) English name : Helium");
        arrayList1.add("3) Colour : Colourless");
        arrayList1.add("4) Discovered by : Pierre Janssen & Joseph Lockyer");
        arrayList1.add("5) Year discovered : 1868 ");
        arrayList1.add("6) Electron : 2");
        arrayList1.add("7) Proton : 2");
        arrayList1.add("8) Neutron : 2 ");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : -272.2 C = 0.95 K");
        arrayList2.add("2) Boiling point : -268.9 C = 4.25 K");
        arrayList2.add("3) Phase at STP : Gas");
        arrayList2.add("4) Thermal conductivity : 0.1513 W/(m K)");
        arrayList2.add("5) Thermal Expansion : N/A");
        arrayList2.add("6) Heat of Fusion : 0.02 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 0.083 kJ/mol");
        arrayList2.add("8) Young modulus : NA");
        arrayList2.add("9) Sheer modulus : NA");
        arrayList2.add("10 Bulk modulus : NA");
        arrayList2.add("11) Poisson ratio : NA");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 2");
        arrayList3.add("2) Atomic mass : 4.002602 amu");
        arrayList3.add("3) Atomic radius : 31 pm");
        arrayList3.add("4) Van der  Waals Radius : 140 pm");
        arrayList3.add("5) Covalent radius : 28 pm");
        arrayList3.add("6) Ionisation Potential : 24.47 eV");
        arrayList3.add("7) Oxidation State : NA");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : NA (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 0 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 2372.3 kJ/mol");
        arrayList4.add("4) Valence : NA");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Pressure : 0.227 MPa ");
        arrayList5.add("2) Critical Temperature : 5.19 K");
        arrayList5.add("3) CAS number : CAS7440-59-7");
        arrayList5.add("4) Refractive Index : 1.000035");
        arrayList5.add("5) Speed of Sound : 970 m/s");
       arrayList5.add("6) Magnetic Type : Diamagnetic : ");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Face Centered Cubic");
        arrayList6.add("2) Grid Parameters : a=3.570 A, c=5.84 A");
        arrayList6.add("3) Debye temperature : -163.15 C = 110K");
        arrayList6.add("4) Lattice Constants : 424.2, 424.2, 424.2 pm");
        arrayList6.add("5) Space group number : 225");

        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable");
        arrayList7.add("2) Lifetime : Stable");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : 0.00001 ");
        arrayList7.add("5) Neutron cross section : 0.007");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);




    }





}





