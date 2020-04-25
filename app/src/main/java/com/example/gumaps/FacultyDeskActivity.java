package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.gumaps.adapter.FacultyAdapter;
import com.example.gumaps.model.Faculty;

import java.util.ArrayList;

public class FacultyDeskActivity extends AppCompatActivity {

    View appBarLayout;

    RecyclerView recyclerView;
    FacultyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_desk);

        setUp();
    }

    private void setUp() {
        appBarLayout = findViewById(R.id.facultyDesk_appBarLayout);
        recyclerView = findViewById(R.id.facultyDesk_activity_recyclerView);

        ((TextView) appBarLayout.findViewById(R.id.appBarLayout_title_textView)).setText("Faculty Desk");

        ((ImageButton) appBarLayout.findViewById(R.id.appBarLayout_back_imageButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        adapter = new FacultyAdapter(new ArrayList<Faculty>());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(adapter);

        adapter.add(new Faculty("Rajesh", "BCSE2011", "C301"));
        adapter.add(new Faculty("Sudeep Yadav", "BCSE3072", "C329"));
        adapter.add(new Faculty("Himanshu Pundir", "BCSE9010", "A029"));
        adapter.add(new Faculty("S Deepica", "BCSE3071", "C307"));
        adapter.add(new Faculty("Shikha Pant", "SLBT2022", "C039"));
        adapter.add(new Faculty("Rajesh Kumar D", "BCSE2014", "C429"));
        adapter.add(new Faculty("Jerald Kumar", "BCSE2010", "A209"));
        adapter.add(new Faculty("B.P. Singh", "MATH2003", "A020"));
        adapter.add(new Faculty("Pratyush Deka", "BCSE3095", "C327"));
        adapter.add(new Faculty("K. Baalamurgan", "CSIOT2004", "A329"));

    }
}
