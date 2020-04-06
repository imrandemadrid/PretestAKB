package com.example.pemanasan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

TextView tv;
String st;
Button buttonexit;

    //Tanggal pengerjaan : 04 April 2020
    //NIM Nama Kelas : 10117170 - Mohamad Imran - IF5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        tv = findViewById(R.id.textViewNama);
        st = getIntent().getExtras().getString("Value");
        tv.setText(st);

        buttonexit = (Button) findViewById(R.id.buttonexit);
        buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });

    }
}
