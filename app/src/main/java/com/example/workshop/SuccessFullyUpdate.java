package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessFullyUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_fully_update);
    }

    public void fnDoneUpdate(View view) {
        Intent intent = new Intent(getApplicationContext(),ViewVisitor.class);
        startActivity(intent);
    }
}