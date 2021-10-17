package com.example.projetosupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projetosupermarket.R;

public class ActivityHomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void irListItens(View view){
        Intent intent = new Intent(this, ActivityItemList.class);
        startActivity(intent);
    }
}