package com.dilanmolina.farmaciaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button productos, citas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productos = findViewById(R.id.btnProductos);
        citas = findViewById(R.id.btnCitas);

        productos.setOnClickListener(v -> {
            startActivity(new Intent(this, ProductosActivity.class));
        });

        citas.setOnClickListener(v -> {
            startActivity(new Intent(this, CitasActivity.class));
        });
    }
}