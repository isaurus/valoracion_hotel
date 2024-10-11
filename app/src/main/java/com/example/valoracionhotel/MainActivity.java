package com.example.valoracionhotel;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaración de RatingBar
    RatingBar rbPersonal, rbInstalaciones, rbServicios, rbLimpieza, rbConfort, rbCalidadPrecio, rbUbicacion;

    // Declaración de TextView para las valoraciones
    TextView txtValoracionPersonal;
    TextView txtValoracionInstalaciones;
    TextView txtValoracionServicios;
    TextView txtValoracionLimpieza;
    TextView txtValoracionConfort;
    TextView txtValoracionCalidadPrecio;
    TextView txtValoracionUbicacion;

    // Declaración de TextView para la valoración media
    TextView txtValoracionMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancia de RatingBar
        rbPersonal = findViewById(R.id.rbPersonal);
        rbInstalaciones = findViewById(R.id.rbInstalaciones);
        rbServicios = findViewById(R.id.rbServicios);
        rbLimpieza = findViewById(R.id.rbLimpieza);
        rbConfort = findViewById(R.id.rbConfort);
        rbCalidadPrecio = findViewById(R.id.rbCalidadPrecio);
        rbUbicacion = findViewById(R.id.rbUbicacion);

        // Instancia de TextView para las valoraciones
        txtValoracionPersonal = findViewById(R.id.txtValoracionPersonal);
        txtValoracionInstalaciones = findViewById(R.id.txtValoracionInstalaciones);
        txtValoracionServicios = findViewById(R.id.txtValoracionServicios);
        txtValoracionLimpieza = findViewById(R.id.txtValoracionLimpieza);
        txtValoracionConfort = findViewById(R.id.txtValoracionConfort);
        txtValoracionCalidadPrecio = findViewById(R.id.txtValoracionCalidadPrecio);
        txtValoracionUbicacion = findViewById(R.id.txtValoracionUbicacion);


    }
}