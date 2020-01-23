package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Mg extends AppCompatActivity {

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
        setContentView(R.layout.activity_mg);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Magnesium");
        arrayList1.add("2) English name : Magnesium");
        arrayList1.add("3) Colour : Silver");
        arrayList1.add("4) Discovered by : Humphry Davy ");
        arrayList1.add("5) Year discovered : 1808 ");
        arrayList1.add("6) Electron : 12");
        arrayList1.add("7) Proton : 12");
        arrayList1.add("8) Neutron : 12");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 650 C = 923.15 K");
        arrayList2.add("2) Boiling point : 1090 C = 1363.15 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : 160 W/(m K)");
        arrayList2.add("5) Thermal Expansion : 0.0000248 /K");
        arrayList2.add("6) Heat of Fusion : 8.7 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 128 kJ/mol");
        arrayList2.add("8) Young modulus : 45 GPa");
        arrayList2.add("9) Sheer modulus : 17 GPa");
        arrayList2.add("10 Bulk modulus : 45 GPa");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 12");
        arrayList3.add("2) Atomic mass : 24.305 amu");
        arrayList3.add("3) Atomic radius : 160 pm");
        arrayList3.add("4) Van der  Waals Radius : 173 pm");
        arrayList3.add("5) Covalent radius : 141 pm");
        arrayList3.add("6) Oxidation State : 0, +1, +2");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 1.31 (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 0 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 737.7 kJ/mol");
        arrayList4.add("4) Valence : @");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : NA");
        arrayList5.add("2) Critical Pressure : NA");
        arrayList5.add("3) CAS number : CAS7439-95-4");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : 4600 m/s");
        arrayList5.add("6) Magnetic Type : Paramagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Simple Hexagonal");
        arrayList6.add("2) Debye temperature : 318 K");
        arrayList6.add("3) Lattice Constants : 320.94, 320.94, 521.08 pm");
        arrayList6.add("4) Space group number : 194");
        arrayList6.add("5) Lattice angles : 90,90,120 (degree)");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable");
        arrayList7.add("2) Lifetime : Stable");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : 0.0001 ");
        arrayList7.add("5) Neutron cross section : 0.063");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);


    }
}
