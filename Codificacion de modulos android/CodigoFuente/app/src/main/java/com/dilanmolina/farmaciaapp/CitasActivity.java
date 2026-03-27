package com.dilanmolina.farmaciaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class CitasActivity extends AppCompatActivity {

    EditText fecha, hora;
    Button agregar;
    ListView lista;

    ArrayList<String> citas;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        fecha = findViewById(R.id.etFecha);
        hora = findViewById(R.id.etHora);
        agregar = findViewById(R.id.btnAgregarCita);
        lista = findViewById(R.id.listCitas);

        citas = new ArrayList<>();

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                citas
        );

        lista.setAdapter(adapter);

        agregar.setOnClickListener(v -> {
            String f = fecha.getText().toString();
            String h = hora.getText().toString();

            citas.add("Fecha: " + f + " Hora: " + h);
            adapter.notifyDataSetChanged();
        });

        lista.setOnItemLongClickListener((parent, view, position, id) -> {
            citas.remove(position);
            adapter.notifyDataSetChanged();
            return true;
        });
    }
}