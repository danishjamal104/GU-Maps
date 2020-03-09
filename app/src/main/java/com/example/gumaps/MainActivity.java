package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView exploreIconImageView;
    Button foodCourtButton;
    Button facultyDeskButton;
    Button clubInfoButton;
    Button eventsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUp();

    }

    void setUp() {
        //getting views by their ids
        exploreIconImageView = findViewById(R.id.mainActivity_icon_imageView);
        foodCourtButton = findViewById(R.id.mainActivity_foodCourt_button);
        facultyDeskButton = findViewById(R.id.mainActivity__facultyDesk_button);
        clubInfoButton = findViewById(R.id.mainActivity_clubInfo_button);
        eventsButton = findViewById(R.id.mainActivity_events_button);


        //setting onclick for all buttons
        exploreIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchIntent(ExploreActivity.class);
            }
        });

        foodCourtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchIntent(FoodCourtActivity.class);
            }
        });

        facultyDeskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchIntent(FacultyDeskActivity.class);
            }
        });

        clubInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchIntent(ClubInfoActivity.class);
            }
        });

        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchIntent(EventsActivity.class);
            }
        });

    }

    void launchIntent(Class activityClass){
        startActivity(new Intent(MainActivity.this, activityClass));
    }
}
