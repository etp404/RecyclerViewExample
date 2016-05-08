package com.example.matt.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> valueStrings = new ArrayList<String>() {{
            for (int i=0;i<1000;i++) {
                add(String.format(Locale.UK, "List item %d", i));
            }
        }};

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        MattAdapter adapter = new MattAdapter(getApplicationContext(), valueStrings);
        recyclerView.setAdapter(adapter);
    }
}
