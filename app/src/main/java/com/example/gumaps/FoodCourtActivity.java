package com.example.gumaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FoodCourtActivity extends AppCompatActivity {

    ImageButton backImageButton;

    Button theAddaButton;
    Button cafeWoodzyButton;
    Button kathiJunctionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_court);

        setUp();
    }

    void setUp() {
        // getting views by their ids
        backImageButton = findViewById(R.id.appBarLayout_back_imageButton);
        theAddaButton = findViewById(R.id.foodCourtActivity_theAdda_button);
        cafeWoodzyButton = findViewById(R.id.foodCourtActivity_cafeWoodzy_button);
        kathiJunctionButton = findViewById(R.id.foodCourtActivity_kaathiJunction_button);

        // setting onClick
        backImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    void launchIntent(Class activityClass){
        startActivity(new Intent(FoodCourtActivity.this, activityClass));
    }
}
