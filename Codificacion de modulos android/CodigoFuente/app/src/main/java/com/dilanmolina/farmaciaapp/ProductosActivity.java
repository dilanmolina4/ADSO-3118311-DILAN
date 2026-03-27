package com.dilanmolina.farmaciaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductosActivity extends AppCompatActivity {

    EditText nombre, stock;
    Button agregar;
    ListView lista;

    ArrayList<String> productos;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        nombre = findViewById(R.id.etNombre);
        stock = findViewById(R.id.etStock);
        agregar = findViewById(R.id.btnAgregar);
        lista = findViewById(R.id.listProductos);

        productos = new ArrayList<>();

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                productos
        );

        lista.setAdapter(adapter);

        agregar.setOnClickListener(v -> {
            String n = nombre.getText().toString();
            String s = stock.getText().toString();

            productos.add(n + " - Stock: " + s);
            adapter.notifyDataSetChanged();
        });

        lista.setOnItemLongClickListener((parent, view, position, id) -> {
            productos.remove(position);
            adapter.notifyDataSetChanged();
            return true;
        });
    }
}