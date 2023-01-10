package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void fnVisitorRegisteration(View view) {
        Intent intent = new Intent(getApplicationContext(), AddVisitor.class);
        startActivity(intent);

    }

    public void fnEditView(View view) {
        Intent intent = new Intent(getApplicationContext(), ViewVisitor.class);
        startActivity(intent);
    }
}