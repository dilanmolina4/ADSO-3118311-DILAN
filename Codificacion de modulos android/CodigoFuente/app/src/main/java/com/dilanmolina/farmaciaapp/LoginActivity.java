package com.dilanmolina.farmaciaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText usuario, password;
    Spinner rol;
    Button login;
    TextView registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = findViewById(R.id.etUsuario);
        password = findViewById(R.id.etPassword);
        rol = findViewById(R.id.spRol);
        login = findViewById(R.id.btnLogin);
        registrar = findViewById(R.id.tvRegistrar);

        // Roles disponibles
        String[] roles = {"Empleado", "Cliente"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                roles
        );

        rol.setAdapter(adapter);

        // BOTON LOGIN
        login.setOnClickListener(v -> {

            String user = usuario.getText().toString();
            String pass = password.getText().toString();
            String tipo = rol.getSelectedItem().toString();

            // Aquí luego conectaremos API
            if(!user.isEmpty() && !pass.isEmpty()){

                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("ROL", tipo);
                startActivity(intent);

            }

        });

        // IR A REGISTRAR
        registrar.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });

    }
}