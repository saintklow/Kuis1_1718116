package com.example.kuis_1_1718116;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private family_adapter adapter;
    private ArrayList<family> familyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new family_adapter(familyArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        familyArrayList = new ArrayList<>();
        familyArrayList.add(new family("Rizal Efendi", "Bapak", getDrawable(R.drawable.bapak)));
        familyArrayList.add(new family("Suyati", "Ibu", getDrawable(R.drawable.ibu)));
        familyArrayList.add(new family("Ferdian Maulana", "Saya", getDrawable(R.drawable.aku)));
    }
}
