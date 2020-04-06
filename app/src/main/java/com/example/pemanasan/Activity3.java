package com.example.pemanasan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {

    Button btn;
    EditText et;
    String st;

    //Tanggal pengerjaan : 04 April 2020
    //NIM Nama Kelas : 10117170 - Mohamad Imran - IF5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btn = findViewById(R.id.button4);
        et = findViewById(R.id.TextNama);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Activity3.this,Activity4.class);
                st=et.getText().toString();
                i.putExtra("Value",st);
                startActivity(i);
                finish();

            }
        });
    }

}
