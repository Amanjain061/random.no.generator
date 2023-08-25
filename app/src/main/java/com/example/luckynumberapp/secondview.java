package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class secondview extends AppCompatActivity {
    TextView welcomeTxt, luckynumber;
    Button share_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondview);
        welcomeTxt=findViewById(R.id.textView2);
        luckynumber=findViewById(R.id.textView3);
        share_btn=findViewById(R.id.button2);
        Intent i=getIntent();
        String username=i.getStringExtra("name");
        int randomnum=randomno();
        luckynumber.setText(""+randomnum);
        share_btn.setOnClickListener(view -> shareData(username,randomnum));

    }
    public int randomno(){
        Random random = new Random();
        int upper=1000;
        int randomnumbergenerate=random.nextInt(upper);
        return randomnumbergenerate;
    }
    public void shareData(String username, int randomnum){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,username+"got lucky today");
        i.putExtra(Intent.EXTRA_TEXT,"his lucky number is "+randomnum);
        startActivity(Intent.createChooser(i,"choose a Platform"));

    }

}