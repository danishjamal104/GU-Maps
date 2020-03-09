package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class FacultyDeskActivity extends AppCompatActivity {

    View appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_desk);

        setUp();
    }

    private void setUp() {
        appBarLayout = findViewById(R.id.facultyDesk_appBarLayout);

        ((TextView) appBarLayout.findViewById(R.id.appBarLayout_title_textView)).setText("Faculty Desk");

        ((ImageButton) appBarLayout.findViewById(R.id.appBarLayout_back_imageButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
