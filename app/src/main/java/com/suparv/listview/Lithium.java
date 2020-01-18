package com.suparv.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Lithium extends AppCompatActivity {


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
        setContentView(R.layout.activity_lithium);


        listView1 = findViewById(R.id.list1);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1) Latin name : Lithium");
        arrayList1.add("2) English name : Lithium");
        arrayList1.add("3) Colour : Silver");
        arrayList1.add("4) Discovered by : John August");
        arrayList1.add("5) Year discovered : 1817");
        arrayList1.add("6) Electron : 3");
        arrayList1.add("7) Proton : 3");
        arrayList1.add("8) Neutron : 4 ");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 180.54 C = 453.65 K");
        arrayList2.add("2) Boiling point : 1342.0 C = 1615.15 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : 85 W/(m K)");
        arrayList2.add("5) Thermal Expansion : 0.000046 /K");
        arrayList2.add("6) Heat of Fusion : 3 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 147 kJ/mol");
        arrayList2.add("8) Young modulus : 4.9 GPa");
        arrayList2.add("9) Sheer modulus : 4.2 GPa");
        arrayList2.add("10 Bulk modulus : 11 GPa");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 3");
        arrayList3.add("2) Atomic mass : 6.94 amu");
        arrayList3.add("3) Atomic radius : 167 pm");
        arrayList3.add("4) Van der  Waals Radius : 182 pm");
        arrayList3.add("5) Covalent radius : 128 pm");
        arrayList3.add("6) Ionisation Potential : 5.37 eV");
        arrayList3.add("7) Oxidation State : +1");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 0.98 (Pauling Scale)");
        arrayList4.add("2) Electron Affinity : 59.6 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 520.2 kJ/mol");
        arrayList4.add("4) Valence : 1");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : 3223 K");
        arrayList5.add("2) Critical Pressure : 67 MPa");
        arrayList5.add("3) CAS number : CAS7439-93-2");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : 6000 m/s");
        arrayList5.add("6) Magnetic Type : Paramagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure :  Body Centered Cubic ");
        arrayList6.add("2) Grid Parameters : a=3.780 A, c=6.167 A");
        //arrayList6.add("3) Debye temperature : -163.15 C = 110K");
        arrayList6.add("4) Lattice Constants : 351, 351, 351 pm");
        arrayList6.add("5) Space group number : 229");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable");
        arrayList7.add("2) Lifetime : Stable");
        arrayList7.add("3) Decay mode : NA");
        arrayList7.add("4) Neutron mass absorption : NA ");
        arrayList7.add("5) Neutron cross section : 71");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);

    }

}
