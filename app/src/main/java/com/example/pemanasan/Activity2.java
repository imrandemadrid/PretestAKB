package com.example.pemanasan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private Button button2;

    //Tanggal pengerjaan : 04 April 2020
    //NIM Nama Kelas : 10117170 - Mohamad Imran - IF5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity3();
            }

        });
    }

    public void OpenActivity3() {
        Intent intent2 = new Intent(this, Activity3.class);
        startActivity(intent2);
    }
}