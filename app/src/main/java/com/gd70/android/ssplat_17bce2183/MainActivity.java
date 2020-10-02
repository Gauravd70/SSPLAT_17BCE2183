package com.gd70.android.ssplat_17bce2183;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleTextView=findViewById(R.id.title_text_view);
        TextView descriptionTextView=findViewById(R.id.description_text_view);

        titleTextView.setText(R.string.title);
        descriptionTextView.setText(R.string.description);
    }
}