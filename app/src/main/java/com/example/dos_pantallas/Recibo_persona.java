package com.example.dos_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Recibo_persona extends AppCompatActivity {
    public TextView Nom2;
    public  TextView Ape2;
    public TextView Dir2;
    public TextView Ced2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo_persona);
        Nom2 = findViewById(R.id.usuario);
        String  Nomb2 = getIntent().getStringExtra("nombre");
        Ape2 = findViewById(R.id.apellido);
        String  Ape2 = getIntent().getStringExtra("apellido");
        Dir2 = findViewById(R.id.direccion);
        String  Dir2 = getIntent().getStringExtra("direccion");
        Ced2 = findViewById(R.id.cedula);
        String  Ced2= getIntent().getStringExtra("cedula");

    }
}