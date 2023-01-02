package com.example.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessfullyDeleted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfully_deleted_visitor);
    }

    public void fnDoneDelete(View view) {
        Intent intent = new Intent(getApplicationContext(), ViewVisitor.class);
        startActivity(intent);
    }
}