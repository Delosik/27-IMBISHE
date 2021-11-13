package com.example.a27_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(() -> {

            try {
Thread.sleep(4000);
            }catch (Exception e) {
e.printStackTrace();
        }finally {
                startActivity(new Intent (MainActivity.this, MainActivity2.class));
            }
    });
        thread.start();
}}