package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Sc extends AppCompatActivity {

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
        setContentView(R.layout.activity_sc);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Scandium");
        arrayList1.add("2) English name : Scandium");
        arrayList1.add("3) Colour : Silver");
        arrayList1.add("4) Discovered by : Lars Nilson ");
        arrayList1.add("5) Year discovered : 1879 ");
        arrayList1.add("6) Electron : 21");
        arrayList1.add("7) Proton : 21");
        arrayList1.add("8) Neutron : 24");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 1541.0 C = 1814.15 K");
        arrayList2.add("2) Boiling point : 2836.0 C = 3109.15 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : 16 W/(m K)");
        arrayList2.add("5) Thermal Expansion : 0.0000102 /K");
        arrayList2.add("6) Heat of Fusion : 16 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 318 kJ/mol");
        arrayList2.add("8) Young modulus : 74 GPa ");
        arrayList2.add("9) Sheer modulus : 29 GPa ");
        arrayList2.add("10 Bulk modulus : 57 GPa ");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 21");
        arrayList3.add("2) Atomic mass : 44.9559 amu");
        arrayList3.add("3) Atomic radius : 184 pm");
        arrayList3.add("4) Van der  Waals Radius : NA");
        arrayList3.add("5) Covalent radius : 170 pm");
        arrayList3.add("6) Oxidation State : +1,+2,+3");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 1.36 (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 18.1 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 633.1 kJ/mol");
        arrayList4.add("4) Valence : 3");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : NA");
        arrayList5.add("2) Critical Pressure : NA");
        arrayList5.add("3) CAS number : CAS7440-20-2");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : NA");
        arrayList5.add("6) Magnetic Type : Paramagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Simple Hexagonal");
        arrayList6.add("2) Debye temperature : NA ");
        arrayList6.add("3) Lattice Constants : 330.9, 330.9, 527.33 pm");
        arrayList6.add("4) Space group number : 194 ");
        arrayList6.add("5) Lattice angles : 90,90,120 (degree)");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable ");
        arrayList7.add("2) Lifetime : Stable ");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : 0.025");
        arrayList7.add("5) Neutron cross section : 27.2");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);

    }
}
