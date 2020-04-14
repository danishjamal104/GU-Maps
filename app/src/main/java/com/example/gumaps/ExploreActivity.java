package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity {

    View toolBar;
    View overlay;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        toolBar = findViewById(R.id.exploreActivity_toolBar);
        overlay = findViewById(R.id.exploreActivity_overlay);

        ((TextView)(toolBar).findViewById(R.id.appBarLayout_title_textView)).setText("Explore");

        (overlay.findViewById(R.id.scanOverlay_imageView)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                overlay.setVisibility(View.GONE);
                toolBar.setVisibility(View.VISIBLE);
                showMap();
            }
        });

        (toolBar.findViewById(R.id.appBarLayout_back_imageButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });




    }

    void showMap(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.map_layout);
        dialog.getWindow().setLayout(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }
}
