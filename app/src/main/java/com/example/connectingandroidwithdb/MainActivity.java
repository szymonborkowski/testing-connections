package com.example.connectingandroidwithdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView results;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.button);

        results = findViewById(R.id.textView);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // This method runs when the button is pressed.

                // Insert MySQL command or command to send message to Raspberry Pi here...

                // Retrieve results from database or raspberry pi
                String receivedResults = "received";

                //Updates the TextView (text-box) to the received results
                results.setText(receivedResults);
            }
        });
    }
}