package com.example.triznylarasati.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Array dari strings
    ListView simpleList;
    String hewanList[] = {"Kucing", "Kelinci", "Kuda", "Ikan", "Kura-kura", "Burung", "Semut", "Cicak"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, hewanList);
        simpleList.setAdapter(arrayAdapter);
    }
}
