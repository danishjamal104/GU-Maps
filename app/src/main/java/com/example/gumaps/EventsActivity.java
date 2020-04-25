package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.gumaps.adapter.EventImageAdapter;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    View appBarLayout;

    RecyclerView recyclerView;
    EventImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        setUp();
    }

    private void setUp() {
        appBarLayout = findViewById(R.id.events_appBarLayout);
        recyclerView = findViewById(R.id.events_activity_recyclerView);

        ((TextView) appBarLayout.findViewById(R.id.appBarLayout_title_textView)).setText("Faculty Desk");

        ((ImageButton) appBarLayout.findViewById(R.id.appBarLayout_back_imageButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        adapter = new EventImageAdapter(new ArrayList<Integer>());
        adapter.add(R.drawable.event_1);
        adapter.add(R.drawable.event_2);
        adapter.add(R.drawable.event_3);
        adapter.add(R.drawable.event_4);
        adapter.add(R.drawable.event_5);
        adapter.add(R.drawable.event_1);
        adapter.add(R.drawable.event_2);
        adapter.add(R.drawable.event_3);
        adapter.add(R.drawable.event_4);
        adapter.add(R.drawable.event_5);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);

        recyclerView.setAdapter(adapter);



    }
}
