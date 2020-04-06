package com.example.pemanasan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

//Tanggal pengerjaan : 03 April 2020
//NIM Nama Kelas : 10117170 - Mohamad Imran - IF5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.ic_get_start_timitory);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();


            }
        });
    }
    public void OpenActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
