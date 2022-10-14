package com.example.dos_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public EditText Nom;
    public EditText Ape;
    public EditText Dir;
    public EditText Ced;
    public EditText Cre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nom = findViewById(R.id.Nombre);
        Ape = findViewById(R.id.Apellido);
        Dir = findViewById(R.id.Direccion);
        Ced = findViewById(R.id.Cedula);
        Cre = findViewById(R.id.Credito);
    }
    public void segunda_pantalla(View view){
        Intent c = new Intent(this,Recibo_persona.class);
        c.putExtra("nombre",Nom.getText().toString());
        c.putExtra("apellido",Ape.getText().toString());
        c.putExtra("direccion",Dir.getText().toString());
        c.putExtra("cedula",Ced.getText().toString());
        c.putExtra("credito",Cre.getText().toString());
        startActivity(c);


    }
}