package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sport extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "#sports #sport #football #fitness #basketball #nfl #nba #training #soccer #gym #workout #baseball #motivation #athlete #follow #sportsphotography #mlb #love #hockey #instagood #fashion #photography #fit #fun #like #running #cricket #instagram";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport); getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sport");



        textView = findViewById(R.id.textView153);
        textView.setText(Tags);

        copy = findViewById(R.id.copy);
        ig = findViewById(R.id.ig);
        fb = findViewById(R.id.fb);
        twitter = findViewById(R.id.tw);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });
    }
}