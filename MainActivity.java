package com.example.noradalilk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // هذا كود ربط صفحة الMain مع صفحة الديزاين Layout


    }
    public void clubnext(android.view.View v){
        Intent intent = new Intent(MainActivity.this,ClubAccount.class);
        startActivity(intent);
    }
}
