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
        arrayList1.add("4) Discovered by : Charles Hatchett ");
        arrayList1.add("5) Year discovered : 1801 ");
        arrayList1.add("6) Electron : 41");
        arrayList1.add("7) Proton : 41");
        arrayList1.add("8) Neutron : 52");


        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(arrayAdapter1);




        listView2 = findViewById(R.id.list2);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1) Melting point : 2477.0 C = 2750.15 K");
        arrayList2.add("2) Boiling point : 4927 C = 5200.15 K");
        arrayList2.add("3) Phase at STP : Solid");
        arrayList2.add("4) Thermal conductivity : 54 W/(m K)");
        arrayList2.add("5) Thermal Expansion : 0.0000073 /K");
        arrayList2.add("6) Heat of Fusion : 26.8 kJ/mol");
        arrayList2.add("7) Heat of vapourisation : 690 kJ/mol");
        arrayList2.add("8) Young modulus : 105 GPa");
        arrayList2.add("9) Sheer modulus : 38 GPa ");
        arrayList2.add("10 Bulk modulus :  170 Gpa");

        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(arrayAdapter2);



        listView3 = findViewById(R.id.list3);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("1) Atomic number : 41");
        arrayList3.add("2) Atomic mass : 92.96 amu");
        arrayList3.add("3) Atomic radius : 146 pm");
        arrayList3.add("4) Van der  Waals Radius : NA");
        arrayList3.add("5) Covalent radius : 137 pm ");
        arrayList3.add("6) Oxidation State : -1,+2,+3,+4,+5");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList3);
        listView3.setAdapter(arrayAdapter3);


        listView4 = findViewById(R.id.list4);
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("1) Electronegativity : 1.6");
        arrayList4.add("2) Electron Affinity : 86.1 kJ/mol");
        arrayList4.add("3) Ionistation Energy : 652.1 kJ/mol");
        arrayList4.add("4) Valence : 5");

        ArrayAdapter arrayAdapter4  =new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList4);
        listView4.setAdapter(arrayAdapter4);

        listView5=findViewById(R.id.list5);
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("1) Critical Temperature : NA");
        arrayList5.add("2) Critical Pressure : NA");
        arrayList5.add("3) CAS number : CAS7440-03-1");
        arrayList5.add("4) Refractive Index : NA");
        arrayList5.add("5) Speed of Sound : 3480 m/s");
        arrayList5.add("6) Magnetic Type : Paramagnetic");

        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList5);
        listView5.setAdapter(arrayAdapter5);


        listView6 = findViewById(R.id.list6);
        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("1) Crystal structure : Body-centered Cubic");
        arrayList6.add("2) Debye temperature :275 K");
        arrayList6.add("3) Lattice Constants : 330.04, 330.04, 330.04 pm");
        arrayList6.add("4) Space group number : 229");
        arrayList6.add("5) Lattice angles : π/2, π/2, π/2)");


        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList6);
        listView6.setAdapter(arrayAdapter6);


        listView7 = findViewById(R.id.list7);
        ArrayList<String> arrayList7 = new ArrayList<>();
        arrayList7.add("1) Half life : Stable ");
        arrayList7.add("2) Lifetime : Stable");
        arrayList7.add("3) Decay mode : NA ");
        arrayList7.add("4) Neutron mass absorption : 0.0004");
        arrayList7.add("5) Neutron cross section : 1.15");

        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList7);
        listView7.setAdapter(arrayAdapter7);

    }
}
