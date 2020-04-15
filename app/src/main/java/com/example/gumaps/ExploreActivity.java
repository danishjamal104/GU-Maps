package com.example.gumaps;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

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
                /*IntentIntegrator integrator = new IntentIntegrator(ExploreActivity.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setTimeout(20000);
                integrator.setPrompt("Scan a Qr Code");
                integrator.setOrientationLocked(true);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(true);
                integrator.initiateScan();*/
            }
        });

        (toolBar.findViewById(R.id.appBarLayout_back_imageButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                showMap();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    void showMap(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.map_layout);
        dialog.getWindow().setLayout(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }
}
