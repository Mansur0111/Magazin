package com.example.magazin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
DrawerLayout drawerLayout;
String a="";
int b=7;
int c=007;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageviewmenu);
        drawerLayout=findViewById(R.id.drawerlayout);
        imageView.setOnClickListener(view -> {
            drawerLayout.openDrawer(Gravity.LEFT);
        });
    }
}