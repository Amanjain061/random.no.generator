package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText edittxt;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        edittxt=findViewById(R.id.Edittext);
        txt=findViewById(R.id.textView);
        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = edittxt.getText().toString();
                Intent i =new Intent(getApplicationContext(),secondview.class);
                i.putExtra("name",Username);
                startActivity(i);
            }
        });
    }
}