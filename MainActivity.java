package com.example.college;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean toggled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate invoked");

        Button button = findViewById(R.id.button);
        TextView text = findViewById(R.id.text);



        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                toggled = !toggled;
                if (toggled) {
                    text.setText("You don't listen");
                } else {
                    text.setText("Keep it this way");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume invoked");
    }
}