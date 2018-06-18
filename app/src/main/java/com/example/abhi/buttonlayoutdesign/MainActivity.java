package com.example.abhi.buttonlayoutdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DaysData> dayData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayData = fill_with_data();
        recyclerView = findViewById(R.id.recyclerview);
        DaysDataAdapter adapter = new DaysDataAdapter(dayData, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<DaysData> fill_with_data() {
        List<DaysData> data = new ArrayList<>();
        for(int i=1;i<=30;i++) {
            data.add(new DaysData("Day "+i,i));
        }
        return data;
    }
}
