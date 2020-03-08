package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity {

    View toolBar;
    View overlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        toolBar = findViewById(R.id.exploreActivity_toolBar);
        overlay = findViewById(R.id.exploreActivity_overlay);

        ((TextView)(toolBar).findViewById(R.id.appBarLayout_title_textView)).setText("Explore");

        (new Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                toolBar.setVisibility(View.VISIBLE);
                overlay.setVisibility(View.GONE);
            }
        }, 2000);
    }
}
